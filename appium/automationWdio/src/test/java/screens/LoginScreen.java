package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import utils.Base.BaseScreen;

public class LoginScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement loginScreenTitle;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    private WebElement signUpOption;
    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;
    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;
    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement inputConfirmPassword;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGIN\")")
    private WebElement loginButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SIGN UP\")")
    private WebElement signUpButton;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement okButton;
    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement alertTitle;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public void sendKeysInputEmail(String keys) {
        this.sendKeysOnElement(this.inputEmail, keys);
    }

    public void sendKeysInputPassword(String keys) {
        this.sendKeysOnElement(this.inputPassword, keys);
    }

    public void sendKeysInputConfimPassword(String keys) {
        this.sendKeysOnElement(this.inputConfirmPassword, keys);
    }
    public void tapSignUpOption() {
        this.clickOnElement(this.signUpOption);
    }
    public void tapLoginButton() {
        this.clickOnElement(this.loginButton);
    }
    public void tapSignUpButton() {
        this.clickOnElement(this.signUpButton);
    }
    public void tapOk() {
        this.clickOnElement(this.okButton);
    }
    public WebElement getLoginScreenTitle() {
        return loginScreenTitle;
    }

    public WebElement getAlertTitle() {
        return alertTitle;
    }
}