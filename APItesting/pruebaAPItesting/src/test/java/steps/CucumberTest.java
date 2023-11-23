package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.CharacterPage;
import pages.HomePage;

public class CucumberTest extends BaseTest {

    @Given("I am an user at the Wikipedia WebPage requesting SW character <number>")
    public String requestSwapiCharacter() {
        Response response = RestAssured.given().get(url+"people/2/");
        JsonPath jsonPath = response.jsonPath();
        String name = jsonPath.getString("name");
        System.out.println(name);
        return name;
    }

    @When("I search the requested character name on Wikipedia search page")
    public CharacterPage searchCharacter(String name) {
        HomePage homePage = loadFirstPage();
        CharacterPage resultPage = homePage.searchText(name);
        return resultPage;
    }

    @Then("I should be able to see the article page correctly displayed for the requested character.")
    public void the_result_should_be(String name,CharacterPage resultPage) {
        Assert.assertTrue(resultPage.isTitleCorrect(name));
    }
}
