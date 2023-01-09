package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Links;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTests {
    @Test
    public void navigateToRozetkaWebsiteAndSearchIphone() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Links.ROZETKA.getLink());
        WebElement searchField = driver.findElement(By
                .xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/div/div/input"));
        searchField.clear();
        searchField.sendKeys("iphone");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By
                        .xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement header = driver.findElement(By
                .xpath("/html/body/app-root/div/div/rz-category/div/main/div[1]/div/h1"));

        assertThat(header.getText())
                .as("Wrong search key")
                .isEqualTo("Мобільні телефони Apple");
        Thread.sleep(2000);
        driver.quit();
    }
}
