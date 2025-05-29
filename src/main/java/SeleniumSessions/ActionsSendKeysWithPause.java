package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By search = By.name("search");

//		 Actions act = new Actions(driver);

		String searchKey = "mackbook";

//		doActionsSendKeysWithPause(search, searchKey, 500);

		doActionSendKeysWithPause(search, searchKey);

//		  char ch [] = searchKey.toCharArray();
//		  
//		  for(char e : ch) {
//			  
////			  act.sendKeys(driver.findElement(search), e +"" ).pause(500).perform();
//			  
//			  act.sendKeys(driver.findElement(search), String.valueOf(e)).pause(500).perform();
//			 
//		  }
//
//
//		
//
//	}

	}

	public static void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {

		Actions act = new Actions(driver);

		char ch[] = value.toCharArray();

		for (char e : ch) {

			act.sendKeys(driver.findElement(locator), String.valueOf(e)).pause(pauseTime).perform();

		}
	}

	public static void doActionSendKeysWithPause(By locator, String value) {

		Actions act = new Actions(driver);

		char ch[] = value.toCharArray();

		for (char e : ch) {

			act.sendKeys(driver.findElement(locator), String.valueOf(e)).pause(100).perform();

		}
	}

}
