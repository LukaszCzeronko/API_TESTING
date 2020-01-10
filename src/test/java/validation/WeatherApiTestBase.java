package validation;

import io.qameta.allure.Epic;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

@Epic("Query parameters tests")
public class WeatherApiTestBase {

    @BeforeClass
    public void setUpConstants() {
        baseURI = "https://weather.api.here.com";
        basePath = "/weather/1.0/report.json";
    }

}
