package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[name='search']")
    private WebElement searchInput;
    @FindBy(css = ".pure-button")
    private WebElement searchButton;
    public CharacterPage searchText(String text){
        searchInput.sendKeys(text);
        searchButton.click();
        return new CharacterPage(super.getDriver());
    }

}