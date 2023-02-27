//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//import utils.Links;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class BorjomiScroll {
//    @Test
//    public void borjomiScrollTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(Links.BORJOMI.getLink());
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"outer\"]/div[11]/div/button"))).click();
//        driver.findElement(By.xpath("//*[@id=\"outer\"]/div[11]/div/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"msgHelp\"]/div[2]/label")).click();
//        driver.findElement(By.xpath("//*[@id=\"msgHelp\"]/div[3]")).click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-1350)", "");
//
//        ////////////////////////////
////        WebElement element = driver.findElement(By.xpath("//*[@id=\"ground\"]"));
////        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element);
////        new Actions(driver)
////                .scrollFromOrigin(scrollOrigin, 0, 2222)
////                .perform();
//        ///////////////////////////////
//
////        String string1 = "abcbbsikcsacnzxjcntsdasouycbzuxyogdcvudaygvdbufaiwugbcaluv";
////        Map<String, Integer> charCounterMap = new HashMap<String, Integer>();
////        char[] c = new char[string1.length()];
////        string1.getChars(0, string1.length(), c, 0);
//////        System.out.println(c);
////        for (int i = 0; i < string1.length(); i++) System.out.println(string1.charAt(i));
////        for (int i = 1; i < string1.length(); i++) {
////            char c = String.charAt(i);
////            System.out.println(c);
////        }
//        String s1 = "TopJava";
//        String s2 = "Java";
//        String s3 = "Top" + s2;
//        String s4 = s3;
//        System.out.println(s1 == s4);
//    }
//
//}
