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

    @Test
    public void testFindTV() {
        System.setProperty("webdriver.chrome.friver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div[1]/div/div[1]/ul[1]/li/a/span/span")).click();
        new WebDriverWait(driver, 10, 1000);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, 350)");

        driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[3]/div[5]/div[2]/ul/li[2]/label/span[1]/span")).click();
        WebElement check = driver.findElement(By.xpath("//*[@id=\"schema-filter\"]/div[3]/div[5]/div[2]/ul/li[2]/label/span[1]/span"));
        
        Assertions.assertTrue(check.isEnabled());
        driver.quit();
    }
}
