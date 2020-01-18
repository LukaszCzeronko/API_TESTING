package validation;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;

import java.util.Map;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

@Epic("Query parameters tests")
public class WeatherApiTestBase {
    @Attachment
    String printBaseDate(Map<String, String> baseQueryParameters) {
        return baseQueryParameters.toString();
    }

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

    @Attachment
    String headersReport(Response response) {
        return response.getHeaders().toString();
    }
}
