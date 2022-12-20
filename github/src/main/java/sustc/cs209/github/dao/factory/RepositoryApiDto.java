package sustc.cs209.github.dao.factory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RepositoryApiDto {

    private int id;

    @JsonProperty("node_id")
    private String nodeId;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("private")
    private boolean isPrivate;

    private Owner owner;

    @JsonProperty("html_url")
    private String htmlUrl;

    private String description;

    private boolean fork;

    private String url;

    @JsonProperty("forks_url")
    private String forksUrl;

    @JsonProperty("keys_url")
    private String keysUrl;

    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;

    @JsonProperty("teams_url")
    private String teamsUrl;

    @JsonProperty("hooks_url")
    private String hooksUrl;

    @JsonProperty("issue_events_url")
    private String issueEventsUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("assignees_url")
    private String assigneesUrl;

    @JsonProperty("branches_url")
    private String branchesUrl;

    @JsonProperty("tags_url")
    private String tagsUrl;

    @JsonProperty("blobs_url")
    private String blobsUrl;

    @JsonProperty("git_tags_url")
    private String gitTagsUrl;

    @JsonProperty("git_refs_url")
    private String gitRefsUrl;

    @JsonProperty("trees_url")
    private String treesUrl;

    @JsonProperty("statuses_url")
    private String statusesUrl;

    @JsonProperty("languages_url")
    private String languagesUrl;

    @JsonProperty("stargazers_url")
    private String stargazersUrl;

    @JsonProperty("contributors_url")
    private String contributorsUrl;

    @JsonProperty("subscribers_url")
    private String subscribersUrl;

    @JsonProperty("subscription_url")
    private String subscriptionUrl;

    @JsonProperty("commits_url")
    private String commitsUrl;

    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;

    @JsonProperty("comments_url")
    private String commentsUrl;

    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;

    @JsonProperty("contents_url")
    private String contentsUrl;

    @JsonProperty("compare_url")
    private String compareUrl;

    @JsonProperty("merges_url")
    private String mergesUrl;

    @JsonProperty("archive_url")
    private String archiveUrl;

    @JsonProperty("downloads_url")
    private String downloadsUrl;

    @JsonProperty("issues_url")
    private String issuesUrl;

    @JsonProperty("pulls_url")
    private String pullsUrl;

    @JsonProperty("milestones_url")
    private String milestonesUrl;

    @JsonProperty("notifications_url")
    private String notificationsUrl;

    @JsonProperty("labels_url")
    private String labelsUrl;

    @JsonProperty("releases_url")
    private String releasesUrl;

    @JsonProperty("deployments_url")
    private String deploymentsUrl;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("pushed_at")
    private Date pushedAt;

    @JsonProperty("git_url")
    private String gitUrl;

    @JsonProperty("ssh_url")
    private String sshUrl;

    @JsonProperty("clone_url")
    private String cloneUrl;

    @JsonProperty("svn_url")
    private String svnUrl;

    private String homepage;

    private int size;

    @JsonProperty("stargazers_count")
    private int stargazersCount;

    @JsonProperty("watchers_count")
    private int watchersCount;

    private String language;

    @JsonProperty("has_issues")
    private boolean hasIssues;

    @JsonProperty("has_projects")
    private boolean hasProjects;

    @JsonProperty("has_downloads")
    private boolean hasDownloads;

    @JsonProperty("has_wiki")
    private boolean hasWiki;

    @JsonProperty("has_pages")
    private boolean hasPages;

    @JsonProperty("has_discussions")
    private boolean hasDiscussions;

    @JsonProperty("forks_count")
    private int forksCount;

    @JsonProperty("mirror_url")
    private String mirrorUrl;

    private boolean archived;

    private boolean disabled;

    @JsonProperty("open_issues_count")
    private int openIssuesCount;

    private License license;

    @JsonProperty("allow_forking")
    private boolean allowForking;

    @JsonProperty("is_template")
    private boolean isTemplate;

    @JsonProperty("web_commit_signoff_required")
    private boolean webCommitSignoffRequired;

    private List<String> topics;

    private String visibility;

    private int forks;

    @JsonProperty("open_issues")
    private int openIssues;

    private int watchers;

    @JsonProperty("default_branch")
    private String defaultBranch;

    @JsonProperty("temp_clone_token")
    private String tempCloneToken;

    private Organization organization;

    @JsonProperty("network_count")
    private int networkCount;

    @Data
    public static class Organization {

        private String login;

        private int id;

        @JsonProperty("node_id")
        private String nodeId;

        @JsonProperty("avatar_url")
        private String avatarUrl;

        @JsonProperty("gravatar_id")
        private String gravatarId;

        private String url;

        @JsonProperty("html_url")
        private String htmlUrl;

        @JsonProperty("followers_url")
        private String followersUrl;

        @JsonProperty("following_url")
        private String followingUrl;

        @JsonProperty("gists_url")
        private String gistsUrl;

        @JsonProperty("starred_url")
        private String starredUrl;

        @JsonProperty("subscriptions_url")
        private String subscriptionsUrl;

        @JsonProperty("organizations_url")
        private String organizationsUrl;

        @JsonProperty("repos_url")
        private String reposUrl;

        @JsonProperty("events_url")
        private String eventsUrl;

        @JsonProperty("received_events_url")
        private String receivedEventsUrl;

        private String type;

        @JsonProperty("site_admin")
        private boolean siteAdmin;
    }

    @Data
    public static class License {

        private String key;

        private String name;

        @JsonProperty("spdx_id")
        private String spdxId;

        private String url;

        @JsonProperty("node_id")
        private String nodeId;
    }

    @Data
    public static class Owner {

        private String login;

        private int id;

        @JsonProperty("node_id")
        private String nodeId;

        @JsonProperty("avatar_url")
        private String avatarUrl;

        @JsonProperty("gravatar_id")
        private String gravatarId;

        private String url;

        @JsonProperty("html_url")
        private String htmlUrl;

        @JsonProperty("followers_url")
        private String followersUrl;

        @JsonProperty("following_url")
        private String followingUrl;

        @JsonProperty("gists_url")
        private String gistsUrl;

        @JsonProperty("starred_url")
        private String starredUrl;

        @JsonProperty("subscriptions_url")
        private String subscriptionsUrl;

        @JsonProperty("organizations_url")
        private String organizationsUrl;

        @JsonProperty("repos_url")
        private String reposUrl;

        @JsonProperty("events_url")
        private String eventsUrl;

        @JsonProperty("received_events_url")
        private String receivedEventsUrl;

        private String type;

        @JsonProperty("site_admin")
        private boolean siteAdmin;
    }
}
