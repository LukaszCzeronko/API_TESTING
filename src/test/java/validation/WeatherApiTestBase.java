package validation;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

@Epic("Query parameters tests")
public class WeatherApiTestBase {
    protected SoftAssert softAssert;

    @BeforeClass
    public void setUpConstants() {
        baseURI = "https://weather.api.here.com";
        basePath = "/weather/1.0/report.json";
    }


    @Step("Sending {methodType} request")
    protected Response sendRequest(Method methodType, Map<String, String>... queryParameters) {
        RequestSpecification newRequestSpecification = given();
        for (Map<String, String> queryParameter : queryParameters) {
            newRequestSpecification.queryParams(queryParameter);
        }

        ByteArrayOutputStream responseOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream requestOutputStream = new ByteArrayOutputStream();
        PrintStream requestPs = new PrintStream(requestOutputStream, true);
        PrintStream responsePs = new PrintStream(responseOutputStream, true);
        RequestLoggingFilter requestLoggingFilter = new RequestLoggingFilter(requestPs);
        ResponseLoggingFilter responseLoggingFilter = new ResponseLoggingFilter(responsePs);
        newRequestSpecification.filters(requestLoggingFilter, responseLoggingFilter);
        Response response = newRequestSpecification.request(methodType);
        String requestDetails = new String(requestOutputStream.toByteArray());
        String responseDetails = new String(responseOutputStream.toByteArray());
        requestDetails(requestDetails);
        responseDetails(responseDetails);
        return response;
    }

    protected Response sendRequest(Method methodType, Map<String, String> queryParameters, String parameter, String value) {
        Map<String, String> map = new HashMap<>();
        map.put(parameter, value);
        return sendRequest(methodType, queryParameters, map);
    }


    protected String getDateWithOffset(int offset) {
        LocalDate initialData = LocalDate.now();
        return initialData.plus(Period.ofDays(offset)).toString();
    }

    @Attachment("Response_details")
    private String responseDetails(String responseDetails) {
        return responseDetails;
    }

    @Attachment("Request_details")
    private String requestDetails(String requestDetails) {
        return requestDetails;
    }
}
