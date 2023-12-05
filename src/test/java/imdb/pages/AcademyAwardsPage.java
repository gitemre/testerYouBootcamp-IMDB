package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AcademyAwardsPage extends BasePage{


    public AcademyAwardsPage(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;

    By honoraryAwardIMG = By.xpath("//div[@class='event-widgets__award-category']//div[1]//div[1]//div[1]//div[1]//a[1]//img[1]");

    By writerName = By.xpath("//div[@class='sc-e226b0e3-10 kRcXhr']//li[2]//div[1]//li");

    public void clickHonoraryAwardIMG() {
        click(honoraryAwardIMG);
    }

    public void getDirectorName() {
        String directorName = getText(By.xpath("//div[@class='sc-69e49b85-3 dIOekc']//a[@role='button'][normalize-space()='Alan Crosland']"));
        System.out.println(directorName);
    }



    public List<WebElement> getWriterNameList() {
        return findElements(writerName, 10);
    }

}
