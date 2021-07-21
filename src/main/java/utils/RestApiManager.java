package utils;

import io.restassured.response.Response;
import org.apache.log4j.Logger;
import org.testng.Reporter;

public class RestApiManager {

    protected static final Logger LOG = Logger.getLogger(RestApiManager.class);
    private RestRequestBuilder requestBuilder;

    public RestApiManager(RestRequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public Response sendGetRequest(String resourceUrl) {
        Response response = requestBuilder.getRequestSpecification().get(resourceUrl);
        Reporter.log("Resource Url " + resourceUrl);
        Reporter.log("Status Code :"+response.getStatusCode());
        Reporter.log(response.prettyPrint());
        LOG.info("### Response " + response);
        return response;

    }
}
