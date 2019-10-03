package validation;

import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class HttpMethodsTest {

  private static final String BASE_URL =
      "https://weather.api.here.com/weather/1.0/report.json?app_id=JIlgIjxb334PrWXpDC3w&app_code=QZvw9AhazmUb1tY3uX40DQ&product=observation&name=Berlin";

  @DataProvider(name = "dataSetStatusCodes")
  public Object[][] setCodeStatus() {
    Object[][] statusCode =
        new Object[][] {
          {"TC_2.1","GET", 200},//DOROBIĆ
          {"POST", 405},
          {"DELETE", 405},
          {"OPTIONS", 405},
          {"PUT", 405},
          {"HEAD", 200},
          {"TRACE", 403},
          {"PATCH", 405}
        };
    return statusCode;
  }

  @Test(dataProvider = "dataSetStatusCodes")
  public void testHttpMethods(String methodName, int httpCode) {
    Response response = given().when().request(methodName, BASE_URL);

    assertEquals(response.statusCode(), httpCode, "Wrong response status code.");
  }
}
