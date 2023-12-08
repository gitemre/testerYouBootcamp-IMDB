package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By menuButton = By.id("imdbHeader-navDrawerOpen");

    By oscarsButton = By.xpath("//a[@href='/oscars/?ref_=nv_ev_csegosc']");

    By cookieButton = By.xpath("//button[contains(text(),'Accept')]");
    By homeButton = By.id("home_img_holder");

    By searchBox = By.id("suggestion-search");

    By theJazzSingerFilm = By.xpath("//*[@id=\"react-autowhatever-navSuggestionSearch--item-2\"]/a");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickMenuButton() {
        click(menuButton);
    }

    public void clickOscarsButton() {
        click(oscarsButton);
    }

    public void clickCookieButton() {
        click(cookieButton);
    }

    public void clickHomeButton() {
        click(homeButton);
    }

    public void sendKeysSearchBox(String text) {
        sendKeys(searchBox, text);
    }

    public void clickTheJazzSingerFilm() {
        click(theJazzSingerFilm);
    }
}
