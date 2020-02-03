package validation.cucumber;

import io.cucumber.java8.En;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.http.Method;
import io.restassured.response.Response;
import validation.ExtendedSoftAssert;
import validation.WeatherApiTestBase;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

@Epic("Security testing")
public class CucumberHttpMethodsTest extends WeatherApiTestBase implements En {
    private Map<String, String> baseQueryParameters = new HashMap<>();
    private Response response;

    public CucumberHttpMethodsTest() {
        Before(() -> {
            basePath = "/weather/1.0/report.json";
            baseURI = "https://weather.api.here.com";
            softAssert = new ExtendedSoftAssert();
        });
        Given("I have a base query parameters", () -> {
            baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
            baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
            baseQueryParameters.put("name", "Berlin");
            baseQueryParameters.put("product", "forecast_hourly");
        });

        When("I send request with method name {string}", (String methodType) -> {
            Method method = Method.valueOf(methodType.trim());
            response = sendRequest(method, baseQueryParameters);
        });

        Then("I expect actual response code is equal to {int}", (Integer expectedCode) -> {
            softAssert.assertEquals(response.statusCode(), expectedCode.intValue());
            softAssert.assertAll();
        });
    }
}
