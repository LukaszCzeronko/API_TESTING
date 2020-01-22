package validation;

import io.qameta.allure.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Epic("Query parameters tests")
public class DuplicateTest extends WeatherApiTestBase {
    AllureLifecycle lifecycle = Allure.getLifecycle();
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

    @DataProvider(name = "duplicateTestFirstCase")
    public Object[][] duplicateElementsFirstCase() {
        return new Object[][]{
                {"TC_6.1", "app_id", "JIlgIjxb334PrWXpDC3w", 200},
                {"TC_6.2", "app_id", "JIlgIjxb334PrkXpDC3w", 200},
                {"TC_6.3", "app_code", "QZvw9AhazmUb1tY3uX40DQ", 200},
                {"TC_6.4", "app_code", "QZve9AhazmUb1tY3uX40DQ", 200},
                {"TC_6.5", "name", "Berlin", 200},
                {"TC_6.6", "name", "Paris", 200},
                {"TC_6.7", "product", "observation", 200}
        };
    }

    @DataProvider(name = "duplicateTestSecondCase")
    public Object[][] duplicateElementsSecondCase() {
        return new Object[][]{
                {"TC_6.8", "app_id", "JIlgIjxb334PrWXpDC3w", 200},
                {"TC_6.9", "app_id", "JIlgIjxb334PrkXpDC3w", 401},
                {"TC_6.10", "app_code", "QZve9AhazmUb1tY3uX40DQ", 401},
                {"TC_6.11", "name", "Berlin", 200},
                {"TC_6.12", "name", "Paris", 200},
                {"TC_6.13", "product", "observation", 201}
        };
    }

    @Feature("Supported values test")
    @Story("Duplicated query parameters")
    @Test(dataProvider = "duplicateTestFirstCase")
    @Step("Verify that duplicated {paramName} with value {paramValue} have HTTP code {statusCode}")
    public void duplicateQueryParams(String testCaseNumber, String paramName, String paramValue, int statusCode) {
        RequestSpecification specificationQueryParams =
                given().queryParams(baseQueryParameters).queryParam(paramName, paramValue);
        Response resp = specificationQueryParams.get();
        Assert.assertEquals(resp.statusCode(), statusCode, testCaseNumber + " Wrong status code returned");
    }

    // Second Case: wrong app_id ap_code in first place
    @Feature("Supported values test")
    @Story("Duplicated query parameters")
    @Test(dataProvider = "duplicateTestSecondCase")
    @Step("Verify that duplicated {paramName} with value {paramValue} have HTTP code {statusCode}")
    public void duplicateQueryParam(String testCaseNumber, String paramName, String paramValue, int statusCode) {
        RequestSpecification specificationQueryParam =
                given().queryParam(paramName, paramValue).queryParams(baseQueryParameters);
        Response respQueryParamsFirst = specificationQueryParam.get();
        Assert.assertEquals(
                respQueryParamsFirst.statusCode(), statusCode, testCaseNumber + " Wrong status code returned");
        lifecycle.updateTestCase(testResult -> testResult.setName("CHANGED_NAME"));

    }
}
