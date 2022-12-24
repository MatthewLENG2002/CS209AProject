package sustc.cs209.github.dao.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sustc.cs209.github.base.properties.TargetingProps;
import sustc.cs209.github.base.properties.ThridPartiesProps;
import sustc.cs209.github.dao.entity.*;
import sustc.cs209.github.dao.entity.Commit;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dao.mapper.*;
import sustc.cs209.github.service.RepositoryService;
import sustc.cs209.github.service.impl.RepositoryServiceImpl;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Slf4j
@Component
@DependsOn("flywayConfig")
public class DataPreparer {

    @Autowired
    private AsyncFetcherWrapper fetcher;

    @Autowired
    private TargetingProps targetingProps;

    @Autowired
    private RepositoryMapper repositoryMapper;

    @Autowired
    private RepositoryService repositoryService;

    @PostConstruct
    public void prepare() {
        log.info("Preparing data...");
//        targetingProps.getRepositories().parallelStream()
//                .peek(log::info)
//                .peek(repo -> {
//                    try {
//                        fetcher.fetchRepo(repo).get();
//                    } catch (InterruptedException | ExecutionException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .peek(log::info)
//                .flatMap(repo -> List.of(
//                        fetcher.fetchDeveloper(repo),
//                        fetcher.fetchCommits(repo),
//                        fetcher.fetchIssue(repo),
//                        fetcher.fetchRelease(repo)
//                ).stream())
//                .forEach(task -> {
//                    try {
//                        task.get();
//                    } catch (InterruptedException | ExecutionException e) {
//                        log.error("failure in fetching repo", e);
//                        throw new RuntimeException(e);
//                    }
//                });
    }

    @Service
    public static class AsyncFetcherWrapper {

        private static final int MAX_PAGE = 100;

        @Autowired
        private OkHttpClient httpClient;

        @Autowired
        private ObjectMapper mapper;

        @Autowired
        private RepositoryMapper repositoryMapper;

        @Autowired
        private UserMapper userMapper;

        @Autowired
        private CommitMapper commitMapper;

        @Autowired
        private IssueMapper issueMapper;

        @Autowired
        private ReleaseMapper releaseMapper;

        @Autowired
        private ThridPartiesProps thridPartiesProps;

        @Async
        @SneakyThrows
        public Future<Void> fetchRepo(final String fullName) {
            if (repositoryMapper.exists(fullName)) {
                return AsyncResult.forValue(null);
            }

            Request req = new Request.Builder()
                    .get()
                    .url("https://api.github.com/repos/" + fullName)
                    .addHeader("Authorization", thridPartiesProps.getGithub().getToken())
                    .build();

            @Cleanup Response resp = httpClient.newCall(req).execute();
            if (!resp.isSuccessful()) {
                throw new IOException("unsuccessful api fetch: " + fullName);
            }

            var respDto = mapper.readValue(Objects.requireNonNull(resp.body()).byteStream(), RepositoryApiDto.class);
            log.info("{}", respDto);
            Repository repo = RepositoryFactory.of(respDto);
            repositoryMapper.insert(repo);

            return AsyncResult.forValue(null);
        }

        @Async
        @SneakyThrows
        public Future<Void> fetchDeveloper(final String fullName) {
            Integer repoId = repositoryMapper.getRepo(fullName);
            log.info("fetching developer for {}", fullName);
            int page = 1;
            while (page <= MAX_PAGE) {
                Request req = new Request.Builder()
                        .get()
                        .url("https://api.github.com/repos/" + fullName + "/contributors?per_page=100&page=" + page)
                        .addHeader("Authorization", thridPartiesProps.getGithub().getToken())
                        .addHeader("accept", "application/vnd.github+json")
                        .build();

                @Cleanup Response resp = httpClient.newCall(req).execute();
                if (!resp.isSuccessful()) {
                    resp = httpClient.newCall(req).execute();
//                    throw new IOException("unsuccessful api fetch: " + fullName);
                }

                var respDto = mapper.readValue(Objects.requireNonNull(resp.body()).byteStream(), ContributorApiDto[].class);
                if (respDto.length == 0) {
                    break;
                }
                page++;
                for (int i = 0; i < respDto.length; i++) {
                    try {
                        log.info("{}", respDto[i]);
                        User user = RepositoryFactory.of(respDto[i]);
                        userMapper.insert(user);
                        userMapper.addContributor(repoId, user.getId());
                    } catch (Exception e) {
                        log.error("error developer", e);
                    }
                }
            }
            return AsyncResult.forValue(null);
        }

