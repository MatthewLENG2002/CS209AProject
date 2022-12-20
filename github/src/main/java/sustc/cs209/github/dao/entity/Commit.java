package sustc.cs209.github.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName("t_ds_commit")
public class Commit {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("sha")
    private String sha;

    @TableField("repo")
    private Integer repoId;

    @TableField("html")
    private String htmlUrl;

    @TableField("author")
    private String author;

    @TableField("commit_at")
    private Long commitAt;

}
