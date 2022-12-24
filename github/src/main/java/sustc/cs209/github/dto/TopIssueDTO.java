package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TopIssueDTO {


    private Integer display_id;
    private String created_at;
    private Long duration;


}
