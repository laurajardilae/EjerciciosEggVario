import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected Response response;
    protected SoftAssert softAssert = new SoftAssert();//cuando hago los test con este siempre dan verde jajaj
    protected String url = "https://swapi.dev/api/";
}
