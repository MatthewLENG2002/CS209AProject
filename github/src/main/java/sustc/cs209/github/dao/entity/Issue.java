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
@TableName("t_ds_issue")
public class Issue {

    @TableId(value = "id")
    private String id;

    @TableField("repo")
    private Integer repoId;

    @TableField("display")
    private Integer display;

    @TableField("title")
    private String title;

    @TableField("description")
    private String description;

    @TableField("comments")
    private String comments;

    @TableField("closed")
    private Boolean closed;

    @TableField("createat")
    private Long createat;

    @TableField("close")
    private Long close;

    public Long getDuration() {
        if (closed)
            return close - createat;
        else
            return -1L;
    }
}
