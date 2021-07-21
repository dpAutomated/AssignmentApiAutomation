import io.restassured.response.Response;
import model.Latest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ApiTest extends ApiTestBase {
    private static final String endPoint = "v4/launches/latest";

    @Test
    public void testGetApi() {
        Response response = apiManager.sendGetRequest(endPoint);
        Latest latestResponse = response.as(Latest.class);
        assertEquals(response.getStatusCode(), 200, "Status code mismatch for" + endPoint);
        assertNotNull(latestResponse);
        assertNotNull(latestResponse.getId());
        assertTrue(latestResponse.getSuccess());
        if (latestResponse.getSuccess() == false) {
            assertNotNull(latestResponse.getFailures());
        }
    }
}
