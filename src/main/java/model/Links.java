
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Links {

    @JsonProperty("patch")
    private Patch patch;
    @JsonProperty("reddit")
    private Reddit reddit;
    @JsonProperty("flickr")
    private Flickr flickr;
    @JsonProperty("presskit")
    private String presskit;
    @JsonProperty("webcast")
    private String webcast;
    @JsonProperty("youtube_id")
    private String youtubeId;
    @JsonProperty("article")
    private String article;
    @JsonProperty("wikipedia")
    private String wikipedia;

    /**
     * No args constructor for use in serialization
     */
    public Links() {
    }

    /**
     * @param patch
     * @param webcast
     * @param flickr
     * @param reddit
     * @param youtubeId
     * @param wikipedia
     * @param presskit
     * @param article
     */
    public Links(Patch patch, Reddit reddit, Flickr flickr, String presskit, String webcast, String youtubeId, String article, String wikipedia) {
        super();
        this.patch = patch;
        this.reddit = reddit;
        this.flickr = flickr;
        this.presskit = presskit;
        this.webcast = webcast;
        this.youtubeId = youtubeId;
        this.article = article;
        this.wikipedia = wikipedia;
    }

    @JsonProperty("patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @JsonProperty("reddit")
    public Reddit getReddit() {
        return reddit;
    }

    @JsonProperty("reddit")
    public void setReddit(Reddit reddit) {
        this.reddit = reddit;
    }

    @JsonProperty("flickr")
    public Flickr getFlickr() {
        return flickr;
    }

    @JsonProperty("flickr")
    public void setFlickr(Flickr flickr) {
        this.flickr = flickr;
    }

    @JsonProperty("presskit")
    public String getPresskit() {
        return presskit;
    }

    @JsonProperty("presskit")
    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    @JsonProperty("webcast")
    public String getWebcast() {
        return webcast;
    }

    @JsonProperty("webcast")
    public void setWebcast(String webcast) {
        this.webcast = webcast;
    }

    @JsonProperty("youtube_id")
    public String getYoutubeId() {
        return youtubeId;
    }

    @JsonProperty("youtube_id")
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    @JsonProperty("article")
    public String getArticle() {
        return article;
    }

    @JsonProperty("article")
    public void setArticle(String article) {
        this.article = article;
    }

    @JsonProperty("wikipedia")
    public String getWikipedia() {
        return wikipedia;
    }

    @JsonProperty("wikipedia")
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Links links = (Links) o;
        return Objects.equals(patch, links.patch) &&
                Objects.equals(reddit, links.reddit) &&
                Objects.equals(flickr, links.flickr) &&
                Objects.equals(presskit, links.presskit) &&
                Objects.equals(webcast, links.webcast) &&
                Objects.equals(youtubeId, links.youtubeId) &&
                Objects.equals(article, links.article) &&
                Objects.equals(wikipedia, links.wikipedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patch, reddit, flickr, presskit, webcast, youtubeId, article, wikipedia);
    }

    @Override
    public String toString() {
        return "Links{" +
                "patch=" + patch +
                ", reddit=" + reddit +
                ", flickr=" + flickr +
                ", presskit='" + presskit + '\'' +
                ", webcast='" + webcast + '\'' +
                ", youtubeId='" + youtubeId + '\'' +
                ", article='" + article + '\'' +
                ", wikipedia='" + wikipedia + '\'' +
                '}';
    }
}
