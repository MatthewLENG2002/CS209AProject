package sustc.cs209.github.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sustc.cs209.github.dao.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * Get user by login.
     */
    User getUserByLogin(@Param("login") String login);

    void addContributor(@Param("repo_id") Integer repo_id, @Param("user_id") Integer user_id);
}
