package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import screens.SwipeScreen;
import utils.Base.BaseTest;

import java.io.IOException;

public class SwipeScreenTest extends BaseTest {
    SwipeScreen swipeScreen;
    @Test
    public void visualizeSwipeScreen(){
        swipeScreen = mainScreen.tapSwipeButton();
        swipeScreen.waitToBeVisible(swipeScreen.getSwipeScreenTitle());
        Assert.assertTrue(swipeScreen.getSwipeScreenTitle().isDisplayed());
    }

    @Test
    @Parameters({"cardTitle"})
    public void swipeRight(String cardTitle) throws IOException {
        swipeScreen = mainScreen.tapSwipeButton();
        swipeScreen.waitToBeVisible(swipeScreen.getFirstCard());
        int[] inicialColor = swipeScreen.getColor(swipeScreen.getSecondDot());

        swipeScreen.swipeRightHorizontal();
        swipeScreen.waitToBeVisible(swipeScreen.getSecondCard());

        //Verifico que estoy viendo la nueva card
        Assert.assertEquals(swipeScreen.getCardTitle().getText(),cardTitle);

        //Verifico que esta seleccionado el punto correcto
        int[] finalColor = swipeScreen.getColor(swipeScreen.getSecondDot());
        Assert.assertFalse(inicialColor.equals(finalColor));

    }
}
