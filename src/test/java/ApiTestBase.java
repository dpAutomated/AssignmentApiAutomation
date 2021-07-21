import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import utils.RestApiManager;
import utils.RestRequestBuilder;

public class ApiTestBase {
    protected static final Logger LOG = Logger.getLogger(ApiTestBase.class);
    protected static final String BASE_URL = "https://api.spacexdata.com/";
    RestRequestBuilder request;
    RestApiManager apiManager;

    @BeforeTest
    public void beforeApiSuitOperations() {
        request = new RestRequestBuilder().setBaseUri(BASE_URL).getRequestBuilderWithNoAuthContentTyeAsJson();
        apiManager = new RestApiManager(request);
    }
}
