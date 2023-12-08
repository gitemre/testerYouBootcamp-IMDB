package imdb.tests;

import imdb.pages.AcademyAwardsPage;
import imdb.pages.HomePage;
import imdb.pages.OscarsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;


public class IMDBTC1 {

    @Test
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        OscarsPage oscarsPage = new OscarsPage(driver);
        AcademyAwardsPage academyAwardsPage = new AcademyAwardsPage(driver);
        homePage.clickCookieButton();
        homePage.clickMenuButton();
        homePage.clickOscarsButton();
        oscarsPage.clickEventHistoryArrow();
        oscarsPage.clickEventHistory1920s();
        oscarsPage.clickButton1929();
        academyAwardsPage.clickHonoraryAwardIMG();
        System.out.println("**********************************");
        academyAwardsPage.getWriterNameList();
        academyAwardsPage.getOriginalTitle();
        academyAwardsPage.getDirectorNameText();
        String director = academyAwardsPage.getDirectorNameText2();

        List<WebElement> writerNameList =  academyAwardsPage.getWriterNameList();
        ArrayList WritersArrayList1 = null;
        for (int i = 0; i < writerNameList.size(); i++) {
            System.out.println("Writers : " + writerNameList.get(i).getText());
            WritersArrayList1 = new ArrayList();
            WritersArrayList1.add(writerNameList.get(i).getText());
        }

        List<WebElement> starsNameList = academyAwardsPage.getStarsNameList();
        ArrayList starsArrayList = null;
        for (int i = 0; i < starsNameList.size(); i++) {
            System.out.println("Stars : " + starsNameList.get(i).getText());
            starsArrayList = new ArrayList();
            starsArrayList.add(starsNameList.get(i).getText());

        }
        System.out.println("**********************************");

        homePage.clickHomeButton();
        homePage.sendKeysSearchBox("The Jazz Singer");
        homePage.clickTheJazzSingerFilm();

        List<WebElement> writerNameListAfterSearch = academyAwardsPage.getWriterNameList();
        ArrayList WritersArrayList2 = null;
        for (int i = 0; i < writerNameListAfterSearch.size(); i++) {
            System.out.println("After Search Writers : " + writerNameListAfterSearch.get(i).getText());
            WritersArrayList2 = new ArrayList();
            WritersArrayList2.add(writerNameListAfterSearch.get(i).getText());

        }

        List<WebElement> starsNameListAfterSearch = academyAwardsPage.getStarsNameList();
        ArrayList starsArrayList2 = null;
        for (int i = 0; i < starsNameListAfterSearch.size(); i++) {
            System.out.println("After Search Stars : " + starsNameListAfterSearch.get(i).getText());
            starsArrayList2 = new ArrayList();
            starsArrayList2.add(starsNameListAfterSearch.get(i).getText());

        }

        if (WritersArrayList1.equals(WritersArrayList2) && starsArrayList.equals(starsArrayList2) && director.equals(academyAwardsPage.getDirectorNameText2())){
            System.out.println("Director, Writers and Stars are same");
        }else{
            System.out.println("Director, Writers and Stars are not same");
        }

        academyAwardsPage.clickSeeAllPhotos();
        academyAwardsPage.clickSeeGallery();


        driver.close();


    }




}
