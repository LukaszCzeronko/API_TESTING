package validation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.Assert.assertEquals;

public class VariationsOfMandatoryParametersTest {
  @BeforeClass
  public void setBDefaultRequestParameters() {

    RestAssured.baseURI = "https://weather.api.here.com";
    RestAssured.basePath = "/weather/1.0/report.json";
  }

  @DataProvider(name = "dataForMandatoryTest")
  public static Object[][] getEventAPIInput() {
    HashMap<String, String> queryParams1 = new HashMap<String, String>();
    HashMap<String, String> queryParams2 = new HashMap<String, String>();
    HashMap<String, String> queryParams3 = new HashMap<String, String>();
    HashMap<String, String> queryParams4 = new HashMap<String, String>();
    HashMap<String, String> queryParams5 = new HashMap<String, String>();
    HashMap<String, String> queryParams6 = new HashMap<String, String>();
    HashMap<String, String> queryParams7 = new HashMap<String, String>();
    HashMap<String, String> queryParams8 = new HashMap<String, String>();
    HashMap<String, String> queryParams9 = new HashMap<String, String>();
    HashMap<String, String> queryParams10 = new HashMap<String, String>();
    HashMap<String, String> queryParams11 = new HashMap<String, String>();
    HashMap<String, String> queryParams12 = new HashMap<String, String>();
    HashMap<String, String> queryParams13 = new HashMap<String, String>();
    HashMap<String, String> queryParams14 = new HashMap<String, String>();
    HashMap<String, String> queryParams15 = new HashMap<String, String>();
    HashMap<String, String> queryParams16 = new HashMap<String, String>();
    HashMap<String, String> queryParams17 = new HashMap<String, String>();
    HashMap<String, String> queryParams18 = new HashMap<String, String>();
    HashMap<String, String> queryParams19 = new HashMap<String, String>();
    HashMap<String, String> queryParams20 = new HashMap<String, String>();
    HashMap<String, String> queryParams21 = new HashMap<String, String>();
    HashMap<String, String> queryParams22 = new HashMap<String, String>();

    // Ok Tests!
    queryParams1.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParams1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams1.put("name", "Berlin");
    queryParams1.put("product", "observation");

    // authorization Tests//

    queryParams2.put("app_iD", "JIlgIjxb334PrWXpDC3w"); // app_id ->app_iD
    queryParams2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams2.put("product", "observation");
    queryParams2.put("latitude", "52.5170365");
    queryParams2.put("longitude", "13.3888599");

    queryParams3.put("App_id", "JIlgIjxb334PrWXpDC3w"); // app_id->App_id
    queryParams3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams3.put("product", "observation");
    queryParams3.put("latitude", "52.5170365");
    queryParams3.put("longitude", "13.3888599"); //

    queryParams4.put("App_id", "JIlgIjxb334PrWXpDC3w");
    queryParams4.put("app__code", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->app__code
    queryParams4.put("product", "observation");
    queryParams4.put("latitude", "52.5170365");
    queryParams4.put("longitude", "13.3888599"); //
    // mandatory parameter
    queryParams5.put("App_id", "JIlgIjxb334PrWXpDC3w");
    queryParams5.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams5.put("product", "observation");
    queryParams5.put("latitude", "52.5170365");
    queryParams5.put("longitudes", "13.3888599"); // longitude->longitudes

    queryParams6.put("App_id", "JIlgIjxb334PrWXpDC3w");
    queryParams6.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams6.put("product", "observation");
    queryParams6.put("latitude", "52.5170365");
    queryParams6.put("Longitude", "13.3888599"); // longitude->Longitude

    // query parameters test
    queryParams7.put(
        "app_id", "jIlgIjxb334PrWXpDC3W"); // small letters to capital and vice versa in app id
    queryParams7.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams7.put("product", "observation");
    queryParams7.put("latitude", "52.5170365");
    queryParams7.put("longitude", "13.3888599");

    queryParams8.put("app_id", "JIlgIjxb334PrWXpDC3w"); // same app_id and app_code
    queryParams8.put("app_code", "JIlgIjxb334PrWXpDC3w");
    queryParams8.put("name", "Berlin");
    queryParams8.put("product", "observation");

    queryParams9.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParams9.put("app_code", "QZvw9AhazMUb1tY3uX40DQ"); // letter change
    queryParams9.put("name", "Berlin");
    queryParams9.put("product", "observation");

    queryParams10.put(
        "app_id", "JIlgIjxb334PrWXpDC3w"); // small letter in Berlin, should work properly
    queryParams10.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams10.put("name", "berlin");
    queryParams10.put("product", "observation");

    queryParams11.put(
        "app_id", "JIlgIjxb334PrWXpDC3w"); // capital letter in observation, should't work properly
    queryParams11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams11.put("name", "Berlin");
    queryParams11.put("product", "Observation");

    queryParams12.put("app_id", "JIlgIjxb334PrWXpDC3w"); // Wrong city
    queryParams12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParams12.put("name", "BerlinS");
    queryParams12.put("product", "Observation");

    queryParams13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // wrong zipCode
    queryParams13.put("zipcode", "-1");
    queryParams13.put("product", "observation");
    queryParams13.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParams13.put("app_id", "JIlgIjxb334PrWXpDC3w");

    queryParams14.put(
        "app_id", "JIlgIjxb334PrWXpDC3w"); // small letters to capital and vice versa in app id
    queryParams14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // wrong latitude and longitude
    queryParams14.put("product", "observation");
    queryParams14.put("latitude", "523.5170365");
    queryParams14.put("longitude", "193.3888599");

    queryParams15.put("app_id", "JIlgIjxb334PrWXpDC3w"); // wrong app_code
    queryParams15.put("app_code", "QZvw9AhazmUb1tY3uX40DQas"); //
    queryParams15.put("name", "Berlin"); //
    queryParams15.put("product", "observation"); //

    // latitude and longitude test. The valid range of latitude in degrees is -90 and +90  Longitude
    // is in the range -180 and +180

    queryParams16.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams16.put("name", "Berlin"); // good parameters
    queryParams16.put("product", "observation"); // good parameters
    queryParams16.put("latitude", "52.5170365"); // same parameters
    queryParams16.put("longitude", "13.3888599"); //

    queryParams17.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams17.put("name", "Berlin"); // good parameters
    queryParams17.put("product", "observation"); // good parameters
    queryParams17.put("latitude", "11.5170365"); // dif param
    queryParams17.put("longitude", "14.3888599"); //

    queryParams18.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams18.put("product", "observation"); // good parameters
    queryParams18.put("latitude", "78.399543"); // max lat
    queryParams18.put("longitude", "13.3888599"); //

    queryParams19.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams19.put("product", "observation"); // good parameters
    queryParams19.put("latitude", "89.9999"); // min
    queryParams19.put("longitude", "13.3888599"); //

    queryParams20.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams20.put("product", "observation"); // good parameters
    queryParams20.put("latitude", "83.9999"); //
    queryParams20.put("longitude", "-179.9999"); // min

    queryParams21.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams21.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams21.put("product", "observation"); // good parameters
    queryParams21.put("latitude", "13.242"); //
    queryParams21.put("longitude", "179.999"); // max

    queryParams22.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams22.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams22.put("product", "observation"); // good parameters
    queryParams22.put("latitude", "11"); // int
    queryParams22.put("longitude", "0"); // int

    Object[][] retObjArr = {
      {"Tc_1.1-Authorization problem", queryParams1},
      {"TC_1.2-Authorization problem", queryParams2},
      {"TC_1.3-Authorization problem", queryParams3},
      {"TC_1.4-Authorization problem", queryParams4},
      {"TC_1.5-Mandatory parameter problem", queryParams5},
      {"TC_1.6-Mandatory parameter problem", queryParams6},
      {"Tc_1.7-Authorization problem", queryParams7},
      {"TC_1.8-Authorization problem", queryParams8},
      {"TC_1.9-Authorization problem", queryParams9},
      {"TC_1.10-Mandatory parameter problem", queryParams10},
      {"TC_1.11-Mandatory parameter problem", queryParams11},
      {"TC_1.12-Mandatory parameter problem", queryParams12},
      {"Tc_1.13-Mandatory parameter problem", queryParams13},
      {"TC_1.14-Authorization problem", queryParams14},
      {"TC_1.15-Authorization problem", queryParams15},
      {"TC_1.16-Query parameter problem", queryParams16},
      {"TC_1.17-Query parameter problem", queryParams17},
      {"TC_1.18-Query parameter problem", queryParams18},
      {"Tc_1.19-Query parameter problem", queryParams19},
      {"TC_1.20-Query parameter problem", queryParams20},
      {"TC_1.21-Query parameter problem", queryParams21},
      {"TC_1.22-Query parameter problem", queryParams22},
    };
    return retObjArr;
  }

  @Test(dataProvider = "dataForMandatoryTest")
  public static void checkVariationOfMandatoryParameters(
      String testCaseNumber, HashMap<String, String> queryParam) {
    RequestSpecification specification = given().queryParams(queryParam);
    Response resp = specification.get();
    assertEquals(resp.statusCode(), SC_OK, testCaseNumber);
  }

  @DataProvider(name = "duplicateTest")
  public Object[][] duplicateElements() {
    HashMap<String, String> queryParams1 = new HashMap<String, String>();
    HashMap<String, String> queryParams2 = new HashMap<String, String>();
    queryParams1.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    queryParams1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ"); // good parameters
    queryParams1.put("name", "Berlin"); // good parameters
    queryParams1.put("product", "observation"); // good parameters
    queryParams2.put("app_id", "JIlgIjxb334PrWXpDC3w"); // good parameters
    Object[][] ret = {
      {queryParams1, queryParams2},
    };
    return ret;
  }

  @Test(dataProvider = "duplicateTest")
  public void duplicateQueryParam(
      HashMap<String, String> duplicateElements, HashMap<String, String> duplicateElements2) {
//map inside
    RequestSpecification specification =
        given().queryParams(duplicateElements).queryParams(duplicateElements2);
    Response resp = specification.get();
  }
}
