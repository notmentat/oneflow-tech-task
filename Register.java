import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.junit.Test;
public class Register {
@Test

public void register_new_user() {

    WebDriver driver = new ChromeDriver();

    driver.get("https://test-8c21.oneflowcloud.com/sign-in");
    WebElement register = driver.findElement(By.id("at-signUp"));
    register.click();
    
    WebElement username = driver.findElement(By.name("at-field-username"));
    username.sendKeys("feb18_test2");
    WebElement email = driver.findElement(By.name("at-field-email"));
    email.sendKeys("test2@sapho.org.uk");
    WebElement password = driver.findElement(By.name("at-field-password"));
    password.sendKeys("test1234");
    WebElement login = driver.findElement(By.id("at-btn"));
    login.click();
	
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    driver.getPageSource().contains("feb18_test2");

    driver.close();        
   }
}