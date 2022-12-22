package sustc.cs209.github.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommiterDTO {

    private Integer id;

    private String login;

    private String avatar;

    private Integer commitCount;
}
