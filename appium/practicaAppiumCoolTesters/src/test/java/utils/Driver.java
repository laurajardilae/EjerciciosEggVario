package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Driver {
    private AndroidDriver driver;

    /*public Driver(){
        this.driver = AndroidDriver(new URL("http://127.0.0.1:4723/",getCapabilities()));
    }*/
    private DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "cf0805040421");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:app", "C:\\Users\\ardil\\OneDrive\\Documentos\\CursoQCautomat\\EjerciciosEggVarios\\appium\\Android-NativeDemoApp-0.4.0.apk");
        capabilities.setCapability("appVersion",11);
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        return capabilities;
    }
}
