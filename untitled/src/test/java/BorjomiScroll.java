import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Links;

import java.time.Duration;

public class BorjomiScroll {
    @Test
    public void borjomiScrollTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Links.BORJOMI.getLink());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"outer\"]/div[11]/div/button"))).click();
        driver.findElement(By.xpath("//*[@id=\"outer\"]/div[11]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"msgHelp\"]/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"msgHelp\"]/div[3]")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1350)", "");

        ////////////////////////////
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ground\"]"));
//        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element);
//        new Actions(driver)
//                .scrollFromOrigin(scrollOrigin, 0, 2222)
//                .perform();
        ///////////////////////////////

    }

}
