import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.junit.Test;
public class LogIn {
@Test

public void successful_log_in() {

    WebDriver driver = new ChromeDriver();

    driver.get("https://test-8c21.oneflowcloud.com/sign-in");
    WebElement username = driver.findElement(By.name("at-field-username_and_email"));
    username.sendKeys("feb18_test");
    WebElement password = driver.findElement(By.name("at-field-password"));
    password.sendKeys("test1234");
    WebElement login = driver.findElement(By.id("at-btn"));
    login.click();
	
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    driver.getPageSource().contains("feb18_test");

    driver.close();        
   }
}