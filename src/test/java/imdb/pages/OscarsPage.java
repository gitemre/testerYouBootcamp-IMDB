package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OscarsPage extends BasePage {
    public OscarsPage(WebDriver driver) {
        super(driver);
    }

    By eventHistoryArrow = By.xpath("//li[@class='ipc-tab-arrow ipc-tab-arrow--visible ipc-tab-arrow--right']");
    By eventHistory1920s = By.xpath("//li[normalize-space()='1920s']");
    By button1929 = By.id("event-history-edition-0");

    public void clickEventHistoryArrow() {
        click(eventHistoryArrow);
    }

    public void clickEventHistory1920s() {
        click(eventHistory1920s);
    }
    public void clickButton1929() {
        click(button1929);
    }
}
