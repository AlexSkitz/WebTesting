package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Links;

public class getCredentials {
    public String getNewCredentialsEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Links.TEMP_MAIL.getLink());
        Thread.sleep(10000);
        WebElement refreshButton = driver.findElement(By.xpath("//*[@id=\"click-to-delete\"]"));
        refreshButton.click();
        WebElement emailField = driver.findElement(By
                .xpath("//*[@id=\"mail\"]"));
        String email = emailField.getText();
        driver.quit();
        return email;
    }
}
