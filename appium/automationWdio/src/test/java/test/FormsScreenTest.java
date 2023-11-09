package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.FormsScreen;
import utils.Base.BaseTest;

public class FormsScreenTest extends BaseTest {
    FormsScreen formsScreen;
    @Test
    public void visualizeFormsScreen(){
        formsScreen = mainScreen.tapFormsButton();
        formsScreen.waitToBeVisible(formsScreen.getFormsScreenTitle());
        Assert.assertTrue(formsScreen.getFormsScreenTitle().isDisplayed());
    }
}
