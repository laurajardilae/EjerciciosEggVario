package utils.Base;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitToBeClickable(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeVisible(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnElement(WebElement element) {
        this.waitToBeClickable(element);
        element.click();
    }

    public void sendKeysOnElement(WebElement element, String keys) {
        this.waitToBeVisible(element);
        element.sendKeys(keys);
    }
    public void swipe(int startX, int startY, int endX, int endY, Duration duration){
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
        Sequence swipe = new Sequence(input,0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX,startY));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

}
