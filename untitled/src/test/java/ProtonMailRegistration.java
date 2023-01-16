import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.DataGenerator;
import utils.Links;

import java.time.Duration;

public class ProtonMailRegistration {
    private final String userName = DataGenerator.generateString(10);
    private final String password = DataGenerator.generateString(10);

    @Test
    public void protonTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Links.PROTONMAIL.getLink());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement iFrame = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/main/div[2]/form/iframe")));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(userName);
        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]"))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"repeat-password\"]"))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div/main/div[2]/form/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/main[1]/div[2]/div[3]/button"))).click();

//        WebElement iFrameCaptcha = wait.until(ExpectedConditions
//                .visibilityOfElementLocated(By.xpath("/html/body/div[1]/iframe")));
//        driver.switchTo().frame(iFrameCaptcha);
//        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
//        driver.switchTo().defaultContent();

        driver.quit();

    }
}
