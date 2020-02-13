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
    private Map<String, String> baseQueryParameters = new HashMap<>();
    private Response response;
    List<Map> dataProvider = new ArrayList<>();

    @Before
    public void setConstants() {
        basePath = "/weather/1.0/report.json";
        baseURI = "https://weather.api.here.com";
        softAssert = new ExtendedSoftAssert();
    }

    @Given("I have a base query parameters")
    public void I_have_a_base_query_parameters() {
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "forecast_hourly");
    }

    @Given("I have a base query parameters without given geographic longitude or latitude")
    public void i_have_a_base_query_parameters_without_given_geographic_longitude_or_latitude() {
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("product", "observation");
    }

    @Given("I have base query parameters with missing authentication credentials")
    public void i_have_base_query_parameters_with_missing_authentication_credentials() {
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "observation");
    }

    @Given("I have base mandatory parameters")
    public void i_have_base_mandatory_parameters() {
        Map<String, String> queryParams1 = new HashMap<>();
        Map<String, String> queryParams2 = new HashMap<>();
        Map<String, String> queryParams3 = new HashMap<>();
        Map<String, String> queryParams4 = new HashMap<>();
        queryParams1.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParams1.put("name", "Berlin");
        queryParams1.put("product", "observation");

        queryParams2.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParams2.put("product", "observation");
        queryParams2.put("latitude", "52.5170365");
        queryParams2.put("longitude", "13.3888599");

        queryParams3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParams3.put("zipcode", "99501");
        queryParams3.put("product", "observation");
        queryParams3.put("app_id", "JIlgIjxb334PrWXpDC3w");

        queryParams4.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams4.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParams4.put("name", "Warsaw");
        queryParams4.put("product", "observation");
        queryParams4.put("language", "polish");
        this.dataProvider.add(queryParams1);
        this.dataProvider.add(queryParams2);
        this.dataProvider.add(queryParams3);
        this.dataProvider.add(queryParams4);
    }

    @Given("I have query parameters name with changed lower or upper case letters")
    public void i_have_query_parameters_name_with_changed_lower_or_upper_case_letters() {
        Map<String, String> queryParametersName1 = new HashMap<>();
        Map<String, String> queryParametersName2 = new HashMap<>();
        Map<String, String> queryParametersName3 = new HashMap<>();
        Map<String, String> queryParametersName4 = new HashMap<>();
        Map<String, String> queryParametersName5 = new HashMap<>();
        Map<String, String> queryParametersName6 = new HashMap<>();
        Map<String, String> queryParametersName7 = new HashMap<>();
        Map<String, String> queryParametersName8 = new HashMap<>();
        Map<String, String> queryParametersName9 = new HashMap<>();
        Map<String, String> queryParametersName10 = new HashMap<>();
        Map<String, String> queryParametersName11 = new HashMap<>();
        Map<String, String> queryParametersName12 = new HashMap<>();
        Map<String, String> queryParametersName13 = new HashMap<>();
        Map<String, String> queryParametersName14 = new HashMap<>();
        Map<String, String> queryParametersName15 = new HashMap<>();
        Map<String, String> queryParametersName16 = new HashMap<>();
        Map<String, String> queryParametersName17 = new HashMap<>();
        Map<String, String> queryParametersName18 = new HashMap<>();
        Map<String, String> queryParametersName19 = new HashMap<>();
        Map<String, String> queryParametersName20 = new HashMap<>();

        queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName1.put("name", "Berlin");
        queryParametersName1.put("product", "observation");

        queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName2.put("name", "Berlin");
        queryParametersName2.put("product", "observation");

        queryParametersName3.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName3.put("name", "Berlin");
        queryParametersName3.put("product", "observation");

        queryParametersName4.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName4.put("name", "Berlin");
        queryParametersName4.put("product", "observation");

        queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName5.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName5.put("product", "observation");

        queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName6.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName6.put("product", "observation");

        queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName7.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName7.put("name", "Berlin");

        queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName8.put("name", "Berlin");

        queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName9.put("longitude", "12");
        queryParametersName9.put("product", "observation");

        queryParametersName10.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName10.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName10.put("longitude", "12");
        queryParametersName10.put("product", "observation");

        queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName11.put("latitude", "11");
        queryParametersName11.put("product", "observation");

        queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName12.put("latitude", "11");
        queryParametersName12.put("product", "observation");

        queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName13.put("product", "observation");

        queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName14.put("product", "observation");

        queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName15.put("name", "Berlin");
        queryParametersName15.put("product", "observation");

        queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName16.put("name", "Berlin");
        queryParametersName16.put("product", "observation");

        queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName17.put("name", "Berlin");
        queryParametersName17.put("product", "observation");

        queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName18.put("name", "Berlin");
        queryParametersName18.put("product", "observation");
        queryParametersName18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");

        queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName19.put("name", "Berlin");
        queryParametersName19.put("product", "observation");

        queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName20.put("name", "Berlin");
        queryParametersName20.put("product", "observation");
        this.dataProvider.add(queryParametersName1);
        this.dataProvider.add(queryParametersName2);
        this.dataProvider.add(queryParametersName3);
        this.dataProvider.add(queryParametersName4);
        this.dataProvider.add(queryParametersName5);
        this.dataProvider.add(queryParametersName6);
        this.dataProvider.add(queryParametersName7);
        this.dataProvider.add(queryParametersName8);
        this.dataProvider.add(queryParametersName9);
        this.dataProvider.add(queryParametersName10);
        this.dataProvider.add(queryParametersName11);
        this.dataProvider.add(queryParametersName12);
        this.dataProvider.add(queryParametersName13);
        this.dataProvider.add(queryParametersName14);
        this.dataProvider.add(queryParametersName15);
        this.dataProvider.add(queryParametersName16);
        this.dataProvider.add(queryParametersName17);
        this.dataProvider.add(queryParametersName18);
        this.dataProvider.add(queryParametersName19);
        this.dataProvider.add(queryParametersName20);
    }

    @Given("I have query parameters value with changed lower or upper case letters")
    public void i_have_query_parameters_value_with_changed_lower_or_upper_case_letters() {
        Map<String, String> queryParametersName1 = new HashMap<>();
        Map<String, String> queryParametersName2 = new HashMap<>();
        Map<String, String> queryParametersName3 = new HashMap<>();
        Map<String, String> queryParametersName4 = new HashMap<>();
        Map<String, String> queryParametersName5 = new HashMap<>();
        Map<String, String> queryParametersName6 = new HashMap<>();
        Map<String, String> queryParametersName7 = new HashMap<>();
        Map<String, String> queryParametersName8 = new HashMap<>();
        Map<String, String> queryParametersName9 = new HashMap<>();
        Map<String, String> queryParametersName11 = new HashMap<>();
        Map<String, String> queryParametersName12 = new HashMap<>();
        Map<String, String> queryParametersName13 = new HashMap<>();
        Map<String, String> queryParametersName14 = new HashMap<>();
        Map<String, String> queryParametersName15 = new HashMap<>();
        Map<String, String> queryParametersName16 = new HashMap<>();
        Map<String, String> queryParametersName17 = new HashMap<>();
        Map<String, String> queryParametersName18 = new HashMap<>();
        Map<String, String> queryParametersName19 = new HashMap<>();
        Map<String, String> queryParametersName20 = new HashMap<>();
        Map<String, String> queryParametersName21 = new HashMap<>();
        Map<String, String> queryParametersName22 = new HashMap<>();
        Map<String, String> queryParametersName23 = new HashMap<>();
        Map<String, String> queryParametersName24 = new HashMap<>();
        Map<String, String> queryParametersName25 = new HashMap<>();
        Map<String, String> queryParametersName26 = new HashMap<>();

        queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName1.put("name", "Berlin");
        queryParametersName1.put("product", "observation");

        queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName2.put("name", "Berlin");
        queryParametersName2.put("product", "observation");

        queryParametersName3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName3.put("name", "Berlin");
        queryParametersName3.put("product", "observation");

        queryParametersName4.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName4.put("name", "Berlin");
        queryParametersName4.put("product", "observation");

        queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName5.put("name", "Berlin");
        queryParametersName5.put("product", "observation");

        queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName6.put("name", "Berlin");
        queryParametersName6.put("product", "observation");

        queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName7.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName7.put("product", "observation");

        queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName8.put("product", "observation");

        queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName9.put("product", "observation");

        queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName11.put("name", "Berlin");

        queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName12.put("name", "Berlin");

        queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName13.put("name", "Berlin");

        queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName14.put("name", "Berlin");

        queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName15.put("name", "Berlin");

        queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName16.put("name", "Berlin");

        queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName17.put("name", "Berlin");

        queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName18.put("name", "Berlin");

        queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName19.put("name", "Berlin");

        queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName20.put("name", "Berlin");

        queryParametersName21.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName21.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName21.put("name", "Berlin");
        queryParametersName21.put("product", "observation");

        queryParametersName22.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName22.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName22.put("name", "Berlin");
        queryParametersName22.put("product", "observation");

        queryParametersName23.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName23.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName23.put("name", "Berlin");
        queryParametersName23.put("product", "observation");

        queryParametersName24.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName24.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName24.put("name", "Berlin");
        queryParametersName24.put("product", "observation");

        queryParametersName25.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName25.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName25.put("name", "Berlin");
        queryParametersName25.put("product", "observation");

        queryParametersName26.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName26.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName26.put("name", "Berlin");
        queryParametersName26.put("product", "observation");

        this.dataProvider.add(queryParametersName1);
        this.dataProvider.add(queryParametersName2);
        this.dataProvider.add(queryParametersName3);
        this.dataProvider.add(queryParametersName4);
        this.dataProvider.add(queryParametersName5);
        this.dataProvider.add(queryParametersName6);
        this.dataProvider.add(queryParametersName7);
        this.dataProvider.add(queryParametersName8);
        this.dataProvider.add(queryParametersName9);
        this.dataProvider.add(queryParametersName11);
        this.dataProvider.add(queryParametersName12);
        this.dataProvider.add(queryParametersName13);
        this.dataProvider.add(queryParametersName14);
        this.dataProvider.add(queryParametersName15);
        this.dataProvider.add(queryParametersName16);
        this.dataProvider.add(queryParametersName17);
        this.dataProvider.add(queryParametersName18);
        this.dataProvider.add(queryParametersName19);
        this.dataProvider.add(queryParametersName20);
        this.dataProvider.add(queryParametersName21);
        this.dataProvider.add(queryParametersName22);
        this.dataProvider.add(queryParametersName23);
        this.dataProvider.add(queryParametersName24);
        this.dataProvider.add(queryParametersName25);
        this.dataProvider.add(queryParametersName26);
    }

    @When("I send request with method name {string}")
    public void I_send_request_with_method_name(String methodType) {
        Method method = Method.valueOf(methodType.trim());
        response = sendRequest(method, this.baseQueryParameters);
    }

    @When("I send request with specified date from current day {int}")
    public void i_send_request_with_specified_date_from_current_day(Integer day) {
        response = sendRequest(Method.GET, baseQueryParameters, "hourlydate", getDateWithOffset(day));
    }

    @When("I send request with specified longitude {string} and latitude {string}")
    public void i_send_request_with_specified_longitude_and_latitude(String longitude, String latitude) {
        Map<String, String> map = new HashMap<>();
        map.put("longitude", longitude);
        map.put("latitude", latitude);
        response = sendRequest(Method.GET, baseQueryParameters, map);
    }

    @When("I send request with specified credentials {string} and {string}")
    public void i_send_request_with_specified_credentials_and(String app_id, String app_code) {
        Map<String, String> map = new HashMap<>();
        map.put("app_id", app_id);
        map.put("app_code", app_code);
        response = sendRequest(Method.GET, baseQueryParameters, map);
    }

    @When("I send request with duplicated parameter {string} = {string}")
    public void i_send_request_with_duplicated_parameter(String parameterName, String parameterValue) {
        Map<String, String> map = new HashMap<>();
        map.put(parameterName, parameterValue);
        response = sendRequest(Method.GET, baseQueryParameters, map);
    }

    @When("I send request with specified mandatory parameters for test {int}")
    public void i_send_request_with_specified_mandatory_parameters_for_test(Integer testNumber) {
        response = sendRequest(Method.GET, dataProvider.get(testNumber));
    }

    @When("I send request with specified name parameters {string} changed to {string} with value {string} in test {int}")
    public void i_send_request_with_specified_name_parameters_changed_to_with_value_in_test(String string, String parameterName, String value, Integer testNumber) {
        Map<String, String> map = new HashMap<>();
        map.put(parameterName, value);
        dataProvider.get(testNumber);
        response = sendRequest(Method.GET, dataProvider.get(testNumber), map);
    }

    @When("I send request with specified value parameters {string} changed to {string} with name {string} in test {int}")
    public void i_send_request_with_specified_value_parameters_changed_to_with_name_in_test(String string, String value, String name, Integer testNumber) {
        Map<String, String> map = new HashMap<>();
        map.put(name, value);
        response = sendRequest(Method.GET, dataProvider.get(testNumber), map);
    }

    @Then("I expect actual response code is equal to {int}")
    public void I_expect_actual_response_code_is_equal_to(Integer expectedCode) {
        softAssert.assertEquals(response.statusCode(), expectedCode.intValue());
        softAssert.assertAll();
    }

    @Then("I expect that actual data for that day is {string}")
    public void i_expect_that_actual_data_for_that_day_is(String value) {
        softAssert.assertEquals(booleanValueToString(response.getBody().asString().contains("temperature")), value);
        softAssert.assertAll();
    }

    @Then("I expect that actual data status for given parameters is {string}")
    public void i_expect_that_actual_data_status_for_given_parameters_is(String status) {
        String responseMessage = booleanValueToString(response.statusCode());
        softAssert.assertEquals(responseMessage, status);
        softAssert.assertAll();
    }

    @Then("I expect that my access to HERE Api is {string}")
    public void i_expect_that_my_access_to_HERE_Api_is(String status) {
        String responseMessage = booleanValueToString(response.statusCode());
        softAssert.assertEquals(responseMessage, status);
        softAssert.assertAll();
    }

    @Then("I expect that duplicate is {string}")
    public void i_expect_that_duplicate_is(String status) {
        String responseMessage = booleanValueToString(response.statusCode());
        softAssert.assertEquals(responseMessage, status);
        softAssert.assertAll();
    }

    @Then("I expect that my access for test HERE Api is {string}")
    public void i_expect_that_my_access_for_test_HERE_Api_is(String status) {
        String responseMessage = booleanValueToString(response.statusCode());
        softAssert.assertEquals(responseMessage, status);
        softAssert.assertAll();
    }
}
