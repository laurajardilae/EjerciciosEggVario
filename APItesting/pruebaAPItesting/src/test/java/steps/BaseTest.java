package steps;

import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utils.MyDriver;

public class BaseTest {
    protected Response response;
    protected SoftAssert softAssert = new SoftAssert();//cuando hago los test con este siempre dan verde jajaj
    protected String url = "https://swapi.dev/api/";
    protected String browser = "chrome";
    MyDriver driver;
    //@BeforeMethod(alwaysRun=true)
    //@Parameters({"browser","url"})
    public void beforeMethod(String browser,String url){
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }
    private void navigateTo(String url) {
        driver.getDriver().get(url);
    }
    public HomePage loadFirstPage(){
        return new HomePage(driver.getDriver());
    }
}
