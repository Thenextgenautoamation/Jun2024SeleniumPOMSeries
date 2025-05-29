package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		 driver.get("https://demo.opencart.com/en-gb?route=account/login");
		 
//		 Create WebElement(FE) + Perform action(click, sendKeys,GetText,isDisplayed()...etc)
		 
//		 1.
//		 
//		 driver.findElement(By.id("input-email")).sendKeys("thenextgenautomation@gmail.com");
//		 driver.findElement(By.id("input-password")).sendKeys("Veda@123");

		 
//		 2.
//		 WebElement emailAddress = driver.findElement(By.id("input-email"));
//		 WebElement password =  driver.findElement(By.id("input-password"));
//		 
//		 emailAddress.sendKeys("thenextgenautomation@gmail.com");
//		 password.sendKeys("Veda@123");
		 
//		 3. By locator:
//		 
//		 By emailId = By.id("input-email");
//		 By pwd = By.id("input-password");
//		 
//		 WebElement email_ele= driver.findElement(emailId);
//		 WebElement pass_ele =  driver.findElement(pwd);
//		 
//		 email_ele.sendKeys("thenexgenautomation@gmail.com");
//		 pass_ele.sendKeys("Veda@123");
		 
//		 4. By locator + Generic function for WebElement
		 
//		 By emailId = By.id("input-email");
//		 By pwd = By.id("input-password");
//		 
//		 getElement(emailId).sendKeys("thenextgenautomation@gmail.com");
//		 getElement(pwd).sendKeys("Veda@123");
//		 
//		 5.  By locator + Generic function for WebElement and sendKeys
		 
		 By emailId = By.id("input-email");
		 By pwd = By.id("input-password");
		 
//		 doSendKeys(emailId,"thenextgenautomation@gmail.com");
//		 doSendKeys(pwd,"Veda@123");
		 
//		 6. By locator + Generic function for WebElement and sendKeys : ElementUtil
		 
		 ElementUtil ele_util = new ElementUtil(driver);
		 
		  ele_util.doSendKeys(emailId, "thenextgenautomation@gmail.com");
		  ele_util.doSendKeys(pwd, "Veda@123");
		 
	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}
//	
//	public static void doSendKeys(By locator, String value) {
//		driver.findElement(locator).sendKeys(value);
//	}
//	
	

}
