package validation.testNg;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import validation.ExtendedSoftAssert;
import validation.WeatherApiTestBase;

import java.util.HashMap;
import java.util.Map;

@Epic("Security testing")
public class HttpMethodsTest extends WeatherApiTestBase {
    private Map<String, String> baseQueryParameters = new HashMap<>();

    @BeforeClass
    @Override
    public void setUpConstants() {
        super.setUpConstants();
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "forecast_hourly");
    }

    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @DataProvider(name = "dataStatusCodes")
    public Object[][] setCodeStatus() {
        return new Object[][]{
                {"TC_2.1", Method.GET, 200},
                {"TC_2.2", Method.POST, 405},
                {"TC_2.3", Method.DELETE, 405},
                {"TC_2.4", Method.OPTIONS, 405},
                {"TC_2.5", Method.PUT, 405},
                {"TC_2.6", Method.HEAD, 200},
                {"TC_2.7", Method.TRACE, 403},
                {"TC_2.8", Method.PATCH, 405}
        };
    }

    @Feature("HTTP methods tests")
    @Test(dataProvider = "dataStatusCodes")
    @Description("Verify that response for HTTP method is correct}")
    public void testHttpMethods(String testCaseNumber, Method methodName, int statusCode) {
        Response response = sendRequest(methodName, baseQueryParameters);
        softAssert.assertEquals(response.statusCode(), statusCode, testCaseNumber);
        softAssert.assertAll();
    }
}
