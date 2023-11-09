package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Base.BaseScreen;

public class MainScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    private WebElement loginButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Webview\")")
    private WebElement webviewButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Forms\")")
    private WebElement formsButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Swipe\")")
    private WebElement swipeButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Drag\")")
    private WebElement dragButton;



    public MainScreen(AndroidDriver driver) {
        super(driver);
    }


    public LoginScreen tapLoginButton() {
        this.clickOnElement(this.loginButton);
        return new LoginScreen(this.driver);
    }
    public WebviewScreen tapWebviewButton() {
        this.clickOnElement(this.webviewButton);
        return new WebviewScreen(this.driver);
    }
    public FormsScreen tapFormsButton() {
        this.clickOnElement(this.formsButton);
        return new FormsScreen(this.driver);
    }
    public SwipeScreen tapSwipeButton() {
        this.clickOnElement(this.swipeButton);
        return new SwipeScreen(this.driver);
    }
    public DragScreen tapDragButton() {
        this.clickOnElement(this.dragButton);
        return new DragScreen(this.driver);
    }

}
