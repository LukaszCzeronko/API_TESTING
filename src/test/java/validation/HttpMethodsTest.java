package validation;

import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class HttpMethodsTest {
    private static final String BASE_URL =
            "https://weather.api.here.com/weather/1.0/report.json" +
                    "?app_id=JIlgIjxb334PrWXpDC3w&app_code=QZvw9AhazmUb1tY3uX40DQ&product=observation&name=Berlin";

    @DataProvider(name = "dataStatusCodes")
    public Object[][] setCodeStatus() {
        return new Object[][]{
                {"TC_2.1", "GET", 200},
                {"TC_2.2", "POST", 405},
                {"TC_2.3", "DELETE", 405},
                {"TC_2.4", "OPTIONS", 405},
                {"TC_2.5", "PUT", 405},
                {"TC_2.6", "HEAD", 200},
                {"TC_2.7", "TRACE", 403},
                {"TC_2.8", "PATCH", 405}
        };
    }

    @Test(dataProvider = "dataStatusCodes")
    public void testHttpMethods(String testCaseNumber, String methodName, int statusCode) {
        Response response = given().when().request(methodName, BASE_URL);
        assertEquals(response.statusCode(), statusCode, testCaseNumber + "Wrong response status code.");
    }
}
