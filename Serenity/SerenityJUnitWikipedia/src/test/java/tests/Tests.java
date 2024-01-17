package tests;

import net.serenitybdd.annotations.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.HomePage;
import steps.MySteps;

@RunWith(SerenityRunner.class)
@Narrative(text = {"Wikipedia test"})
@WithTags({@WithTag("sample")})
public class Tests {
    @Steps
    MySteps mySteps;

    @Managed
    HomePage homePage;
    //WebDriver driver;
    @Test
    public void verifyTitle() {
        mySteps.openBrowser();
        mySteps.searchString("Microsoft");
        mySteps.verifyResult("Microsoft");
    }


}
