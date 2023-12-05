package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    By menuButton = By.id("imdbHeader-navDrawerOpen");

    By oscarsButton = By.xpath("//a[@href='/oscars/?ref_=nv_ev_csegosc']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickMenuButton() {
        click(menuButton);
    }

    public void clickOscarsButton() {
        click(oscarsButton);
    }
}
