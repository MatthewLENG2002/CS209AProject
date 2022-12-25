package sustc.cs209.github.service;

import org.springframework.stereotype.Service;
import sustc.cs209.github.dao.entity.Issue;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dto.*;

import java.util.List;
import java.util.Map;

@Service
public interface RepositoryService {

    public int getOpenIssueCount(Integer id);

    public int getClosedIssueCount(Integer id);

    public int getReleaseCount(Integer id);

    public int getDeveloperCount(Integer id);

    public List<CommiterDTO> getTopCommitter(Integer id);

    public IssueResolutionDTO getIssueResolution(Integer id);

    public List<ReleaseStat> getReleaseStats(Integer id);

    public CommitsStat getCommitsStats(Integer id);

    public List<KeywordDTO> getIssueTitleKeyWord(Integer id, Boolean noun, Integer sel);

    public ReleasePredict nextReleaseCommitCount(Integer id);

    public List<IssueDTO> getIssues(Integer id);

    public List<TopIssueDTO> getTopResolutionIssues(Integer id);

}
