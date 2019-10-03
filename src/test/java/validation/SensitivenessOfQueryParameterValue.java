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

public class SensitivenessOfQueryParameterValue {
  @BeforeClass
  public void setBDefaultRequestParameters() {

    RestAssured.baseURI = "https://weather.api.here.com";
    RestAssured.basePath = "/weather/1.0/report.json";
  }

  @DataProvider(name = "SensitivenessOfQueryParameterValue")
  public Object[][] queryParameterNameValue() {
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

    queryParametersName1.put("app_id", "jIlgIjxb334PrWXpDC3w"); // JIlgIjxb334PrWXpDC3w->jIlgIjxb334PrWXpDC3w
    queryParametersName1.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName1.put("name", "Berlin");
    queryParametersName1.put("product", "observation");

    queryParametersName2.put("app_id", "JIlgIjxb334PrWXpDC3W"); // JIlgIjxb334PrWXpDC3w->JIlgIjxb334PrWXpDC3W
    queryParametersName2.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName2.put("name", "Berlin");
    queryParametersName2.put("product", "observation");

    queryParametersName3.put("app_id", "JIlgIjxb33PrWXpDC3w"); // JIlgIjxb334PrWXpDC3w->JIlgIjxb33PrWXpDC3w
    queryParametersName3.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName3.put("name", "Berlin");
    queryParametersName3.put("product", "observation");

    queryParametersName4.put("app_id", "JIlgIjxb334P_rWXpDC3w"); // JIlgIjxb334PrWXpDC3w->JIlgIjxb334P_rWXpDC3w
    queryParametersName4.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName4.put("name", "Berlin");
    queryParametersName4.put("product", "observation");

    queryParametersName5.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName5.put("app_code", "qZvw9AhazmUb1tY3uX40DQ"); // QZvw9AhazmUb1tY3uX40DQ->qZvw9AhazmUb1tY3uX40DQ
    queryParametersName5.put("name", "Berlin");
    queryParametersName5.put("product", "observation");

    queryParametersName6.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName6.put("app_code", "QZvw9AhazmUb1.tY3uX40DQ"); // QZvw9AhazmUb1tY3uX40DQ->QZvw9AhazmUb1.tY3uX40DQ
    queryParametersName6.put("name", "Berlin");
    queryParametersName6.put("product", "observation");

    queryParametersName7.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName7.put("app_code", "QZvw9AhazmUb1tY3uX40Dq"); // QZvw9AhazmUb1tY3uX40DQ->QZvw9AhazmUb1tY3uX40Dq
    queryParametersName7.put("name", "Berlin");
    queryParametersName7.put("product", "observation");

    queryParametersName8.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName8.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName8.put("name", "berlin"); // Berlin->berlin
    queryParametersName8.put("product", "observation");

    queryParametersName9.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName9.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName9.put("name", "Berlins"); // Berlin->Berlins
    queryParametersName9.put("product", "observation");

    queryParametersName10.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName10.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName10.put("name", "Berlin."); // Berlin->Berlin.
    queryParametersName10.put("product", "Observation"); // observation->Observation

    queryParametersName11.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName11.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName11.put("name", "Berlin");
    queryParametersName11.put("product", "Observation"); // observation->Observation

    queryParametersName12.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName12.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName12.put("name", "Berlin");
    queryParametersName12.put("product", "forecast_7day"); // forecast_7days->forecast_7day

    queryParametersName13.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName13.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName13.put("name", "Berlin");
    queryParametersName13.put("product", "forecast_days_simple"); // forecast_7days_simple ->forecast_days_simple

    queryParametersName14.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName14.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName14.put("name", "Berlin");
    queryParametersName14.put("product", "forecast_Hourly"); // forecast_hourly ->forecast_Hourly

    queryParametersName15.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName15.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName15.put("name", "Berlin");
    queryParametersName15.put("product", "foreCast_astronomy"); // forecast_astronomy->foreCast_astronomy

    queryParametersName16.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName16.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName16.put("latitude ", "10");
    queryParametersName16.put("longitude ", "Berlin"); // 10->Berlin
    queryParametersName16.put("product", "alerts."); // alerts->alerts.

    queryParametersName17.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName17.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName17.put("latitude ", "10");
    queryParametersName17.put("longitude ", "11,3"); // 11->11,3
    queryParametersName17.put("product", "observation");

    queryParametersName18.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName18.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName18.put("zipcode", "Berlin"); // wrong
    queryParametersName18.put("product", "observation");

    queryParametersName19.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName19.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName19.put("zipcode", "33.2");
    queryParametersName19.put("product", "observation");

    queryParametersName20.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName20.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName20.put("zipcode", "11111111111");
    queryParametersName20.put("product", "observation");

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
    queryParametersName23.put("metric", "0"); // true->0

    queryParametersName24.put("app_id", "JIlgIjxb334PrWXpDC3w");
    queryParametersName24.put("app_code", "QZvw9AhazmUb1tY3uX40DQ");
    queryParametersName24.put("name", "Berlin");
    queryParametersName24.put("product", "observation");
    queryParametersName24.put("metric", "NO"); // true->no

    Object[][] returnValue = {
      {
        queryParametersName1,
        "TC_5.0 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName2,
        "TC_5.1 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName3,
        "TC_5.2 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName4,
        "TC_5.3 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName5,
        "TC_5.4 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName6,
        "TC_5.5 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName7,
        "TC_5.6 Authorization Test. Sensitiveness of query parameter value.",
        401
      },
      {
        queryParametersName8,
        "TC_5.7 Authorization Test. Sensitiveness of query parameter name.",
        200
      },
      {
        queryParametersName9,
        "TC_5.8 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        200
      },
      {
        queryParametersName10,
        "TC_5.9 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName11,
        "TC_5.10 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName12,
        "TC_5.11 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName13,
        "TC_5.12 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName14,
        "TC_5.13 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName15,
        "TC_5.14 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName16,
        "TC_5.15 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName17,
        "TC_5.16 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName18,
        "TC_5.17 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName19,
        "TC_5.18 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName20,
        "TC_5.19 Bad Request. Sensitiveness of query parameter value. Mandatory.",
        400
      },
      {
        queryParametersName21,
        "TC_5.20 Bad Request. Sensitiveness of query parameter value. Optional.",
        200
      },
      {
        queryParametersName22,
        "TC_5.21 Bad Request. Sensitiveness of query parameter value. Optional.",
        200
      },
      {
        queryParametersName23,
        "TC_5.22 Bad Request. Sensitiveness of query parameter value. Optional.",
        200
      },
      {
        queryParametersName24,
        "TC_5.23 Bad Request. Sensitiveness of query parameter value. Optional.",
        200
      },
    };
    return returnValue;
  }

  @Test(dataProvider = "SensitivenessOfQueryParameterValue")
  public void QueryParameterValueTest(
      HashMap<String, String> queryParameters, String message, int codeValue) {
    RequestSpecification specification = given().queryParams(queryParameters);
    Response resp = specification.get();
    assertEquals(resp.statusCode(), codeValue, message);
  }
}
