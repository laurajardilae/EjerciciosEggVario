package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.LoginScreen;
import utils.Base.BaseTest;
import utils.EmailGenerator;

public class LoginScreenTest extends BaseTest {

    LoginScreen loginScreen;

    @Test
    public void visualizeLoginScreen(){
        this.loginScreen = this.mainScreen.tapLoginButton();
        Assert.assertEquals(loginScreen.getLoginScreenTitle().getText(),"Login / Sign up Form");
    }

    @Test
    public void loginTest() {
        this.loginScreen = this.mainScreen.tapLoginButton();
        this.loginScreen.sendKeysInputEmail("abc@abc.com");
        this.loginScreen.sendKeysInputPassword("12345678");
        this.loginScreen.tapLoginButton();
        Assert.assertEquals(loginScreen.getAlertTitle().getText(),"Success");
        this.loginScreen.tapOk();
    }
    @Test
    public void signUpTest(){
        this.loginScreen = this.mainScreen.tapLoginButton();
        this.loginScreen.tapSignUpOption();
        EmailGenerator emailGenerator = new EmailGenerator();
        this.loginScreen.sendKeysInputEmail(emailGenerator.emailRandomGenerator());
        this.loginScreen.sendKeysInputPassword("12345678");
        this.loginScreen.sendKeysInputConfimPassword("12345678");
        this.loginScreen.tapSignUpButton();
        Assert.assertEquals(loginScreen.getAlertTitle().getText(),"Signed Up!");
        this.loginScreen.tapOk();
    }

}
