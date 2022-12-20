package sustc.cs209.github.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.Nullable;
import sustc.cs209.github.dao.entity.*;

import java.util.List;

@Mapper
public interface RepositoryMapper extends BaseMapper<Repository> {

    /**
     * Get available repositories.
     *
     */
    List<Repository> getRepos();

    @Nullable
    Integer getRepo(@Param("name") String name);

    boolean exists(@Param("name") String name);

    /**
     * Get contributors of a repository.
     * @param id repository id
     */
    List<User> getContributors(@Param("repo_id") Integer id);

    /**
     * Get issues of a repository.
     * @param id repository id
     */
    List<Issue> getIssues(@Param("repo_id") Integer id);

    /**
     * Get commits of a repository.
     * @param id repository id
     */
    List<Commit> getCommits(@Param("repo_id") Integer id);

    /**
     * Get releases of a repository.
     * @param id repository id
     */
    List<Release> getReleases(@Param("repo_id") Integer id);

}
