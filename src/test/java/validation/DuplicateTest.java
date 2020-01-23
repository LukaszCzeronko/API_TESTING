package validation;

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

import java.util.HashMap;
import java.util.Map;

@Epic("Query parameters tests")
public class DuplicateTest extends WeatherApiTestBase {
    private Map<String, String> baseQueryParameters = new HashMap<>();

    @BeforeClass
    @Override
    public void setUpConstants() {
        super.setUpConstants();
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "observation");
    }

    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @DataProvider(name = "duplicateTestFirstCase")
    public Object[][] duplicateElementsFirstCase() {
        return new Object[][]{
                {"TC_6.1", "app_id", "JIlgIjxb334PrWXpDC3w", 200},
                {"TC_6.2", "app_id", "JIlgIjxb334PrkXpDC3w", 200},
                {"TC_6.3", "app_code", "QZvw9AhazmUb1tY3uX40DQ", 200},
                {"TC_6.4", "app_code", "QZve9AhazmUb1tY3uX40DQ", 200},
                {"TC_6.5", "name", "Berlin", 200},
                {"TC_6.6", "name", "Paris", 200},
                {"TC_6.7", "product", "observation", 200},
                {"TC_6.8", "app_id", "JIlgIjxb334PrWXpDC3w", 200},
        };
    }

    @Feature("Supported values test")
    @Story("Duplicated query parameters")
    @Test(dataProvider = "duplicateTestFirstCase")
    @Description("Verify that one duplicated parameter returns proper status code")
    public void duplicateQueryParams(String testCaseNumber, String paramName, String paramValue, int statusCode) {
        Response response = sendRequest(Method.GET, baseQueryParameters, paramName, paramValue);
        softAssert.assertEquals(response.statusCode(), statusCode, testCaseNumber);
        softAssert.assertAll();
    }

}
