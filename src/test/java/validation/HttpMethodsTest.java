package validation;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

@Epic("Security testing")
public class HttpMethodsTest extends WeatherApiTestBase {
    private static final String BASE_QUERY_PARAMETERS =
            "?app_id=JIlgIjxb334PrWXpDC3w&app_code=QZvw9AhazmUb1tY3uX40DQ&product=observation&name=Berlin";

    @BeforeClass
    @Override
    public void setUpConstants() {
        super.setUpConstants();
        RestAssured.basePath += BASE_QUERY_PARAMETERS;
    }

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
//change test name to "CHANGED_NAME"

    @Feature("HTTP methods tests")
    @Test(dataProvider = "dataStatusCodes")
    @Step("Verify that HTTP response code for method {methodName} is equal to {statusCode} ")
    public void testHttpMethods(String testCaseNumber, String methodName, int statusCode) {
        Response response = given().request(methodName, baseURI + basePath);
        assertEquals(response.statusCode(), statusCode, testCaseNumber + " Wrong response status code.");
    }
}
