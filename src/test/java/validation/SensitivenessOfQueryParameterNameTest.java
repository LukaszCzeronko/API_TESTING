package validation;

import io.qameta.allure.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

@Epic("Query parameters tests")
public class SensitivenessOfQueryParameterNameTest extends WeatherApiTestBase {
    SoftAssert softAssert;

    @DataProvider(name = "sensitivenessOfQueryParameterName")
    public Object[][] queryParameterNameTest() {
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

        queryParametersName1.put("App_id", "JIlgIjxb334PrWXpDC3w"); // app_id->App_id
        queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName1.put("name", "Berlin");
        queryParametersName1.put("product", "observation");

        queryParametersName2.put("APP_ID", "JIlgIjxb334PrWXpDC3w"); // app_id->APP_ID
        queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName2.put("name", "Berlin");
        queryParametersName2.put("product", "observation");

        queryParametersName3.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName3.put("App_code", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->App_code
        queryParametersName3.put("name", "Berlin");
        queryParametersName3.put("product", "observation");

        queryParametersName4.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName4.put("APP_CODE", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->APP_CODE
        queryParametersName4.put("name", "Berlin");
        queryParametersName4.put("product", "observation");

        queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName5.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName5.put("Name", "Berlin"); // name->Name
        queryParametersName5.put("product", "observation");

        queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName6.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName6.put("NAME", "Berlin"); // name->NAME
        queryParametersName6.put("product", "observation");

        queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName7.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName7.put("name", "Berlin");
        queryParametersName7.put("prodUct", "observation"); // prodUct->product

        queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName8.put("name", "Berlin");
        queryParametersName8.put("PRODUCT", "observation"); // product->PRODUCT

        queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName9.put("Latitude", "11"); // latitude->Latitude
        queryParametersName9.put("longitude", "12");
        queryParametersName9.put("product", "observation");

        queryParametersName10.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName10.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName10.put("LATITUDE", "11"); // latitude->Latitude
        queryParametersName10.put("longitude", "12");
        queryParametersName10.put("product", "observation");

        queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName11.put("latitude", "11");
        queryParametersName11.put("loNgitude", "12"); // longitude->loNgitude
        queryParametersName11.put("product", "observation");

        queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName12.put("latitude", "11");
        queryParametersName12.put("LONGITUDE ", "12"); // longitude->LONGITUDE
        queryParametersName12.put("product", "observation");

        queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName13.put("Zipcode", "98343"); // zipcode->Zipcode
        queryParametersName13.put("product", "observation");

        queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName14.put("ZIPCODE", "98343"); // zipcode->ZIPCODE
        queryParametersName14.put("product", "observation");

        queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName15.put("name", "Berlin");
        queryParametersName15.put("product", "observation");
        queryParametersName15.put("Oneobservation", "true"); // oneobservation->Oneobservation

        queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName16.put("name", "Berlin");
        queryParametersName16.put("product", "observation");
        queryParametersName16.put("ONEOBSERVATION", "true"); // oneobservation->oneobserVation

        queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName17.put("name", "Berlin");
        queryParametersName17.put("product", "observation");
        queryParametersName17.put("metRic", "true"); // metric->metRic

        queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName18.put("name", "Berlin");
        queryParametersName18.put("product", "observation");
        queryParametersName18.put("METRIC", "true"); // metric->METRIC

        queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName19.put("name", "Berlin");
        queryParametersName19.put("product", "observation");
        queryParametersName19.put("Language", "polish"); // language->Language

        queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName20.put("name", "Berlin");
        queryParametersName20.put("product", "observation");
        queryParametersName20.put("LANGUAGE", "polish"); // language->LANGUAGE
        return new Object[][]{
                {"TC_4.0", queryParametersName1, 400},
                {"TC_4.1", queryParametersName2, 400},
                {"TC_4.2", queryParametersName3, 400},
                {"TC_4.3", queryParametersName4, 400},
                {"TC_4.4", queryParametersName5, 400},
                {"TC_4.5", queryParametersName6, 400},
                {"TC_4.6", queryParametersName7, 400},
                {"TC_4.7 ", queryParametersName8, 400},
                {"TC_4.8", queryParametersName9, 400},
                {"TC_4.9", queryParametersName10, 400},
                {"TC_4.10", queryParametersName11, 400},
                {"TC_4.11", queryParametersName12, 400},
                {"TC_4.12", queryParametersName13, 400},
                {"TC_4.13", queryParametersName14, 400},
                {"TC_4.14", queryParametersName15, 200},
                {"TC_4.15", queryParametersName16, 200},
                {"TC_4.16", queryParametersName17, 200},
                {"TC_4.17", queryParametersName18, 400},
                {"TC_4.18", queryParametersName19, 200},
                {"TC_4.19", queryParametersName20, 200},
        };
    }

    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @Feature("Case sensitiveness test")
    @Story("Query name sensitiveness test ")
    @Test(dataProvider = "sensitivenessOfQueryParameterName")
    @Description("Verify sensitiveness of parameter name {queryParameters} and assert that HTTP response code is equal to {statusCode}")
    public void queryParameterNameTest(
            String message, HashMap<String, String> queryParameters, int statusCode) {
        Response response = sendRequest(Method.GET, queryParameters);
        softAssert.assertEquals(response.statusCode(), statusCode, message);
        softAssert.assertAll();

    }
}
