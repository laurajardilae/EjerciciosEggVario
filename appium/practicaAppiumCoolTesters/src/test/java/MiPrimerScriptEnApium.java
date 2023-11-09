import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MiPrimerScriptEnApium { //no funciona



    @Test
    public void setUp() throws MalformedURLException {
        //Android driver
        AndroidDriver driver;
        //Desire capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "cf0805040421");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appVersion",11);
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");

        //init driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("Driver creado, ingresando a la app...");

        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Forms\"]")).click();
    }



}
