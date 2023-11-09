package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Base.BaseScreen;

public class FormsScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Form components\")")
    private WebElement formsScreenTitle;
    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getFormsScreenTitle() {
        return formsScreenTitle;
    }
}
