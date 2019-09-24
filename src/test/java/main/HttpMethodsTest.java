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
  @BeforeClass
  public final void setBaseUriPath() {
    RestAssured.baseURI = "https://weather.api.here.com";
    RestAssured.basePath = "/weather/1.0/report.json";
  }

  @DataProvider(name = "dataSet")
  public static Object[][] setApiInfo() {
    HashMap<String, String> basicData = new HashMap<String, String>();

    basicData.put("app_id", "JIlgIjxb334PrWXpDC3w");
    basicData.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    basicData.put("name", "Berlin");
    basicData.put("product", "observation");

    Object[][] dataParameters = {
      {basicData, 200, 405, 403} // HTTP Methods 200-OK 405-method not allowed 403-Method forbidden
    };
    return dataParameters;
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodGet(
      HashMap<String, String> queryData,
      int allowedMethod,
      int second,
      int forbiddenMethod) { // The GET method requests a representation of the specified resource.
    // Requests using GET should only retrieve data.

    Response response = given().queryParams(queryData).when().get();
    int valueResp = response.getStatusCode();
    String valueOfResponse = String.valueOf(response.statusCode());

    assertEquals(response.statusCode(), allowedMethod);
    System.out.println(valueOfResponse);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodPut(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The PUT method replaces all current representations of the target
    // resource with the request payload.

    Response response = given().queryParams(queryData).when().put();
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), methodNotAllowed);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodHead(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The HEAD method asks for a response identical to that of a GET
    // request, but without the response body.

    Response response = given().queryParams(queryData).when().head();
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), allowedMethod);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodPost(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The POST method is used to submit an entity to the specified
    // resource, often causing a change in state or side effects on the
    // server.

    Response response = given().queryParams(queryData).when().post();
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), methodNotAllowed);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodDelete(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The DELETE method deletes the specified resource.

    Response response = given().queryParams(queryData).when().delete();
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), methodNotAllowed);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodOption(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The OPTIONS method is used to describe the communication options for
    // the target resource.
    // String path=uriAddress()

    Response response = given().queryParams(queryData).when().options();
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), methodNotAllowed);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodTrace(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The TRACE method performs a message loop-back test along the path to
    // the target resource.

    Response response = given().queryParams(queryData).when().request(Method.TRACE);
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), forbiddenMethod);
  }

  @Test(dataProvider = "dataSet")
  public static void testMethodPatch(
      HashMap<String, String> queryData,
      int allowedMethod,
      int methodNotAllowed,
      int forbiddenMethod) { // The PATCH method is used to apply partial modifications to a
    // resource.

    Response response = given().queryParams(queryData).when().request(Method.PATCH);
    String valueOfResponse = String.valueOf(response.statusCode());
    System.out.println(valueOfResponse);
    assertEquals(response.statusCode(), methodNotAllowed);
  }
}
