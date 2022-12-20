package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IssueDTO {

    private Integer display_id;
    private Long created_at;
    private Long duration;

}
