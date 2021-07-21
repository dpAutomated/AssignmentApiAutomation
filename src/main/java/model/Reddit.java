
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class Reddit {

    @JsonProperty("campaign")
    private String campaign;
    @JsonProperty("launch")
    private String launch;
    @JsonProperty("media")
    private String media;
    @JsonProperty("recovery")
    private String recovery;

    /**
     * No args constructor for use in serialization
     */
    public Reddit() {
    }

    /**
     * @param campaign
     * @param launch
     * @param media
     * @param recovery
     */
    public Reddit(String campaign, String launch, String media, String recovery) {
        super();
        this.campaign = campaign;
        this.launch = launch;
        this.media = media;
        this.recovery = recovery;
    }

    @JsonProperty("campaign")
    public String getCampaign() {
        return campaign;
    }

    @JsonProperty("campaign")
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    @JsonProperty("launch")
    public String getLaunch() {
        return launch;
    }

    @JsonProperty("launch")
    public void setLaunch(String launch) {
        this.launch = launch;
    }

    @JsonProperty("media")
    public String getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(String media) {
        this.media = media;
    }

    @JsonProperty("recovery")
    public String getRecovery() {
        return recovery;
    }

    @JsonProperty("recovery")
    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reddit reddit = (Reddit) o;
        return Objects.equals(campaign, reddit.campaign) &&
                Objects.equals(launch, reddit.launch) &&
                Objects.equals(media, reddit.media) &&
                Objects.equals(recovery, reddit.recovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaign, launch, media, recovery);
    }

    @Override
    public String toString() {
        return "Reddit{" +
                "campaign='" + campaign + '\'' +
                ", launch='" + launch + '\'' +
                ", media='" + media + '\'' +
                ", recovery='" + recovery + '\'' +
                '}';
    }
}
