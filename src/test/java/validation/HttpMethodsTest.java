package main;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class HttpMethodsTest {

  // @BeforeClass
  //  public final void setBaseUriPath() {
  //    RestAssured.baseURI = "https://weather.api.here.com";
  //    RestAssured.basePath = "/weather/1.0/report.json";
  //  }

  private static String webPath =
      "https://weather.api.here.com/weather/1.0/report.json?app_id=JIlgIjxb334PrWXpDC3w&app_code=QZvw9AhazmUb1tY3uX40DQ&product=observation&name=Berlin";



  @DataProvider(name = "dataSetCodeStatus")
  public static Object[][] setCodeStatus() {
    String[][] StatusCode = new String[][] {{"GET", "200"}, {"POST", "405"},{"DELETE","405"},{"OPTIONS","405"},{"PUT","405"},{"HEAD","200"},{"TRACE","403"},{"PATCH","405"}};
    return StatusCode;
  }

  @Test(dataProvider = "dataSetCodeStatus")
  public static void testHTTPMethods(
      String methodName,
      String allowedMethod) {

    Response response = given().when().request(methodName, webPath);
   

    assertEquals(String.valueOf(response.statusCode()), allowedMethod);

  }


}
