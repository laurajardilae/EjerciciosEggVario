package utils.Base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import screens.MainScreen;
import utils.Driver;

public class BaseTest {
    protected MainScreen mainScreen;
    protected AndroidDriver driver;

    @BeforeTest
    public void preTest() {
        this.driver = new Driver().getDriver();
        this.mainScreen = new MainScreen(driver);
    }
    @AfterTest
    public void postTest(){
        this.driver.quit();
    }


}
