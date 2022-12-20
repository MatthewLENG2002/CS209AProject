package sustc.cs209.github.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import sustc.cs209.github.dao.entity.Commit;

@Mapper
public interface CommitMapper extends BaseMapper<Commit> {

}
