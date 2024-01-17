package page;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.wikipedia.org/")
public class HomePage extends PageObject {
    @FindBy(css = "#searchInput")
    private WebElementFacade searchBar;

    @FindBy(css = ".pure-button.pure-button-primary-progressive")
    private WebElementFacade searchButton;

    @FindBy(className = "mw-page-title-main")
    private WebElementFacade title;

    public void typeSearchword(String searchWord){
        searchBar.type(searchWord);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public String getTitle() {
        return title.getText();
    }
}
