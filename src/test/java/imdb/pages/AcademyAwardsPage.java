package imdb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class AcademyAwardsPage extends BasePage{


    public AcademyAwardsPage(WebDriver driver) {
        super(driver);
    }


    By honoraryAwardIMG = By.xpath("//div[@class='event-widgets__award-category']//div[1]//div[1]//div[1]//div[1]//a[1]//img[1]");

    By writerName = By.xpath("//div[@class='sc-e226b0e3-10 kRcXhr']//li[2]//div[1]//li");

    By starsName = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/section/div[2]/div/ul/li[3]/div/ul/li");

    By directorName = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[2]/div[1]/section/div[2]/div/ul/li[1]/div/ul/li/a");
    By originalTitle = By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[2]/div[1]/div");

    By seeAllPhotos = By.xpath("//div[@class='ipc-title ipc-title--base ipc-title--section-title ipc-title--on-textPrimary sc-df9f4be9-0 jLvGDG']//h3[@class='ipc-title__text']");

    By seeGallery = By.xpath("//*[name()='path' and contains(@d,'M4.8 14h2.')]");
    public void clickHonoraryAwardIMG() {
        click(honoraryAwardIMG);
    }
    public void getOriginalTitle() {
        String originalTitle = getText(this.originalTitle);
        System.out.println(originalTitle);
    }

    public List<WebElement> getWriterNameList() {
        return findElements(writerName, 10);
    }

    public List<WebElement> getStarsNameList() {
        return findElements(starsName, 10);
    }

    public void getDirectorNameText() {
        String directorName = getText(this.directorName);
        System.out.println("Director : "+directorName);
    }
    public String getDirectorNameText2() {
        return getText(this.directorName);
    }

    public void clickSeeAllPhotos() {
        click(seeAllPhotos);
    }
    public void clickSeeGallery() {
        click(seeGallery);
    }


}
