package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement Login = driver.findElement(By.id("u_0_2"));
        username.sendKeys("tester1234567@i.ua");
        password.sendKeys("Romario123");
        Login.click();
        // System.out.println("Last post: " +driver.findElements(By.cssSelector("[class^='_5']:last-child(1)")));
        // String text = driver.findElement(By.cssSelector(".4tdt:nth-last-child(1) ._5z6o span")).getText();
        // System.out.println("Last post: " +driver.get());

    }
}
