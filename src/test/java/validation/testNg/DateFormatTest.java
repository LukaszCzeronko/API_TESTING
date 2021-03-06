package validation.testNg;

import io.qameta.allure.Description;
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

public class DateFormatTest extends WeatherApiTestBase {
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


    @DataProvider(name = "dateNotSupported")
    public Object[][] notSupported() {
        return new Object[][]{
                {"TC_7.1", -1}, {"TC_7.2", 8},
        };
    }

    @DataProvider(name = "dateSupported")
    public Object[][] Supported() {
        return new Object[][]{
                {"TC_7.3", 0},
                {"TC_7.4", 1}, {"TC_7.5", 2},
                {"TC_7.6", 3}, {"TC_7.7", 4},
                {"TC_7.8", 5}, {"TC_7.9", 6},
                {"TC_7.10", 7}
        };
    }


    @Feature("Supported values test")
    @Story("Date format test")
    @Test(dataProvider = "dateNotSupported")
    @Description("Verify if the date for the day are not supported")
    public void dateNotSupportedTest(String testCaseNumber, int day) {
        Response response = sendRequest(Method.GET, baseQueryParameters, "hourlydate", getDateWithOffset(day));
        softAssert.assertFalse(response.getBody().asString().contains("temperature"), testCaseNumber);
        softAssert.assertAll();
    }

    @Feature("Supported values test")
    @Story("Date format test")
    @Test(dataProvider = "dateSupported")
    @Description("Verify if the date for the day are supported")
    public void dateSupportedTest(String testCaseNumber, int day) {
        Response response = sendRequest(Method.GET, baseQueryParameters, "hourlydate", getDateWithOffset(day));
        softAssert.assertTrue(response.getBody().asString().contains("temperature"), testCaseNumber);
        softAssert.assertAll();
    }
}