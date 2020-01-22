package validation;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.Map;

@Epic("Security testing")
public class AuthenticationTest extends WeatherApiTestBase {

    private Map<String, String> baseQueryParameters = new HashMap<>();
    SoftAssert softAssert;

    @BeforeClass
    @Override
    public void setUpConstants() {
        super.setUpConstants();
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "observation");
    }

    @DataProvider(name = "loginData")
    public Object[][] setupLoginData() {

        Map<String, String> queryParams1 = new HashMap<>();
        Map<String, String> queryParams2 = new HashMap<>();
        Map<String, String> queryParams3 = new HashMap<>();
        Map<String, String> queryParams4 = new HashMap<>();
        Map<String, String> queryParams5 = new HashMap<>();
        Map<String, String> queryParams6 = new HashMap<>();
        Map<String, String> queryParams7 = new HashMap<>();
        Map<String, String> queryParams8 = new HashMap<>();
        Map<String, String> queryParams9 = new HashMap<>();
        Map<String, String> queryParams10 = new HashMap<>();
//correct
        queryParams1.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
//wrong
        queryParams2.put("app_id", "JIlgIjxb3334PrWXpDC3w");//JIlgIjxb334PrWXpDC3w->JIlgIjxb3334PrWXpDC3w
        queryParams2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");

        queryParams3.put("app_id", "JIlgIjxb334PrWXpDC3");//JIlgIjxb334PrWXpDC3w->JIlgIjxb334PrWXpDC3
        queryParams3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");

        queryParams4.put("app_id", "JIlgIjxb_334PrWXpDC3w");//JIlgIjxb334PrWXpDC3w->JIlgIjxb_334PrWXpDC3w
        queryParams4.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");

        queryParams5.put("app_id", "JIlgIjxb334 PrWXpDC3w");//JIlgIjxb334PrWXpDC3w->JIlgIjxb334 PrWXpDC3w
        queryParams5.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");

        queryParams6.put("app_id", "QZvw9AhazmUb1tY3uX40DQ");//JIlgIjxb334PrWXpDC3w->QZvw9AhazmUb1tY3uX40DQ
        queryParams6.put("app_code", "JIlgIjxb334PrWXpDC3w");//QZvw9AhazmUb1tY3uX40DQ->JIlgIjxb334PrWXpDC3w

        queryParams7.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams7.put("app_code", "QZ9AhazmUb1tY3uX40DQ");//QZ9AhazmUb1tY3uX40DQ->QZvw9AhazmUb1tY3uX40DQ

        queryParams8.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ-");//QZvw9AhazmUb1tY3uX40DQ->QZvw9AhazmUb1tY3uX40DQ-

        queryParams9.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams9.put("app_code", "/nQZvw9AhazmUb1tY3uX40DQ");//QZvw9AhazmUb1tY3uX40DQ->/nQZvw9AhazmUb1tY3uX40DQ

        queryParams10.put("app_id", "JIlgIjxb334PrWXpDC3w");
        queryParams10.put("app_code", "QZvw9AhazmUb 1tY3uX40DQ");//QZvw9AhazmUb1tY3uX40DQ->QZvw9AhazmUb 1tY3uX40DQ
        return new Object[][]{
                {"TC_3.1", queryParams1, 200}, {"TC_3.2", queryParams2, 401}, {"TC_3.3", queryParams3, 401}, {"TC_3.4", queryParams4, 401}, {"TC_3.5", queryParams5, 401},
                {"TC_3.6", queryParams6, 401}, {"TC_3.7", queryParams7, 401}, {"TC_3.8", queryParams8, 401}, {"TC_3.9", queryParams9, 401}, {"TC_3.10", queryParams10, 401}
        };
    }

    @BeforeMethod
    void beforeTest() {
        softAssert = new ExtendedSoftAssert();
    }

    @Feature("Authentication tests")
    @Test(dataProvider = "loginData")
    @Description("Verify that HTTP code for authentication parameters {parameters} is equal to {statusCode}")
    public void authenticationTest(String testCaseNumber, HashMap<String, String> parameters, int statusCode) {
        Response response = sendRequest(Method.GET, baseQueryParameters, parameters);
        softAssert.assertEquals(response.statusCode(), statusCode, testCaseNumber);
        softAssert.assertAll();
    }
}
