package utils;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;

import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RestRequestBuilder {

    RequestSpecification requestSpecification;
    protected static final Logger LOG = Logger.getLogger(RestRequestBuilder.class);

    public RestRequestBuilder() {
        configureRequest();
    }

    private void configureRequest() {
        requestSpecification = RestAssured.given()
                .relaxedHTTPSValidation().log().all();
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public RestRequestBuilder setBaseUri(String uri) {
        requestSpecification.baseUri(uri);
        return this;
    }

    public RestRequestBuilder setDefaultAuthentication() {
        requestSpecification.auth().none();
        return this;
    }

    public RestRequestBuilder setContentTypeAsJson() {
        requestSpecification.contentType(MediaType.APPLICATION_JSON);
        return this;
    }
    public RestRequestBuilder setAcceptasJson() {
        requestSpecification.accept(MediaType.APPLICATION_JSON);
        return this;
    }

    public RestRequestBuilder getRequestBuilderWithNoAuthContentTyeAsJson() {
        return setDefaultAuthentication().setContentTypeAsJson().setAcceptasJson();
    }
}
