package sustc.cs209.github.dao.factory;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;

public class ReleaseApiDto {

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */


    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("assets_url")
    public String getAssets_url() {
        return this.assets_url;
    }

    public void setAssets_url(String assets_url) {
        this.assets_url = assets_url;
    }

    String assets_url;

    @JsonProperty("upload_url")
    public String getUpload_url() {
        return this.upload_url;
    }

    public void setUpload_url(String upload_url) {
        this.upload_url = upload_url;
    }

    String upload_url;

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

    @JsonProperty("author")
    public AuthorRelease getAuthorRelease() {
        return this.author;
    }

    public void setAuthorRelease(AuthorRelease author) {
        this.author = author;
    }

    AuthorRelease author;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("tag_name")
    public String getTag_name() {
        return this.tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    String tag_name;

    @JsonProperty("target_commitish")
    public String getTarget_commitish() {
        return this.target_commitish;
    }

    public void setTarget_commitish(String target_commitish) {
        this.target_commitish = target_commitish;
    }

    String target_commitish;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("draft")
    public boolean getDraft() {
        return this.draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    boolean draft;

    @JsonProperty("prerelease")
    public boolean getPrerelease() {
        return this.prerelease;
    }

    public void setPrerelease(boolean prerelease) {
        this.prerelease = prerelease;
    }

    boolean prerelease;

    @JsonProperty("created_at")
    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    Date created_at;

    @JsonProperty("published_at")
    public Date getPublished_at() {
        return this.published_at;
    }

    public void setPublished_at(Date published_at) {
        this.published_at = published_at;
    }

    Date published_at;

    @JsonProperty("assets")
    public ArrayList<Asset> getAssets() {
        return this.assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    ArrayList<Asset> assets;

    @JsonProperty("tarball_url")
    public String getTarball_url() {
        return this.tarball_url;
    }

    public void setTarball_url(String tarball_url) {
        this.tarball_url = tarball_url;
    }

    String tarball_url;

    @JsonProperty("zipball_url")
    public String getZipball_url() {
        return this.zipball_url;
    }

    public void setZipball_url(String zipball_url) {
        this.zipball_url = zipball_url;
    }

    String zipball_url;

    @JsonProperty("body")
    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    String body;

    @JsonProperty("mentions_count")
    public int getMentions_count() {
        return this.mentions_count;
    }

    public void setMentions_count(int mentions_count) {
        this.mentions_count = mentions_count;
    }

    int mentions_count;

    @JsonProperty("reactions")
    public ReactionsRelease getReactionsRelease() {
        return this.reactions;
    }

    public void setReactionsRelease(ReactionsRelease reactions) {
        this.reactions = reactions;
    }

    ReactionsRelease reactions;


}

class Uploader {
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

class Asset {
    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

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

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("label")
    public Object getLabel() {
        return this.label;
    }

    public void setLabel(Object label) {
        this.label = label;
    }

    Object label;

    @JsonProperty("uploader")
    public Uploader getUploader() {
        return this.uploader;
    }

    public void setUploader(Uploader uploader) {
        this.uploader = uploader;
    }

    Uploader uploader;

    @JsonProperty("content_type")
    public String getContent_type() {
        return this.content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    String content_type;

    @JsonProperty("state")
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    int size;

    @JsonProperty("download_count")
    public int getDownload_count() {
        return this.download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    int download_count;

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

    @JsonProperty("browser_download_url")
    public String getBrowser_download_url() {
        return this.browser_download_url;
    }

    public void setBrowser_download_url(String browser_download_url) {
        this.browser_download_url = browser_download_url;
    }

    String browser_download_url;
}

class AuthorRelease {
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

class ReactionsRelease {
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
