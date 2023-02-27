import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataGenerator;

import javax.xml.crypto.Data;
import java.time.Duration;
import java.util.List;

public class CloudTest {
    @Test
    public void cloudTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cloudcampaign.com/agencyhub");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> iframes = driver.findElements(By.xpath("//iframe[contains(@title, 'Form')]"));
        driver.switchTo().frame(iframes.get(0));
        WebElement input = driver.findElement(By.xpath("//input[@type='email']"));
        input.click();
        input.sendKeys(DataGenerator.emailGenerator(10));
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[style*='text-align']"))).getText();
//        String text = driver.findElement(By.cssSelector("[style*='text-align']")).getText();
        Assert.assertEquals(text,"Thank you for joining the waitlist to access AgencyHub, we'll be in touch!");
        driver.quit();
    }
}
