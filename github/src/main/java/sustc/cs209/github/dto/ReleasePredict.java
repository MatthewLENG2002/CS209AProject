package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ReleasePredict {

    String release;
    Long start;
    Long end;
    Integer commits;
    String startString;
    String endString;
    Double progress;


    public ReleasePredict(String _release, Long _end) {
        this.release = _release;
        this.end = _end;
        this.commits = 0;
    }

    public ReleasePredict(String _release) {
        this.release = _release;
        this.commits = 0;
    }

    public Long getDuration() {
        return (end - start)/3600000;
    }

}
