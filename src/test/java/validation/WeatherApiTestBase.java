package validation;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;

import static io.restassured.RestAssured.*;

@Slf4j
@Epic("Query parameters tests")
public class WeatherApiTestBase {

    @BeforeClass
    public void setUpConstants() {
        baseURI = "https://weather.api.here.com";
        basePath = "/weather/1.0/report.json";
        siteAddress();
    }

    @Attachment
    String siteAddress() {
        return baseURI + basePath;
    }

    @Step("Sending {methodType} request")
    Response sendRequest(Method methodType, Map<String, String>... queryParameters) {
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

    @Attachment("Response_details")
    String responseDetails(String responseDetails) {
        return responseDetails;
    }

    @Attachment("Request_details")
    String requestDetails(String requestDetails) {
        return requestDetails;
    }
}
