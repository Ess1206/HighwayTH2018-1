package lesson3.webDriverExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by lolik on 11.12.2017.
 */
public class NoSuchElementExceptionExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement element = driver.findElement(By.cssSelector(".noELEMENT"));
    }

}
