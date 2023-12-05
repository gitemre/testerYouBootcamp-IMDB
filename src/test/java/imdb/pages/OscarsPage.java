package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OscarsPage extends BasePage {
    public OscarsPage(WebDriver driver) {
        super(driver);
    }

    By eventHistoryArrow = By.xpath("//li[@class='ipc-tab-arrow ipc-tab-arrow--visible ipc-tab-arrow--right']");


    public void clickEventHistoryArrow() {
        click(eventHistoryArrow);
    }
}
