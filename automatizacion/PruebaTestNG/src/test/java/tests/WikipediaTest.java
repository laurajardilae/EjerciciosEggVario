package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;
import utils.baseTest.BaseTest;

public class WikipediaTest extends BaseTest {
    @Test
    @Parameters({"textToSearch"})
    public void searchTest(String textToSearch){
        HomePage homePage = loadFirstPage();
        ResultPage resultPage = homePage.searchText(textToSearch);
        Assert.assertTrue(resultPage.isTitleCorrect(textToSearch), "Title does not match");
    }
}
