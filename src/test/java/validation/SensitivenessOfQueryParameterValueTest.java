package validation;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


@Epic("Query parameters tests")
public class SensitivenessOfQueryParameterValueTest extends WeatherApiTestBase {
    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @DataProvider(name = "sensitivenessOfQueryParameterValue")
    public Object[][] queryParameterNameValue() {
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

        queryParametersName1.put("app_id", "JIlgIjxb334PrWXpDc3w"); // JIlgIjxb334PrWXpDC3w->jIlgIjxb334PrWXpDc3W
        queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName1.put("name", "Berlin");
        queryParametersName1.put("product", "observation");

        queryParametersName2.put("app_id", "JILGIJXB334PRWXPDC3W"); // JIlgIjxb334PrWXpDC3w->JILGIJXB334PRWXPDC3W
        queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName2.put("name", "Berlin");
        queryParametersName2.put("product", "observation");

        queryParametersName3.put("app_id", "jilgijxb334prwxpdc3w"); // JIlgIjxb334PrWXpDC3w->jilgijxb334prwxpdc3w
        queryParametersName3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName3.put("name", "Berlin");
        queryParametersName3.put("product", "observation");

        queryParametersName4.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName4.put("app_code", "QZvw9AhazmUb1tY3uX40dq"); // QZvw9AhazmUb1tY3uX40DQ->qZvw9AhazmUb1tY3uX40dq
        queryParametersName4.put("name", "Berlin");
        queryParametersName4.put("product", "observation");

        queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName5.put("app_code", "QZVW9AHAZMUB1TY3UX40DQ"); // QZvw9AhazmUb1tY3uX40DQ->QZVW9AHAZMUB1TY3UX40DQ
        queryParametersName5.put("name", "Berlin");
        queryParametersName5.put("product", "observation");

        queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName6.put("app_code", "qzvw9ahazmub1ty3ux40dq"); // QZvw9AhazmUb1tY3uX40DQ->qzvw9ahazmub1ty3ux40dq
        queryParametersName6.put("name", "Berlin");
        queryParametersName6.put("product", "observation");

        queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName7.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName7.put("name", "berlin"); // Berlin->berlin
        queryParametersName7.put("product", "observation");

        queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName8.put("name", "berlin"); // Berlin->berlin
        queryParametersName8.put("product", "observation");

        queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName9.put("name", "BERLIN"); // Berlin->BERLIN
        queryParametersName9.put("product", "observation");

        queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName11.put("name", "Berlin");
        queryParametersName11.put("product", "Observation"); // observation->Observation

        queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName12.put("name", "Berlin");
        queryParametersName12.put("product", "OBSERVATION"); // observation->OBSERVATION

        queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName13.put("name", "Berlin");
        queryParametersName13.put("product", "forecast_7dayS"); // forecast_7days->forecast_7dayS

        queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName14.put("name", "Berlin");
        queryParametersName14.put("product", "FORECAST_7DAYS"); // forecast_7days->FORECAST_7DAYS

        queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName15.put("name", "Berlin");
        queryParametersName15.put("product", "forecast_7Days_simple"); // forecast_7days_simple ->forecast_7Days_simple

        queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName16.put("name", "Berlin");
        queryParametersName16.put("product", "FORECAST_7DAYS_SIMPLE"); // forecast_7days_simple ->FORECAST_7DAYS_SIMPLE

        queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName17.put("name", "Berlin");
        queryParametersName17.put("product", "forecast_Hourly"); // forecast_hourly ->forecast_Hourly

        queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName18.put("name", "Berlin");
        queryParametersName18.put("product", "FORECAST_HOURLY"); // forecast_hourly ->FORECAST_HOURLY

        queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName19.put("name", "Berlin");
        queryParametersName19.put("product", "foreCast_astronomy"); // forecast_astronomy->foreCast_astronomy

        queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName20.put("name", "Berlin");
        queryParametersName20.put("product", "FORECAST_ASTRONOMY"); // forecast_astronomy->FORECAST_ASTRONOMY

        queryParametersName21.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName21.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName21.put("name", "Berlin");
        queryParametersName21.put("product", "observation");
        queryParametersName21.put("language", "pOLISH"); // polish->pOLISH

        queryParametersName22.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName22.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName22.put("name", "Berlin");
        queryParametersName22.put("product", "observation");
        queryParametersName22.put("language", "POLISH"); // polish->POLISH

        queryParametersName23.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName23.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName23.put("name", "Berlin");
        queryParametersName23.put("product", "observation");
        queryParametersName23.put("metric", "True"); // true->True

        queryParametersName24.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName24.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName24.put("name", "Berlin");
        queryParametersName24.put("product", "observation");
        queryParametersName24.put("metric", "TRUE"); // true->TRUE

        queryParametersName25.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName25.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName25.put("name", "Berlin");
        queryParametersName25.put("product", "observation");
        queryParametersName25.put("metric", "False"); // false->False

        queryParametersName26.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParametersName26.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        queryParametersName26.put("name", "Berlin");
        queryParametersName26.put("product", "observation");
        queryParametersName26.put("metric", "FALSE"); // false->FALSE

        Object[][] returnValue = {
                {"TC_5.0", queryParametersName1, 401},
                {"TC_5.1", queryParametersName2, 401},
                {"TC_5.2", queryParametersName3, 401},
                {"TC_5.3", queryParametersName4, 401},
                {"TC_5.4", queryParametersName5, 401},
                {"TC_5.5", queryParametersName6, 401},
                {"TC_5.6", queryParametersName6, 401},
                {"TC_5.7", queryParametersName7, 200},
                {"TC_5.8", queryParametersName8, 200},
                {"TC_5.9", queryParametersName9, 200},
                {"TC_5.10", queryParametersName11, 400},
                {"TC_5.11", queryParametersName12, 400},
                {"TC_5.12", queryParametersName13, 400},
                {"TC_5.13", queryParametersName14, 400},
                {"TC_5.14", queryParametersName15, 400},
                {"TC_5.15", queryParametersName16, 400},
                {"TC_5.16", queryParametersName17, 400},
                {"TC_5.17", queryParametersName18, 400},
                {"TC_5.18", queryParametersName19, 400},
                {"TC_5.19", queryParametersName20, 400},
                {"TC_5.20", queryParametersName21, 200},
                {"TC_5.21", queryParametersName22, 200},
                {"TC_5.22", queryParametersName23, 200},
                {"TC_5.23", queryParametersName24, 200},
                {"TC_5.24", queryParametersName25, 200},
                {"TC_5.25", queryParametersName26, 200},
        };
        return returnValue;
    }

    @Feature("Case sensitiveness test")
    @Story("Query Value sensitiveness test ")
    @Test(dataProvider = "sensitivenessOfQueryParameterValue")
    @Description("Verify sensitiveness of parameter value")
    public void queryParameterValueTest(String message, HashMap<String, String> queryParameters, int statusCode) {
        Response response = sendRequest(Method.GET, queryParameters);
        softAssert.assertEquals(response.statusCode(), statusCode, message);
        softAssert.assertAll();
    }
}
