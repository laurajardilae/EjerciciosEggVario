package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DragScreen;
import utils.Base.BaseTest;

public class DragScreenTest extends BaseTest {
    DragScreen dragScreen;
    @Test
    public void visualizeDragScreen(){
        dragScreen = mainScreen.tapDragButton();
        dragScreen.waitToBeVisible(dragScreen.getDragScreenTitle());
        Assert.assertTrue(dragScreen.getDragScreenTitle().isDisplayed());
    }

}
