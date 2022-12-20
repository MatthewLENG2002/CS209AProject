package sustc.cs209.github.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@TableName("t_ds_user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("login")
    private String login;

    @TableField("avatar")
    private String avatar;

}
