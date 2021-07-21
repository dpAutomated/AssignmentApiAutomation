
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Patch {

    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;

    /**
     * No args constructor for use in serialization
     */
    public Patch() {
    }

    /**
     * @param small
     * @param large
     */
    public Patch(String small, String large) {
        super();
        this.small = small;
        this.large = large;
    }

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patch patch = (Patch) o;
        return Objects.equals(small, patch.small) &&
                Objects.equals(large, patch.large);
    }

    @Override
    public int hashCode() {
        return Objects.hash(small, large);
    }

    @Override
    public String toString() {
        return "Patch{" +
                "small='" + small + '\'' +
                ", large='" + large + '\'' +
                '}';
    }
}
