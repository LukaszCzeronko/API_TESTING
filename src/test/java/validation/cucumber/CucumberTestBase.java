package validation.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;
import io.restassured.response.Response;
import validation.ExtendedSoftAssert;
import validation.WeatherApiTestBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class CucumberTestBase extends WeatherApiTestBase {
    private Map<String,String> defaultBaseQueryParameters= new HashMap<>();
    private Map<String, String> baseQueryParameters = new HashMap<>();
    private Response response;
    @Before
    public void setDefaultBaseQueryParameters(){
        defaultBaseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        defaultBaseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        defaultBaseQueryParameters.put("name", "Berlin");
        defaultBaseQueryParameters.put("product", "forecast_hourly");
        defaultBaseQueryParameters.put("latitude", "52.5170365");
        defaultBaseQueryParameters.put("longitude", "13.3888599");
        defaultBaseQueryParameters.put("zipcode", "99501");
    }

    public void setBaseQueryParameters(String param) {
      baseQueryParameters.put(param,defaultBaseQueryParameters.get(param));
    }

    @Before
    public void setConstants() {
        basePath = "/weather/1.0/report.json";
        baseURI = "https://weather.api.here.com";
        softAssert = new ExtendedSoftAssert();
    }

    @Given("I have base {string}")
    public void i_have_base(String param) {
   setBaseQueryParameters(param);
    }
    @Given("I have base {string} {string}")
    public void i_have_base(String name, String value) {
        baseQueryParameters.put(name,value);
    }

    @When("I send request with method name {string}")
    public void I_send_request_with_method_name(String methodType) {
        Method method = Method.valueOf(methodType.trim());
        response = sendRequest(method, this.baseQueryParameters);
    }

    @When("I send request with specified {int}")
    public void i_send_request_with_specified(Integer offset) {
        response = sendRequest(Method.GET, baseQueryParameters, "hourlydate", getDateWithOffset(offset));
    }
    @When("I send request with specified {string} {string} {string} {string}")
    public void i_send_request_with_specified(String name1, String longitude, String name2, String latitude) {
        Map<String, String> map = new HashMap<>();
        map.put(name1, longitude);
        map.put(name2, latitude);
        response = sendRequest(Method.GET, baseQueryParameters, map);
    }

    @When("I send request with specified {string} {string}")
    public void i_send_request_with_specified(String name, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(name,value);

        response = sendRequest(Method.GET, baseQueryParameters,map);
    }

    @Then("I expect actual response code is equal to {int}")
    public void I_expect_actual_response_code_is_equal_to(Integer expectedCode) {
        softAssert.assertEquals(response.statusCode(), expectedCode.intValue());
        softAssert.assertAll();
    }

    @Then("I expect that actual data for that day is {string}")
    public void i_expect_that_actual_data_for_that_day_is(String value) {
        boolean responseMessage = response.getBody().asString().contains("temperature");
   if(value.contains("true")){
       softAssert.assertEquals(responseMessage,true);
   }
   if(value.contains("false")){
       softAssert.assertEquals(responseMessage,false);
   }
   softAssert.assertAll();
    }

    @Then("I expect response is {string}")
    public void I_expect_response_is(String status) {
        System.out.println(response.getStatusLine());
        softAssert.assertTrue(response.getStatusLine().contains(status));
        softAssert.assertAll();
    }
}
