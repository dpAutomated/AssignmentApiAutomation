
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Flickr {

    @JsonProperty("small")
    private List<String> small = null;
    @JsonProperty("original")
    private List<String> original = null;

    /**
     * No args constructor for use in serialization
     */
    public Flickr() {
    }

    /**
     * @param small
     * @param original
     */
    public Flickr(List<String> small, List<String> original) {
        super();
        this.small = small;
        this.original = original;
    }

    @JsonProperty("small")
    public List<String> getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(List<String> small) {
        this.small = small;
    }

    @JsonProperty("original")
    public List<String> getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(List<String> original) {
        this.original = original;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flickr flickr = (Flickr) o;
        return Objects.equals(small, flickr.small) &&
                Objects.equals(original, flickr.original);
    }

    @Override
    public int hashCode() {
        return Objects.hash(small, original);
    }

    @Override
    public String toString() {
        return "Flickr{" +
                "small=" + small +
                ", original=" + original +
                '}';
    }
}
