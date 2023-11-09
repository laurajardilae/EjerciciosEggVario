package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Base.BaseScreen;

public class DragScreen extends BaseScreen {


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag and Drop\")")
    private WebElement dragScreenTitle;
    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getDragScreenTitle() {
        return dragScreenTitle;
    }
}
