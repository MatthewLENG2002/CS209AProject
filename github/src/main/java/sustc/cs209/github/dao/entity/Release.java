package sustc.cs209.github.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@TableName("t_ds_release")
public class Release {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("repo")
    private Integer repoId;

    @TableField("display")
    private Integer release_id;

    @TableField("tag")
    private String tag;

    @TableField("createat")
    private Long createat;
}
