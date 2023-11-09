package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.WebviewScreen;
import utils.Base.BaseTest;

public class WebviewScreenTest extends BaseTest {
    WebviewScreen webviewScreen;
    @Test
    public void visualizeWebviewScreenTest(){
        webviewScreen = mainScreen.tapWebviewButton();
        webviewScreen.waitToBeVisible(webviewScreen.getHamburguerMenuButton());
        Assert.assertTrue(webviewScreen.getHamburguerMenuButton().isDisplayed());
    }

}
