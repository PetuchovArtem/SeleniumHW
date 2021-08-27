package Test;

import Pages.MainPage;
import Pages.TVPage;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testOnlinerTv {

    public WebDriver driver = new ChromeDriver();

    @Test
    public void testFindTV() {
        System.setProperty("webdriver.chrome.friver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        MainPage MainPage = new MainPage();
        MainPage.clickTvButton();

        new WebDriverWait(driver, 10, 1000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 350)");

        TVPage tvPage = new TVPage();
        tvPage.clickSamsungSwitch();
        tvPage.clickSonySwitch();

        tvPage.getItemName().contains("Sony");

        Assertions.assertTrue(tvPage.getItemName().contains("Sony"));

        driver.quit();
    }
}
