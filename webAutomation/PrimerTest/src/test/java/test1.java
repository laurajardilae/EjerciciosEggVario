import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
    WebDriver driver = null;

    @Test
    public void testWiki(){
        String driverPath = "C:\\Users\\ardil\\OneDrive\\Documentos\\Curso QC automat\\EjerciciosEggVarios\\automatizacion\\PrimerTest\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Selenium");
    }
}
