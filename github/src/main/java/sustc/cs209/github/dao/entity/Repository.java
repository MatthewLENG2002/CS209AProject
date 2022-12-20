package sustc.cs209.github.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@TableName("t_ds_repository")
public class Repository {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("description")
    private String description;



//    private List<User> contributors;
//
//    private List<Issue> issues;
//
//    private List<Commit> commits;
//
//    private List<Release> releases;

}
