
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Fairings {

    @JsonProperty("reused")
    private Boolean reused;
    @JsonProperty("recovery_attempt")
    private Boolean recoveryAttempt;
    @JsonProperty("recovered")
    private Boolean recovered;
    @JsonProperty("ships")
    private List<String> ships = null;

    /**
     * No args constructor for use in serialization
     */
    public Fairings() {
    }

    /**
     * @param recovered
     * @param ships
     * @param recoveryAttempt
     * @param reused
     */
    public Fairings(Boolean reused, Boolean recoveryAttempt, Boolean recovered, List<String> ships) {
        super();
        this.reused = reused;
        this.recoveryAttempt = recoveryAttempt;
        this.recovered = recovered;
        this.ships = ships;
    }

    @JsonProperty("reused")
    public Boolean getReused() {
        return reused;
    }

    @JsonProperty("reused")
    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    @JsonProperty("recovery_attempt")
    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    @JsonProperty("recovery_attempt")
    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    @JsonProperty("recovered")
    public Boolean getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("ships")
    public List<String> getShips() {
        return ships;
    }

    @JsonProperty("ships")
    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fairings fairings = (Fairings) o;
        return Objects.equals(reused, fairings.reused) &&
                Objects.equals(recoveryAttempt, fairings.recoveryAttempt) &&
                Objects.equals(recovered, fairings.recovered) &&
                Objects.equals(ships, fairings.ships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reused, recoveryAttempt, recovered, ships);
    }

    @Override
    public String toString() {
        return "Fairings{" +
                "reused=" + reused +
                ", recoveryAttempt=" + recoveryAttempt +
                ", recovered=" + recovered +
                ", ships=" + ships +
                '}';
    }
}