        @Async
        @SneakyThrows
        public Future<Void> fetchCommits(final String fullname) {
            Integer repoId = repositoryMapper.getRepo(fullname);
            int page = 1;
            while (page <= MAX_PAGE) {
                log.info("fetching commits for {}", fullname);
                Request req = new Request.Builder()
                        .get()
                        .url("https://api.github.com/repos/" + fullname + "/commits?per_page=100&page=" + page)
                        .addHeader("Authorization", thridPartiesProps.getGithub().getToken())
                        .build();

                @Cleanup Response resp = httpClient.newCall(req).execute();
                if (!resp.isSuccessful()) {
                    resp = httpClient.newCall(req).execute();
//                    throw new IOException("unsuccessful api fetch commits");
                }
                var respDto = mapper.readValue(Objects.requireNonNull(resp.body()).byteStream(), CommitApiDto[].class);
                if (respDto.length == 0) {
                    break;
                }
                page++;
                for (int i = 0; i < respDto.length; i++) {
                    try {
                        log.info("{}", respDto[i]);
                        if (!Objects.isNull(respDto[i].getAuthor())) {
                            Commit commit = RepositoryFactory.of(respDto[i], repoId);
                            commitMapper.insert(commit);
                        }
                    } catch (Exception e) {
                        log.error("error author", e);
                    }
                }
            }
            return AsyncResult.forValue(null);
        }

        @Async
        @SneakyThrows
        public Future<Void> fetchIssue(final String fullname) {
            Integer repoId = repositoryMapper.getRepo(fullname);
            log.info("fetching issue for {}", fullname);
            int page = 1;
            while (page <= MAX_PAGE) {
                Request req = new Request.Builder()
                        .get()
                        .url("https://api.github.com/search/issues?q=repo:" + fullname +"%20is:issue&state=all&per_page=100&page=" + page)
                        .addHeader("Authorization", thridPartiesProps.getGithub().getToken())
                        .build();

                @Cleanup Response resp = httpClient.newCall(req).execute();
                if (!resp.isSuccessful()) {
//                    Thread.sleep(10000);
                    resp = httpClient.newCall(req).execute();
//                    throw new IOException("unsuccessful api fetch issue ");
                }
//                log.info("get page No." + page);
                var respDto = mapper.readValue(Objects.requireNonNull(resp.body()).byteStream(), IssueApiDto.class);
                var respDtoItems = respDto.getItems();
                if (Objects.isNull(respDtoItems) || respDtoItems.size() == 0) {
                    break;
                }
//                log.info("page " + page + " total size " + respDtoItems.size());
                page++;
                for (int i = 0; i < respDtoItems.size(); i++) {
                    try {
                        log.info("{}", respDtoItems.get(i));
                        Issue issue = RepositoryFactory.of(respDtoItems.get(i), repoId);
                        issueMapper.insert(issue);
                    } catch (Exception e) {
                        log.error("error issue", e);
                    }
                }
            }
            return AsyncResult.forValue(null);
        }

        @Async
        @SneakyThrows
        public Future<Void> fetchRelease(final String fullname) {
            Integer repoId = repositoryMapper.getRepo(fullname);
            log.info("fetching release for {}", fullname);
            int page = 1;
            while (page <= MAX_PAGE) {
                Request req = new Request.Builder()
                        .get()
                        .url("https://api.github.com/repos/" + fullname + "/releases?per_page=100&page=" + page)
                        .addHeader("Authorization", thridPartiesProps.getGithub().getToken())
                        .build();

                @Cleanup Response resp = httpClient.newCall(req).execute();
                if (!resp.isSuccessful()) {
                    resp = httpClient.newCall(req).execute();
//                    throw new IOException("unsuccessful api fetch release");
                }
                var respDto = mapper.readValue(Objects.requireNonNull(resp.body()).byteStream(), ReleaseApiDto[].class);
                if (respDto.length == 0) {
                    break;
                }
                page++;
                for (int i = 0; i < respDto.length; i++) {
                    log.info("{}", respDto[i]);
                    Release release = RepositoryFactory.of(respDto[i], repoId);
                    releaseMapper.insert(release);
                }
            }
            return AsyncResult.forValue(null);
        }
    }
}
