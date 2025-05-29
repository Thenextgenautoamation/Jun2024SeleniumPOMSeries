package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		
//		Actions act = new Actions(driver);
//		
//		 act.sendKeys(firstName, "John")
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys("Olivier")
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys("next@gmail.com")
//		     .sendKeys(Keys.TAB)
//		     .sendKeys("692798292809")
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys("veda@123")
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys("veda@123")
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys(Keys.SPACE)
//		     .sendKeys(Keys.TAB)
//		     .pause(500)
//		     .sendKeys(Keys.ENTER)
//		     
//		     .build().perform();
		 
		 
		 driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
		 Actions act = new Actions(driver);
		  act.sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys(Keys.TAB)
		  .sendKeys("mackBook")
		  .sendKeys(Keys.ENTER)
		  .sendKeys(Keys.TAB)
		  .build()
		  .perform();
		 
		     
		     
		
	}

}
