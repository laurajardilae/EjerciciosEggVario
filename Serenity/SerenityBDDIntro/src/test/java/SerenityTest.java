import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import org.junit.Assert;
import org.junit.Test;
@Narrative(text = {"This is a sample Serenity BDD test."})
@WithTags({@WithTag("sample")})
public class SerenityTest {
    @Steps
    SampleSteps sampleSteps = new SampleSteps();

    @Test
    public void verifySerenityBDDSetup() {
        sampleSteps.performSomeAction(2,5);
        sampleSteps.verifyResult();
    }

}
