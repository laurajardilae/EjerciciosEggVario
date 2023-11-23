package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {
    WebDriver driver;

    public TestDriver() {
        String path = System.getProperty("user.dir");
        System.setProperty("webDriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}