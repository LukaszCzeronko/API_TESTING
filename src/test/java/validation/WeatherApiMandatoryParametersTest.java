package validation;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.Assert.assertEquals;

@Epic("Query parameters tests")
public class WeatherApiMandatoryParametersTest extends WeatherApiTestBase {

    @DataProvider(name = "dataForVariationTest")
    public Object[][] getEventAPIInput() {
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

        return new Object[][]{
                {"Tc_1.1", queryParams1},
                {"TC_1.2", queryParams2},
                {"TC_1.3 ", queryParams3},
                {"TC_1.4", queryParams4},
        };
    }

    @Feature("Mandatory parameters test")
    @Test(dataProvider = "dataForVariationTest")
    @Step("Verify proper functioning for correct mandatory parameters")
    public void requiredMandatoryParameters(String testNumber, Map<String, String> queryParams) {
        RequestSpecification requestSpecification = given().queryParams(queryParams);
        Response webResponse = requestSpecification.get();
        assertEquals(webResponse.statusCode(), SC_OK, testNumber);
    }
}
