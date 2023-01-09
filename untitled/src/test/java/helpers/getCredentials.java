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
        driver.get(Links.HACKER9.getLink());
//        Thread.sleep(10000);
//        WebElement refreshButton = driver.findElement(By
//                .xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/form/div[2]/div/div/div[2]/div/div/svg[2]"));
//        refreshButton.click();
//        WebElement emailField = driver.findElement(By
//                .xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/form/div[2]/div/div/div[1]"));
//        String email = emailField.getText();
//        driver.quit();
        return "s";
    }
}
