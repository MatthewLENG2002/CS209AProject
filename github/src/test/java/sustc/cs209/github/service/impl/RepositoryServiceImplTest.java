package sustc.cs209.github.service.impl;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import sustc.cs209.github.dao.entity.Commit;
import sustc.cs209.github.dao.entity.Issue;
import sustc.cs209.github.dao.entity.Repository;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dao.mapper.RepositoryMapper;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class RepositoryServiceImplTest {

    @InjectMocks
    private RepositoryServiceImpl repositoryService;

    @Spy
    private RepositoryMapper repositoryMapper;

    @Test
    void testA() {
        when(repositoryMapper.getRepos()).thenReturn(List.of());
        assertThat(repositoryMapper.getRepos()).isEmpty();
    }

    @Test
    void testIssueCount() {
        Long time = System.currentTimeMillis();
        List<Issue>  issues = List.of(
                new Issue(1, 1, 234, "body1", "open", "2020-01-01", false, time - 120981, -1l),
                new Issue(2, 1, 235, "body2", "open", "2020-01-01", true, time - 121208421, time- 2),
                new Issue(3, 1, 236, "body3", "closed", "2020-01-01", false, time - 12039124, -1l),
                new Issue(4, 1, 237, "body4", "closed", "2020-01-01", true, time- 29147, time - 234),
                new Issue(5, 1, 23508, "body5", "closed", "2020-01-01", false, time - 1280470, -1l)
        );
        when(repositoryMapper.getIssues(1)).thenReturn(issues);
        assertThat(repositoryService.getOpenIssueCount(1)).isEqualTo(3);
        assertThat(repositoryService.getClosedIssueCount(1)).isEqualTo(2);
    }

//    @Test
//    void testTopCommitter() {
//        List<Commit> commits = new ArrayList<>();
//        Long time = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            commits.add(new Commit(i, "commit" + i, i, "baidu.com", "user"+i, time - i*10000));
//        }
//        List<User> users = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            users.add(new User(i, "user"+i, "baidu.com"));
//        }
//        when(repositoryMapper.getCommits(1)).thenReturn(commits);
//        when(repositoryMapper.getUsers()).thenReturn(users);
//    }
}
