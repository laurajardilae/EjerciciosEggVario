package tests;

import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import org.junit.Test;
import steps.MySteps;

@Narrative(text = {"Wikipedia test"})
@WithTags({@WithTag("sample")})
public class Tests {
    @Steps
    MySteps mySteps = new MySteps();

    @Test
    public void verifySerenityBDDSetup() {
        mySteps.openBrowser();
        mySteps.searchString();
        mySteps.verifyResult();
    }


}
