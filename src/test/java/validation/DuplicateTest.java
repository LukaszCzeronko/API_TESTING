package validation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class DuplicateTest {
  @BeforeClass
  public void setBDefaultRequestParameters() {

    RestAssured.baseURI = "https://weather.api.here.com";
    RestAssured.basePath = "/weather/1.0/report.json";
  }

  @DataProvider(name = "duplicateTest")
  public Object[][] duplicateElements() {
    Object[][] ret = {
      {"app_id", "JIlgIjxb334PrWXpDC3w", 200, 200}, // good id
      {"app_id", "JIlgIjxb334PrkXpDC3w", 200, 401}, // wrong id
      {"app_code", "QZvw9AhazmUb1tY3uX40DQ", 200, 200}, // good code
      {"app_code", "QZve9AhazmUb1tY3uX40DQ", 200, 401}, // wrong code
      {"name", "Berlin", 200, 200}, // same
      {"name", "Paris", 200, 200},
      {"product", "observation", 200, 200}
    };
    return ret;
  }

  @Test(dataProvider = "duplicateTest")
  public static void duplicateQueryParam(
      String paramName, String paramValue, int statusCode, int statusCodeSecondCase) {
    HashMap<String, String> baseQueryParameters = new HashMap<String, String>();
    baseQueryParameters.put("app_id", "JIlgIjxb334PrWXpDC3w");
    baseQueryParameters.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    baseQueryParameters.put("name", "Berlin");
    baseQueryParameters.put("product", "observation");

    RequestSpecification specificationQueryParams =
        given().log().all().queryParams(baseQueryParameters).queryParam(paramName, paramValue);
    Response resp = specificationQueryParams.get();
    Assert.assertEquals(resp.statusCode(), statusCode, "Wrong status code returned");
    // Second Case: wrong app_id ap_code in first place
    RequestSpecification specificationQueryParam =
        given().log().all().queryParam(paramName, paramValue).queryParams(baseQueryParameters);
    Response respQueryParamsFirst = specificationQueryParam.get();

    Assert.assertEquals(
        respQueryParamsFirst.statusCode(), statusCodeSecondCase, "Wrong status code returned");
  }
}
