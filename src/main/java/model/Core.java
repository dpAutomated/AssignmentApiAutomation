
package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Core {

    @JsonProperty("core")
    private String core;
    @JsonProperty("flight")
    private Integer flight;
    @JsonProperty("gridfins")
    private Boolean gridfins;
    @JsonProperty("legs")
    private Boolean legs;
    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("landing_attempt")
    private Boolean landingAttempt;
    @JsonProperty("landing_success")
    private Boolean landingSuccess;
    @JsonProperty("landing_type")
    private String landingType;
    @JsonProperty("landpad")
    private String landpad;

    /**
     * No args constructor for use in serialization
     */
    public Core() {
    }

    /**
     * @param core
     * @param flight
     * @param landingType
     * @param gridfins
     * @param landingSuccess
     * @param legs
     * @param landingAttempt
     * @param landpad
     * @param reused
     */
    public Core(String core, Integer flight, Boolean gridfins, Boolean legs, Boolean reused, Boolean landingAttempt, Boolean landingSuccess, String landingType, String landpad) {
        super();
        this.core = core;
        this.flight = flight;
        this.gridfins = gridfins;
        this.legs = legs;
        this.reused = reused;
        this.landingAttempt = landingAttempt;
        this.landingSuccess = landingSuccess;
        this.landingType = landingType;
        this.landpad = landpad;
    }

    @JsonProperty("core")
    public String getCore() {
        return core;
    }

    @JsonProperty("core")
    public void setCore(String core) {
        this.core = core;
    }

    @JsonProperty("flight")
    public Integer getFlight() {
        return flight;
    }

    @JsonProperty("flight")
    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    @JsonProperty("gridfins")
    public Boolean getGridfins() {
        return gridfins;
    }

    @JsonProperty("gridfins")
    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }

    @JsonProperty("legs")
    public Boolean getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(Boolean legs) {
        this.legs = legs;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("landing_attempt")
    public Boolean getLandingAttempt() {
        return landingAttempt;
    }

    @JsonProperty("landing_attempt")
    public void setLandingAttempt(Boolean landingAttempt) {
        this.landingAttempt = landingAttempt;
    }

    @JsonProperty("landing_success")
    public Boolean getLandingSuccess() {
        return landingSuccess;
    }

    @JsonProperty("landing_success")
    public void setLandingSuccess(Boolean landingSuccess) {
        this.landingSuccess = landingSuccess;
    }

    @JsonProperty("landing_type")
    public String getLandingType() {
        return landingType;
    }

    @JsonProperty("landing_type")
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    @JsonProperty("landpad")
    public String getLandpad() {
        return landpad;
    }

    @JsonProperty("landpad")
    public void setLandpad(String landpad) {
        this.landpad = landpad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Core core1 = (Core) o;
        return Objects.equals(core, core1.core) &&
                Objects.equals(flight, core1.flight) &&
                Objects.equals(gridfins, core1.gridfins) &&
                Objects.equals(legs, core1.legs) &&
                Objects.equals(reused, core1.reused) &&
                Objects.equals(landingAttempt, core1.landingAttempt) &&
                Objects.equals(landingSuccess, core1.landingSuccess) &&
                Objects.equals(landingType, core1.landingType) &&
                Objects.equals(landpad, core1.landpad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(core, flight, gridfins, legs, reused, landingAttempt, landingSuccess, landingType, landpad);
    }

    @Override
    public String toString() {
        return "Core{" +
                "core='" + core + '\'' +
                ", flight=" + flight +
                ", gridfins=" + gridfins +
                ", legs=" + legs +
                ", reused=" + reused +
                ", landingAttempt=" + landingAttempt +
                ", landingSuccess=" + landingSuccess +
                ", landingType='" + landingType + '\'' +
                ", landpad='" + landpad + '\'' +
                '}';
    }
}
