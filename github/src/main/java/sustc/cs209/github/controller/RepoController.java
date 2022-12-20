package sustc.cs209.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sustc.cs209.github.dao.entity.Repository;
import sustc.cs209.github.dao.entity.User;
import sustc.cs209.github.dao.mapper.RepositoryMapper;
import sustc.cs209.github.dto.CommitsStat;
import sustc.cs209.github.dto.IssueDTO;
import sustc.cs209.github.dto.IssueResolutionDTO;
import sustc.cs209.github.dto.ReleaseStat;
import sustc.cs209.github.service.RepositoryService;
import sustc.cs209.github.service.impl.RepositoryServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/repo")
public class RepoController {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RepositoryMapper repositoryMapper;

    @CrossOrigin
    @GetMapping("/list")
    @ResponseBody
    public List<Repository> getRepoList() {
        return repositoryMapper.getRepos();
    }

    @CrossOrigin
    @GetMapping("/get_developer_count")
    @ResponseBody
    public int getDeveloperCount(@RequestParam Integer id) {
        return repositoryService.getDeveloperCount(id);
    }

    @CrossOrigin
    @GetMapping("/get_open_issue_cnt")
    @ResponseBody
    public int getOpenIssueCount(@RequestParam Integer id) {
        return repositoryService.getOpenIssueCount(id);
    }

    @CrossOrigin
    @GetMapping("/get_closed_issue_cnt")
    @ResponseBody
    public int getClosedIssueCount(@RequestParam Integer id) {
        return repositoryService.getClosedIssueCount(id);
    }

    @CrossOrigin
    @GetMapping("/get_release_cnt")
    @ResponseBody
    public int getReleaseCount(@RequestParam Integer id) {
        return repositoryService.getReleaseCount(id);
    }

    @CrossOrigin
    @GetMapping("/get_top_committer")
    @ResponseBody
    public List<Map.Entry<User, Integer>> getTopCommitter(@RequestParam Integer id) {
        return repositoryService.getTopCommitter(id);
    }

    @CrossOrigin
    @GetMapping("/get_issue_resolution")
    @ResponseBody
    public IssueResolutionDTO getIssueResolution(@RequestParam Integer id) {
        return repositoryService.getIssueResolution(id);
    }

    @CrossOrigin
    @GetMapping("/get_release_stats")
    @ResponseBody
    public List<ReleaseStat> getReleaseStats(@RequestParam Integer id) {
        return repositoryService.getReleaseStats(id);
    }

    @CrossOrigin
    @GetMapping("/get_commits_stats")
    @ResponseBody
    public CommitsStat getCommitsStats(@RequestParam Integer id) {
        return repositoryService.getCommitsStats(id);
    }

    @CrossOrigin
    @GetMapping("/get_issue_title_keyword")
    @ResponseBody
    public Map<String, Integer> getIssueTitleKeyWord(@RequestParam Integer id,
                                                     @RequestParam Boolean noun,
                                                     @RequestParam Integer sel) {
        return repositoryService.getIssueTitleKeyWord(id, noun, sel);
    }

    @CrossOrigin
    @GetMapping("/get_release_pred")
    @ResponseBody
    public ReleaseStat getReleasePred(Integer id) {
        return repositoryService.nextReleaseCommitCount(id);
    }

    @CrossOrigin
    @GetMapping("/get_issues")
    @ResponseBody
    public List<IssueDTO> getIssues(Integer id) {
        return repositoryService.getIssues(id);
    }

}
