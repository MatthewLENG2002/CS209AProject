package sustc.cs209.github.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class IssueResolutionDTO {

    Double minTime;
    Double maxTime;
    Double avgTime;
    Double medianTime;
    Double Q1Time;
    Double Q3Time;
    Double varTime;

//    Date minTime;
//    Date maxTime;
//    Date avgTime;
//    Date medianTime;
//    Date Q1Time;
//    Date Q3Time;
//    Date varTime;


}
