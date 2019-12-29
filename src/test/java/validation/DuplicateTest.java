package validation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DuplicateTest {

    private Map<String, String> baseQueryParameters = new HashMap<String, String>();

    @BeforeClass
    public void setBDefaultRequestParameters() {
        RestAssured.baseURI = "https://weather.api.here.com";
        RestAssured.basePath = "/weather/1.0/report.json";
        baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
        baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
        baseQueryParameters.put("name", "Berlin");
        baseQueryParameters.put("product", "observation");
    }

    @DataProvider(name = "duplicateTestFirstCase")
    public Object[][] duplicateElementsFirstCase() {
        return new Object[][]{
                {"app_id", "JIlgIjxb334PrWXpDC3w", 200},
                {"app_id", "JIlgIjxb334PrkXpDC3w", 200},
                {"app_code", "QZvw9AhazmUb1tY3uX40DQ", 200},
                {"app_code", "QZve9AhazmUb1tY3uX40DQ", 200},
                {"name", "Berlin", 200},
                {"name", "Paris", 200},
                {"product", "observation", 200}
        };
    }

    @DataProvider(name = "duplicateTestSecondCase")
    public Object[][] duplicateElementsSecondCase() {
        return new Object[][]{
                {"app_id", "JIlgIjxb334PrWXpDC3w", 200},
                {"app_id", "JIlgIjxb334PrkXpDC3w", 401},
                {"app_code", "QZve9AhazmUb1tY3uX40DQ", 401},
                {"name", "Berlin", 200},
                {"name", "Paris", 200},
                {"product", "observation", 200}
        };
    }

    @Test(dataProvider = "duplicateTestFirstCase")
    public void duplicateQueryParams(String paramName, String paramValue, int statusCode) {

        RequestSpecification specificationQueryParams =
                given().queryParams(baseQueryParameters).queryParam(paramName, paramValue);
        Response resp = specificationQueryParams.get();
        Assert.assertEquals(resp.statusCode(), statusCode, "Wrong status code returned");
    }

    // Second Case: wrong app_id ap_code in first place
    @Test(dataProvider = "duplicateTestSecondCase")
    public void duplicateQueryParam(String paramName, String paramValue, int statusCode) {

        RequestSpecification specificationQueryParam =
                given().queryParam(paramName, paramValue).queryParams(baseQueryParameters);
        Response respQueryParamsFirst = specificationQueryParam.get();
        Assert.assertEquals(
                respQueryParamsFirst.statusCode(), statusCode, "Wrong status code returned");
    }
}
