package sustc.cs209.github.dao.factory;

import lombok.extern.slf4j.Slf4j;
import sustc.cs209.github.dao.entity.*;
import sustc.cs209.github.dao.entity.Commit;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dao.factory.CommitApiDto;
import sustc.cs209.github.dao.factory.ContributorApiDto;
import sustc.cs209.github.dao.factory.RepositoryApiDto;

import java.util.Objects;

@Slf4j
public class RepositoryFactory {

    public static Repository of(RepositoryApiDto rawData) {
//        log.error(String.valueOf(rawData));
        return Repository.builder()
                .id(rawData.getId())
                .name(rawData.getFullName())
                .description(rawData.getDescription())
                .build();
    }

    public static User of(ContributorApiDto rawData) {
//        log.error(String.valueOf(rawData));
        return User.builder()
                .id(rawData.getId())
                .login(rawData.getLogin())
                .avatar(rawData.getAvatar_url())
                .build();
    }

    public static Commit of(CommitApiDto rawData, Integer repoId) {
//        log.error(String.valueOf(rawData));
        return Commit.builder()
                .sha(rawData.getSha())
                .repoId(repoId)
                .htmlUrl(rawData.getHtml_url())
                .author(rawData.getAuthor().getLogin())
                .commitAt(rawData.getCommit().getAuthor().getDate().getTime())
                .build();
    }

    public static Issue of(Item rawData, Integer repoId) {
//        log.error(String.valueOf(rawData));
        return Issue.builder()
                .id(rawData.getNode_id())
                .repoId(repoId)
                .display(rawData.getNumber())
                .title(rawData.getTitle())
                .description(rawData.getBody())
                .comments(rawData.getComments_url())
                .closed(rawData.getState().equals("open") ? Boolean.FALSE : Boolean.TRUE)
                .createat(rawData.getCreated_at().getTime())
                .close(Objects.isNull(rawData.getClosed_at()) ? -1L : rawData.getClosed_at().getTime())
                .build();
    }

    public static Release of(ReleaseApiDto rawData, Integer repoId) {
//        log.error(String.valueOf(rawData));
        return Release.builder()
                .id(rawData.getId())
                .repoId(repoId)
                .release_id(rawData.getId())
                .tag(rawData.getTag_name())
                .createat(rawData.getPublished_at().getTime())
                .build();
    }
}
