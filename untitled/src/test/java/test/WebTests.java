package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Links;

public class WebTests {
    @Test
    public void navigateToRozetkaWebsiteAndSearchSomething() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Links.ROZETKA.getLink());
        WebElement searchField = driver.findElement(By
                .xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/div/div/input"));
        searchField.clear();
        searchField.sendKeys("iphone");

        WebElement searchButton = driver.findElement(By
                .xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button"));
        searchButton.click();
        driver.quit();
    }
}
