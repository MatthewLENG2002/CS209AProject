package sustc.cs209.github.service;

import org.springframework.stereotype.Service;
import sustc.cs209.github.dao.entity.Issue;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dto.CommitsStat;
import sustc.cs209.github.dto.IssueDTO;
import sustc.cs209.github.dto.IssueResolutionDTO;
import sustc.cs209.github.dto.ReleaseStat;

import java.util.List;
import java.util.Map;

@Service
public interface RepositoryService {

    public int getOpenIssueCount(Integer id);

    public int getClosedIssueCount(Integer id);

    public int getReleaseCount(Integer id);

    public int getDeveloperCount(Integer id);

    public List<Map.Entry<User, Integer>> getTopCommitter(Integer id);

    public IssueResolutionDTO getIssueResolution(Integer id);

    public List<ReleaseStat> getReleaseStats(Integer id);

    public CommitsStat getCommitsStats(Integer id);

    public Map<String, Integer> getIssueTitleKeyWord(Integer id, Boolean noun, Integer sel);

    public ReleaseStat nextReleaseCommitCount(Integer id);

    public List<IssueDTO> getIssues(Integer id);

}
