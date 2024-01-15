import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class SampleSteps {
    private int result;
    @Step
    public void performSomeAction(int a, int b) {
        this.result = a + b;
    }

    @Step
    public void verifyResult() {
        Assert.assertEquals(7, result);
    }
}
