package sustc.cs209.github.dao.factory;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class IssueApiDto {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */


    @JsonProperty("total_count")
    public int getTotal_count() {
        return this.total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    int total_count;

    @JsonProperty("incomplete_results")
    public boolean getIncomplete_results() {
        return this.incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    boolean incomplete_results;

    @JsonProperty("items")
    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    ArrayList<Item> items;


}

class User {
    @JsonProperty("login")
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    String login;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("avatar_url")
    public String getAvatar_url() {
        return this.avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    String avatar_url;

    @JsonProperty("gravatar_id")
    public String getGravatar_id() {
        return this.gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    String gravatar_id;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("html_url")
    public String getHtml_url() {
        return this.html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    String html_url;

    @JsonProperty("followers_url")
    public String getFollowers_url() {
        return this.followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    String followers_url;

    @JsonProperty("following_url")
    public String getFollowing_url() {
        return this.following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    String following_url;

    @JsonProperty("gists_url")
    public String getGists_url() {
        return this.gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    String gists_url;

    @JsonProperty("starred_url")
    public String getStarred_url() {
        return this.starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    String starred_url;

    @JsonProperty("subscriptions_url")
    public String getSubscriptions_url() {
        return this.subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    String subscriptions_url;

    @JsonProperty("organizations_url")
    public String getOrganizations_url() {
        return this.organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    String organizations_url;

    @JsonProperty("repos_url")
    public String getRepos_url() {
        return this.repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    String repos_url;

    @JsonProperty("events_url")
    public String getEvents_url() {
        return this.events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    String events_url;

    @JsonProperty("received_events_url")
    public String getReceived_events_url() {
        return this.received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    String received_events_url;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("site_admin")
    public boolean getSite_admin() {
        return this.site_admin;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    boolean site_admin;
}

class Assignee {
    @JsonProperty("login")
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    String login;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("avatar_url")
    public String getAvatar_url() {
        return this.avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    String avatar_url;

    @JsonProperty("gravatar_id")
    public String getGravatar_id() {
        return this.gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    String gravatar_id;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("html_url")
    public String getHtml_url() {
        return this.html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    String html_url;

    @JsonProperty("followers_url")
    public String getFollowers_url() {
        return this.followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    String followers_url;

    @JsonProperty("following_url")
    public String getFollowing_url() {
        return this.following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    String following_url;

    @JsonProperty("gists_url")
    public String getGists_url() {
        return this.gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    String gists_url;

    @JsonProperty("starred_url")
    public String getStarred_url() {
        return this.starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    String starred_url;

    @JsonProperty("subscriptions_url")
    public String getSubscriptions_url() {
        return this.subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    String subscriptions_url;

    @JsonProperty("organizations_url")
    public String getOrganizations_url() {
        return this.organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    String organizations_url;

    @JsonProperty("repos_url")
    public String getRepos_url() {
        return this.repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    String repos_url;

    @JsonProperty("events_url")
    public String getEvents_url() {
        return this.events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    String events_url;

    @JsonProperty("received_events_url")
    public String getReceived_events_url() {
        return this.received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    String received_events_url;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("site_admin")
    public boolean getSite_admin() {
        return this.site_admin;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    boolean site_admin;
}

class Assignee2 {
    @JsonProperty("login")
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    String login;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("avatar_url")
    public String getAvatar_url() {
        return this.avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    String avatar_url;

    @JsonProperty("gravatar_id")
    public String getGravatar_id() {
        return this.gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    String gravatar_id;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("html_url")
    public String getHtml_url() {
        return this.html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    String html_url;

    @JsonProperty("followers_url")
    public String getFollowers_url() {
        return this.followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    String followers_url;

    @JsonProperty("following_url")
    public String getFollowing_url() {
        return this.following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    String following_url;

    @JsonProperty("gists_url")
    public String getGists_url() {
        return this.gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    String gists_url;

    @JsonProperty("starred_url")
    public String getStarred_url() {
        return this.starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    String starred_url;

    @JsonProperty("subscriptions_url")
    public String getSubscriptions_url() {
        return this.subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    String subscriptions_url;

    @JsonProperty("organizations_url")
    public String getOrganizations_url() {
        return this.organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    String organizations_url;

    @JsonProperty("repos_url")
    public String getRepos_url() {
        return this.repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    String repos_url;

    @JsonProperty("events_url")
    public String getEvents_url() {
        return this.events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    String events_url;

    @JsonProperty("received_events_url")
    public String getReceived_events_url() {
        return this.received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    String received_events_url;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("site_admin")
    public boolean getSite_admin() {
        return this.site_admin;
    }

    public void setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
    }

    boolean site_admin;
}

class Item {
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("repository_url")
    public String getRepository_url() {
        return this.repository_url;
    }

    public void setRepository_url(String repository_url) {
        this.repository_url = repository_url;
    }

    String repository_url;

    @JsonProperty("labels_url")
    public String getLabels_url() {
        return this.labels_url;
    }

    public void setLabels_url(String labels_url) {
        this.labels_url = labels_url;
    }

    String labels_url;

    @JsonProperty("comments_url")
    public String getComments_url() {
        return this.comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    String comments_url;

    @JsonProperty("events_url")
    public String getEvents_url() {
        return this.events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    String events_url;

    @JsonProperty("html_url")
    public String getHtml_url() {
        return this.html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    String html_url;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("number")
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    @JsonProperty("user")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    @JsonProperty("labels")
    public ArrayList<Label> getLabels() {
        return this.labels;
    }

    public void setLabels(ArrayList<Label> labels) {
        this.labels = labels;
    }

    ArrayList<Label> labels;

    @JsonProperty("state")
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;

    @JsonProperty("locked")
    public boolean getLocked() {
        return this.locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    boolean locked;

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    Assignee assignee;

    @JsonProperty("assignees")
    public ArrayList<Assignee> getAssignees() {
        return this.assignees;
    }

    public void setAssignees(ArrayList<Assignee> assignees) {
        this.assignees = assignees;
    }

    ArrayList<Assignee> assignees;

    @JsonProperty("milestone")
    public Object getMilestone() {
        return this.milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    Object milestone;

    @JsonProperty("comments")
    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    int comments;

    @JsonProperty("created_at")
    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    Date created_at;

    @JsonProperty("updated_at")
    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    Date updated_at;

    @JsonProperty("closed_at")
    public Date getClosed_at() {
        return this.closed_at;
    }

    public void setClosed_at(Date closed_at) {
        this.closed_at = closed_at;
    }

    Date closed_at;

    @JsonProperty("author_association")
    public String getAuthor_association() {
        return this.author_association;
    }

    public void setAuthor_association(String author_association) {
        this.author_association = author_association;
    }

    String author_association;

    @JsonProperty("active_lock_reason")
    public Object getActive_lock_reason() {
        return this.active_lock_reason;
    }

    public void setActive_lock_reason(Object active_lock_reason) {
        this.active_lock_reason = active_lock_reason;
    }

    Object active_lock_reason;

    @JsonProperty("body")
    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    String body;

    @JsonProperty("reactions")
    public Reactions getReactions() {
        return this.reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    Reactions reactions;

    @JsonProperty("timeline_url")
    public String getTimeline_url() {
        return this.timeline_url;
    }

    public void setTimeline_url(String timeline_url) {
        this.timeline_url = timeline_url;
    }

    String timeline_url;

    @JsonProperty("performed_via_github_app")
    public Object getPerformed_via_github_app() {
        return this.performed_via_github_app;
    }

    public void setPerformed_via_github_app(Object performed_via_github_app) {
        this.performed_via_github_app = performed_via_github_app;
    }

    Object performed_via_github_app;

    @JsonProperty("state_reason")
    public String getState_reason() {
        return this.state_reason;
    }

    public void setState_reason(String state_reason) {
        this.state_reason = state_reason;
    }

    String state_reason;

    @JsonProperty("score")
    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    double score;
}

class Label {
    @JsonProperty("id")
    public Object getId() {
        return this.id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    Object id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("color")
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;

    @JsonProperty("default")
    public boolean getMydefault() {
        return this.mydefault;
    }

    public void setMydefault(boolean mydefault) {
        this.mydefault = mydefault;
    }

    boolean mydefault;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
}

class Reactions {
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("total_count")
    public int getTotal_count() {
        return this.total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    int total_count;

    @JsonProperty("laugh")
    public int getLaugh() {
        return this.laugh;
    }

    public void setLaugh(int laugh) {
        this.laugh = laugh;
    }

    int laugh;

    @JsonProperty("hooray")
    public int getHooray() {
        return this.hooray;
    }

    public void setHooray(int hooray) {
        this.hooray = hooray;
    }

    int hooray;

    @JsonProperty("confused")
    public int getConfused() {
        return this.confused;
    }

    public void setConfused(int confused) {
        this.confused = confused;
    }

    int confused;

    @JsonProperty("heart")
    public int getHeart() {
        return this.heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    int heart;

    @JsonProperty("rocket")
    public int getRocket() {
        return this.rocket;
    }

    public void setRocket(int rocket) {
        this.rocket = rocket;
    }

    int rocket;

    @JsonProperty("eyes")
    public int getEyes() {
        return this.eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    int eyes;
}


