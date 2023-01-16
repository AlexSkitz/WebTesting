package test;

import helpers.getCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.Credentials;
import utils.Links;

public class djinniTests {
    @Test
    public void navigateToDjinniAndRegisterTest() throws InterruptedException {
        getCredentials fff = new getCredentials();
        String email = fff.getNewCredentialsEmail();
        System.out.println("////////////////" + email);
        WebDriver driver = new ChromeDriver();
        //Open Google Chrome browser
        driver.manage().window().maximize();
        //Go to Djinni.co website
        driver.get(Links.DJINNI.getLink());
        //Click on register button
        WebElement registerButton = driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[2]/a"));
        registerButton.click();
        //Find email input field and enter credentials
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailInput.clear();
        emailInput.sendKeys(Credentials.USER1.getEmail());
//        emailInput.sendKeys(email);
        //Find password input field and enter credentials
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.clear();
        passwordInput.sendKeys(Credentials.USER1.getPassword());
        //Check that you is a candidate
        WebElement candidateRadioInput = driver.findElement(By
                .xpath("/html/body/div[1]/div[1]/div/div/div[2]/form/div[1]/div[3]/div[2]/label/input"));
        candidateRadioInput.click();
        //Click continue button
        WebElement continueButton = driver.findElement(By
                .xpath("/html/body/div[1]/div[1]/div/div/div[2]/form/div[1]/div[4]/button"));
        continueButton.click();
    }
}
