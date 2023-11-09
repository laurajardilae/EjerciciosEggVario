package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.*;

import utils.Base.BaseScreen;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe horizontal\")")
    private WebElement SwipeScreenTitle;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(3)")
    private WebElement cardTitle;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"card\").instance(0)")
    private WebElement firstCard;
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"card\").instance(1)")
    private WebElement secondCard;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(22)")
    private WebElement firstDot;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(24)")
    private WebElement secondDot;



    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getSwipeScreenTitle() {
        return SwipeScreenTitle;
    }

    public void swipeRightHorizontal(){
        Duration SCROLL_DUR = Duration.ofMillis(300);
        Dimension size = driver.manage().window().getSize();
        int startX = 850;
        int endX = 250;
        int y = 1500;
        swipe(startX,y,endX,y,SCROLL_DUR);
    }

    public WebElement getFirstCard() {
        return firstCard;
    }

    public WebElement getCardTitle() {
        return cardTitle;
    }

    public WebElement getFirstDot() {
        return firstDot;
    }

    public WebElement getSecondDot() {
        return secondDot;
    }

    public WebElement getSecondCard() {
        return secondCard;
    }

    public int[] getColor(WebElement elem) throws IOException {
        //Point point = elem.getSize().getCenter();
        Point location = elem.getLocation();
        Dimension size = elem.getSize();

        // Calcular el centro

        int centerX = location.getX() + size.getWidth() / 2;
        int centerY = location.getY() + size.getHeight() / 2;

        //int centerx = point.getX();
        //int centerY = point.getY();

        //guardo screenshot
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        BufferedImage image = ImageIO.read(scrFile);

        // Getting pixel color by position x and y
        int clr=  image.getRGB(centerX,centerY);
        int  red   = (clr & 0x00ff0000) >> 16;
        int  green = (clr & 0x0000ff00) >> 8;
        int  blue  =  clr & 0x000000ff;
        System.out.println("Red Color value = "+ red);
        System.out.println("Green Color value = "+ green);
        System.out.println("Blue Color value = "+ blue);

        int rgb[] = {red, green, blue};
        return rgb;
    }
}
