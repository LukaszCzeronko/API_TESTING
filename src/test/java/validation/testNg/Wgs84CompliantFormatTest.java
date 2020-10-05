package validation.testNg;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
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

@Epic("Query parameters tests")
public class Wgs84CompliantFormatTest extends WeatherApiTestBase {
    private Map<String, String> baseQueryParameters = new HashMap<>();

    @BeforeClass
    @Override
    public void setUpConstants() {
        super.setUpConstants();
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("product", "observation");
    }

    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @DataProvider(name = "coordinates")
    public Object[][] coordinatesTest() {
        Map<String, String> QueryParameters1 = new HashMap<>();
        Map<String, String> QueryParameters2 = new HashMap<>();
        Map<String, String> QueryParameters3 = new HashMap<>();
        Map<String, String> QueryParameters4 = new HashMap<>();
        Map<String, String> QueryParameters5 = new HashMap<>();
        Map<String, String> QueryParameters6 = new HashMap<>();
        Map<String, String> QueryParameters7 = new HashMap<>();
        Map<String, String> QueryParameters8 = new HashMap<>();
        Map<String, String> QueryParameters9 = new HashMap<>();

        QueryParameters1.put("latitude", "0");
        QueryParameters1.put("longitude", "0");

        QueryParameters2.put("latitude", "0");
        QueryParameters2.put("longitude", "196");

        QueryParameters3.put("latitude", "0");
        QueryParameters3.put("longitude", "-200");

        QueryParameters4.put("latitude", "0");
        QueryParameters4.put("longitude", "160.9");

        QueryParameters5.put("latitude", "0");
        QueryParameters5.put("longitude", "-168.9");

        QueryParameters6.put("latitude", "111");
        QueryParameters6.put("longitude", "0");

        QueryParameters7.put("latitude", "-100");
        QueryParameters7.put("longitude", "0");

        QueryParameters8.put("latitude", "60.9");
        QueryParameters8.put("longitude", "0");

        QueryParameters9.put("latitude", "-60.9");
        QueryParameters9.put("longitude", "0");

        return new Object[][]{
                {"Tc_8.1", QueryParameters1, 200},
                {"TC_8.2", QueryParameters2, 400},
                {"TC_8.3 ", QueryParameters3, 400},
                {"TC_8.4", QueryParameters4, 200},
                {"Tc_8.5", QueryParameters5, 200},
                {"TC_8.6", QueryParameters6, 400},
                {"TC_8.7 ", QueryParameters7, 400},
                {"TC_8.8", QueryParameters8, 200},
                {"Tc_8.9", QueryParameters9, 200},

        };
    }

    @Feature("Supported values test")
    @Story("WGS-84 compliant format test")
    @Test(dataProvider = "coordinates")
    @Description("Verify compatibility with WGS-84 compliant format")
    public void wgs84Format(String testCaseNumber, HashMap<String, String> parameters, int statusCode) {
        Response response = sendRequest(Method.GET, baseQueryParameters, parameters);
        softAssert.assertEquals(response.statusCode(), statusCode, testCaseNumber);
        softAssert.assertAll();
    }
}
