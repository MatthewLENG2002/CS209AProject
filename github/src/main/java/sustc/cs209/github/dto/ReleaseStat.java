package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ReleaseStat {

    String release;
    Long start;
    Long end;
    Integer commits;

    public ReleaseStat(String _release, Long _end) {
        this.release = _release;
        this.end = _end;
        this.commits = 0;
    }

    public ReleaseStat(String _release) {
        this.release = _release;
        this.commits = 0;
    }

    public Long getDuration() {
        return end - start;
    }

}
