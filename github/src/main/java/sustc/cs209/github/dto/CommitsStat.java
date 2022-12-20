package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommitsStat {

    Integer[][] commitsStats = new Integer[7][24];

}
