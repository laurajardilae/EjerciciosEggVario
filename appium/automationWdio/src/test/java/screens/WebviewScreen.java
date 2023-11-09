package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Base.BaseScreen;

public class WebviewScreen extends BaseScreen {
    public WebviewScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Toggle navigation bar\")")
    private WebElement hamburguerMenuButton;

    public WebElement getHamburguerMenuButton() {
        return hamburguerMenuButton;
    }
}
