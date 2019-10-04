package validation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SensitivenessOfQueryParameterNameTest {
  @BeforeClass
  public void setBDefaultRequestParameters() {
    RestAssured.baseURI = "https://weather.api.here.com";
    RestAssured.basePath = "/weather/1.0/report.json";
  }
  @DataProvider(name = "sensitivenessOfQueryParameterName")
  public Object[][] queryParameterNameTest() {
    HashMap<String, String> queryParametersName1 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName2 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName3 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName4 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName5 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName6 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName7 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName8 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName9 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName10 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName11 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName12 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName13 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName14 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName15 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName16 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName17 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName18 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName19 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName20 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName21 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName22 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName23 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName24 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName25 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName26 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName27 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName28 = new HashMap<String, String>();
    HashMap<String, String> queryParametersName29 = new HashMap<String, String>();

    // "TC4.0 Authorization Test. Sensitiveness of query parameter name."
    queryParametersName1.put("App_id", "JIlgIjxb334PrWXpDC3w"); // app_id->App_id
    queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName1.put("name", "Berlin");
    queryParametersName1.put("product", "observation");

    queryParametersName2.put("app_ID", "JIlgIjxb334PrWXpDC3w"); // app_id->app_ID
    queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName2.put("name", "Berlin");
    queryParametersName2.put("product", "observation");

    queryParametersName3.put("app_iD", "JIlgIjxb334PrWXpDC3w"); // app_id->app_iD
    queryParametersName3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName3.put("name", "Berlin");
    queryParametersName3.put("product", "observation");

    queryParametersName4.put("APP_ID", "JIlgIjxb334PrWXpDC3w"); // app_id->APP_ID
    queryParametersName4.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName4.put("name", "Berlin");
    queryParametersName4.put("product", "observation");

    queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName5.put("App_code", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->App_code
    queryParametersName5.put("name", "Berlin");
    queryParametersName5.put("product", "observation");

    queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName6.put("aPp_code", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->aPp_code
    queryParametersName6.put("name", "Berlin");
    queryParametersName6.put("product", "observation");

    queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName7.put("apP_code", "QZvw9AhazmUb1tY3uX40DQ"); // apP_code->App_code
    queryParametersName7.put("name", "Berlin");
    queryParametersName7.put("product", "observation");

    queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName8.put("APP_CODE", "QZvw9AhazmUb1tY3uX40DQ"); // app_code->APP_CODE
    queryParametersName8.put("name", "Berlin");
    queryParametersName8.put("product", "observation");

    // "TC_1.9 Bad Request. Sensitiveness of query parameter name. Mandatory."
    queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName9.put("Name", "Berlin"); // name->Name
    queryParametersName9.put("product", "observation");

    queryParametersName10.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName10.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName10.put("NAME", "Berlin"); // name->NAME
    queryParametersName10.put("product", "observation");

    queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName11.put("name", "Berlin");
    queryParametersName11.put("products", "observation"); // product->products

    queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName12.put("name", "Berlin");
    queryParametersName12.put("Product", "observation"); // product->Product

    queryParametersName29.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName29.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName29.put("name", "Berlin");
    queryParametersName29.put("producT", "observation"); // product->producT

    queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName13.put("Latitude", "11"); // latitude->Latitude
    queryParametersName13.put("longitude", "12");
    queryParametersName13.put("product", "observation");

    queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName14.put("laTitude", "11"); // latitude->laTitude
    queryParametersName14.put("longitude", "12");
    queryParametersName14.put("product", "observation");

    queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName15.put("latitude", "11");
    queryParametersName15.put("loNgitude", "12"); // longitude->loNgitude
    queryParametersName15.put("product", "observation");

    queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName16.put("latitude", "11");
    queryParametersName16.put("longitude ", "12"); // longitude->longitude
    queryParametersName16.put("product", "observation");

    queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName17.put("Zipcode", "98343"); // zipcode->Zipcode
    queryParametersName17.put("product", "observation");

    queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName18.put("zipCode", "98343"); // zipcode->zipCode
    queryParametersName18.put("product", "observation");

    queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName19.put("ZIPCODE", "98343"); // zipcode->ZIPCODE
    queryParametersName19.put("product", "observation");

    queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName20.put("zip_code", "98343"); // zipcode->zip_code
    queryParametersName20.put("product", "observation");
    // TC4.Bad Request. Sensitiveness of query parameter name. Optional.
    queryParametersName21.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName21.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName21.put("name", "Berlin");
    queryParametersName21.put("product", "observation");
    queryParametersName21.put("Oneobservation", "true"); // oneobservation->Oneobservation

    queryParametersName22.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName22.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName22.put("name", "Berlin");
    queryParametersName22.put("product", "observation");
    queryParametersName22.put("oneobserVation", "true"); // oneobservation->oneobserVation

    queryParametersName23.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName23.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName23.put("name", "Berlin");
    queryParametersName23.put("product", "observation");
    queryParametersName23.put("metRics", "true"); // metric->metRic

    queryParametersName24.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName24.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName24.put("name", "Berlin");
    queryParametersName24.put("product", "observation");
    queryParametersName24.put("Metric", "true"); // metric->Metric

    queryParametersName25.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName25.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName25.put("name", "Berlin");
    queryParametersName25.put("product", "observation");
    queryParametersName25.put("METRIC", "true"); // metric->METRIC

    queryParametersName26.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName26.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName26.put("name", "Berlin");
    queryParametersName26.put("product", "observation");
    queryParametersName26.put("Language", "polish"); // language->Language

    queryParametersName27.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName27.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName27.put("name", "Berlin");
    queryParametersName27.put("product", "observation");
    queryParametersName27.put("LANGUAGe", "polish"); // language->LANGUAGe

    queryParametersName28.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName28.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName28.put("name", "Berlin");
    queryParametersName28.put("product", "observation");
    queryParametersName28.put("LANGUAGE", "polish"); // language->LANGUAGE
    Object[][] returnValue = {
      {
        queryParametersName1,
        "TC_4.0 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName2,
        "TC_4.1 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName3,
        "TC_4.2 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName4,
        "TC_4.3 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName5,
        "TC_4.4 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName6,
        "TC_4.5 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName7,
        "TC_4.6 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName8,
        "TC_4.7 Authorization Test. Sensitiveness of query parameter name.",
        400
      },
      {
        queryParametersName9,
        "TC_4.8 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName10,
        "TC_4.9 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName11,
        "TC_4.10 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName12,
        "TC_4.11 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName13,
        "TC_4.12 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName14,
        "TC_4.13 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName15,
        "TC_4.14 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName16,
        "TC_4.15 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName17,
        "TC_4.16 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName18,
        "TC_4.17 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName19,
        "TC_4.18 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName20,
        "TC_4.19 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
      {
        queryParametersName21,
        "TC_4.20Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName22,
        "TC_4.21Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName23,
        "TC_4.22Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName24,
        "TC_4.23Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName25,
        "TC_4.24Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName26,
        "TC_4.25Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName27,
        "TC_4.26Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName28,
        "TC_4.27Bad Request. Sensitiveness of query parameter name. Optional.",
        200
      },
      {
        queryParametersName29,
        "TC_4.28 Bad Request. Sensitiveness of query parameter name. Mandatory.",
        400
      },
    };
    return returnValue;
  }

  @Test(dataProvider = "sensitivenessOfQueryParameterName")
  public void QueryParameterNameTest(
      HashMap<String, String> queryParameters, String message, int codeValue) {
    RequestSpecification specification = given().queryParams(queryParameters);
    Response resp = specification.get();
    assertEquals(resp.statusCode(), codeValue, message);
  }
}
