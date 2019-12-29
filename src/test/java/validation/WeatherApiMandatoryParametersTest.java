package validation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.Assert.assertEquals;

public class WeatherApiMandatoryParametersTest {
    @BeforeClass//
    public void setDefaultRequestParameters() {
        RestAssured.baseURI = "https://weather.api.here.com";
        RestAssured.basePath = "/weather/1.0/report.json";
    }

    @DataProvider(name = "dataForVariationTest")
    public Object[][] getEventAPIInput() {
        HashMap<String, String> queryParams1 = new HashMap<String, String>();
        HashMap<String, String> queryParams2 = new HashMap<String, String>();
        HashMap<String, String> queryParams3 = new HashMap<String, String>();
        HashMap<String, String> queryParams4 = new HashMap<String, String>();
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

        return new Object[][]{
                {"Tc_1.1", queryParams1},
                {"TC_1.2", queryParams2},
                {"TC_1.3 ", queryParams3},
                {"TC_1.4", queryParams4},
        };
    }

    @Test(dataProvider = "dataForVariationTest")
    public static void requiredMandatoryParameters(String testNumber, HashMap<String, String> queryParams) {
        RequestSpecification requestSpecification = given().queryParams(queryParams);
        Response webResponse = requestSpecification.get();
        assertEquals(webResponse.statusCode(), SC_OK, testNumber);
    }
}
