
package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Latest {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Latest latest = (Latest) o;
        return Objects.equals(fairings, latest.fairings) &&
                Objects.equals(links, latest.links) &&
                Objects.equals(staticFireDateUtc, latest.staticFireDateUtc) &&
                Objects.equals(staticFireDateUnix, latest.staticFireDateUnix) &&
                Objects.equals(tbd, latest.tbd) &&
                Objects.equals(net, latest.net) &&
                Objects.equals(window, latest.window) &&
                Objects.equals(rocket, latest.rocket) &&
                Objects.equals(success, latest.success) &&
                Objects.equals(details, latest.details) &&
                Objects.equals(ships, latest.ships) &&
                Objects.equals(capsules, latest.capsules) &&
                Objects.equals(payloads, latest.payloads) &&
                Objects.equals(launchpad, latest.launchpad) &&
                Objects.equals(autoUpdate, latest.autoUpdate) &&
                Objects.equals(launchLibraryId, latest.launchLibraryId) &&
                Objects.equals(failures, latest.failures) &&
                Objects.equals(crew, latest.crew) &&
                Objects.equals(flightNumber, latest.flightNumber) &&
                Objects.equals(name, latest.name) &&
                Objects.equals(dateUtc, latest.dateUtc) &&
                Objects.equals(dateUnix, latest.dateUnix) &&
                Objects.equals(dateLocal, latest.dateLocal) &&
                Objects.equals(datePrecision, latest.datePrecision) &&
                Objects.equals(upcoming, latest.upcoming) &&
                Objects.equals(cores, latest.cores) &&
                Objects.equals(id, latest.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fairings, links, staticFireDateUtc, staticFireDateUnix, tbd, net, window, rocket, success, details, ships, capsules, payloads, launchpad, autoUpdate, launchLibraryId, failures, crew, flightNumber, name, dateUtc, dateUnix, dateLocal, datePrecision, upcoming, cores, id);
    }

    @JsonProperty("fairings")
    private Fairings fairings;
    @JsonProperty("links")
    private Links links;
    @JsonProperty("static_fire_date_utc")
    private String staticFireDateUtc;
    @JsonProperty("static_fire_date_unix")
    private Integer staticFireDateUnix;
    @JsonProperty("tbd")
    private Boolean tbd;
    @JsonProperty("net")
    private Boolean net;
    @JsonProperty("window")
    private Integer window;
    @JsonProperty("rocket")
    private String rocket;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("details")
    private String details;
    @JsonProperty("ships")
    private List<String> ships = null;
    @JsonProperty("capsules")
    private List<String> capsules = null;
    @JsonProperty("payloads")
    private List<String> payloads = null;
    @JsonProperty("launchpad")
    private String launchpad;
    @JsonProperty("auto_update")
    private Boolean autoUpdate;
    @JsonProperty("launch_library_id")
    private String launchLibraryId;
    @JsonProperty("failures")
    private List<String> failures = null;
    @JsonProperty("crew")
    private List<String> crew = null;
    @JsonProperty("flight_number")
    private Integer flightNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("date_utc")
    private String dateUtc;
    @JsonProperty("date_unix")
    private Integer dateUnix;
    @JsonProperty("date_local")
    private String dateLocal;
    @JsonProperty("date_precision")
    private String datePrecision;
    @JsonProperty("upcoming")
    private Boolean upcoming;
    @JsonProperty("cores")
    private List<Core> cores = null;
    @JsonProperty("id")
    private String id;
    /**
     * No args constructor for use in serialization
     * 
     */
    public Latest() {
    }

    /**
     * 
     * @param staticFireDateUtc
     * @param dateLocal
     * @param launchpad
     * @param autoUpdate
     * @param payloads
     * @param rocket
     * @param dateUnix
     * @param crew
     * @param dateUtc
     * @param cores
     * @param links
     * @param staticFireDateUnix
     * @param details
     * @param id
     * @param net
     * @param capsules
     * @param failures
     * @param fairings
     * @param flightNumber
     * @param ships
     * @param datePrecision
     * @param success
     * @param tbd
     * @param name
     * @param window
     * @param upcoming
     * @param launchLibraryId
     */
    public Latest(Fairings fairings, Links links, String staticFireDateUtc, Integer staticFireDateUnix, Boolean tbd, Boolean net, Integer window, String rocket, Boolean success, String details, List<String> ships, List<String> capsules, List<String> payloads, String launchpad, Boolean autoUpdate, String launchLibraryId, List<String> failures, List<String> crew, Integer flightNumber, String name, String dateUtc, Integer dateUnix, String dateLocal, String datePrecision, Boolean upcoming, List<Core> cores, String id) {
        super();
        this.fairings = fairings;
        this.links = links;
        this.staticFireDateUtc = staticFireDateUtc;
        this.staticFireDateUnix = staticFireDateUnix;
        this.tbd = tbd;
        this.net = net;
        this.window = window;
        this.rocket = rocket;
        this.success = success;
        this.details = details;
        this.ships = ships;
        this.capsules = capsules;
        this.payloads = payloads;
        this.launchpad = launchpad;
        this.autoUpdate = autoUpdate;
        this.launchLibraryId = launchLibraryId;
        this.failures = failures;
        this.crew = crew;
        this.flightNumber = flightNumber;
        this.name = name;
        this.dateUtc = dateUtc;
        this.dateUnix = dateUnix;
        this.dateLocal = dateLocal;
        this.datePrecision = datePrecision;
        this.upcoming = upcoming;
        this.cores = cores;
        this.id = id;
    }

    @JsonProperty("fairings")
    public Fairings getFairings() {
        return fairings;
    }

    @JsonProperty("fairings")
    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("static_fire_date_utc")
    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    @JsonProperty("static_fire_date_utc")
    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    @JsonProperty("static_fire_date_unix")
    public Integer getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    @JsonProperty("static_fire_date_unix")
    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    @JsonProperty("tbd")
    public Boolean getTbd() {
        return tbd;
    }

    @JsonProperty("tbd")
    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    @JsonProperty("net")
    public Boolean getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(Boolean net) {
        this.net = net;
    }

    @JsonProperty("window")
    public Integer getWindow() {
        return window;
    }

    @JsonProperty("window")
    public void setWindow(Integer window) {
        this.window = window;
    }

    @JsonProperty("rocket")
    public String getRocket() {
        return rocket;
    }

    @JsonProperty("rocket")
    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("ships")
    public List<String> getShips() {
        return ships;
    }

    @JsonProperty("ships")
    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    @JsonProperty("capsules")
    public List<String> getCapsules() {
        return capsules;
    }

    @JsonProperty("capsules")
    public void setCapsules(List<String> capsules) {
        this.capsules = capsules;
    }

    @JsonProperty("payloads")
    public List<String> getPayloads() {
        return payloads;
    }

    @JsonProperty("payloads")
    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    @JsonProperty("launchpad")
    public String getLaunchpad() {
        return launchpad;
    }

    @JsonProperty("launchpad")
    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    @JsonProperty("auto_update")
    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    @JsonProperty("auto_update")
    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    @JsonProperty("launch_library_id")
    public String getLaunchLibraryId() {
        return launchLibraryId;
    }

    @JsonProperty("launch_library_id")
    public void setLaunchLibraryId(String launchLibraryId) {
        this.launchLibraryId = launchLibraryId;
    }

    @JsonProperty("failures")
    public List<String> getFailures() {
        return failures;
    }

    @JsonProperty("failures")
    public void setFailures(List<String> failures) {
        this.failures = failures;
    }

    @JsonProperty("crew")
    public List<String> getCrew() {
        return crew;
    }

    @JsonProperty("crew")
    public void setCrew(List<String> crew) {
        this.crew = crew;
    }

    @JsonProperty("flight_number")
    public Integer getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("date_utc")
    public String getDateUtc() {
        return dateUtc;
    }

    @JsonProperty("date_utc")
    public void setDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
    }

    @JsonProperty("date_unix")
    public Integer getDateUnix() {
        return dateUnix;
    }

    @JsonProperty("date_unix")
    public void setDateUnix(Integer dateUnix) {
        this.dateUnix = dateUnix;
    }

    @JsonProperty("date_local")
    public String getDateLocal() {
        return dateLocal;
    }

    @JsonProperty("date_local")
    public void setDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
    }

    @JsonProperty("date_precision")
    public String getDatePrecision() {
        return datePrecision;
    }

    @JsonProperty("date_precision")
    public void setDatePrecision(String datePrecision) {
        this.datePrecision = datePrecision;
    }

    @JsonProperty("upcoming")
    public Boolean getUpcoming() {
        return upcoming;
    }

    @JsonProperty("upcoming")
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    @JsonProperty("cores")
    public List<Core> getCores() {
        return cores;
    }

    @JsonProperty("cores")
    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Latest{" +
                "fairings=" + fairings +
                ", links=" + links +
                ", staticFireDateUtc='" + staticFireDateUtc + '\'' +
                ", staticFireDateUnix=" + staticFireDateUnix +
                ", tbd=" + tbd +
                ", net=" + net +
                ", window=" + window +
                ", rocket='" + rocket + '\'' +
                ", success=" + success +
                ", details='" + details + '\'' +
                ", ships=" + ships +
                ", capsules=" + capsules +
                ", payloads=" + payloads +
                ", launchpad='" + launchpad + '\'' +
                ", autoUpdate=" + autoUpdate +
                ", launchLibraryId='" + launchLibraryId + '\'' +
                ", failures=" + failures +
                ", crew=" + crew +
                ", flightNumber=" + flightNumber +
                ", name='" + name + '\'' +
                ", dateUtc='" + dateUtc + '\'' +
                ", dateUnix=" + dateUnix +
                ", dateLocal='" + dateLocal + '\'' +
                ", datePrecision='" + datePrecision + '\'' +
                ", upcoming=" + upcoming +
                ", cores=" + cores +
                ", id='" + id + '\'' +
                '}';
    }
}
