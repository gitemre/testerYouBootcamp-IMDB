package imdb.tests;

import imdb.pages.AcademyAwardsPage;
import imdb.pages.HomePage;
import imdb.pages.OscarsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class first {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        OscarsPage oscarsPage = new OscarsPage(driver);
        AcademyAwardsPage academyAwardsPage = new AcademyAwardsPage(driver);

        homePage.clickMenuButton();
        homePage.clickOscarsButton();
        oscarsPage.clickEventHistoryArrow();
        oscarsPage.clickEventHistory1920s();
        oscarsPage.clickButton1929();
        academyAwardsPage.clickHonoraryAwardIMG();
        academyAwardsPage.getDirectorName();
        academyAwardsPage.getWriterNameList();
        System.out.println(academyAwardsPage.getWriterNameList().get(0).getText());






    }
}
