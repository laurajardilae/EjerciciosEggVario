package steps;

import net.serenitybdd.annotations.ManagedPages;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.Assert;
import page.HomePage;

public class MySteps extends UIInteractionSteps {
    @ManagedPages
    HomePage homePage = new HomePage();
    public MySteps(){
    }

    @Step
    public void openBrowser(){
        homePage.open();
    }
    @Step
    public void searchString(String searchWord){
        homePage.typeSearchword(searchWord);
        homePage.clickSearchButton();
    }
    @Step
    public void verifyResult(String text){
        Assert.assertEquals(text, homePage.getTitle());
    }

}
