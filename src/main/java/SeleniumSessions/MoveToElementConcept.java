package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		 driver = new ChromeDriver();
		
//		driver.get("http://mrbool.com/search/");
		
		
		 
//		 By parentLocator = By.cssSelector(".menulink");
//		 By childLocator =  By.xpath("(//ul/li/a[text() = 'Courses'])[2]");
		 
		
//		 driver.findElement(By.xpath("//a[text() = 'Single Videos']")).click()	;
		 
		 
		 
		 
		 driver.get("https://www.spicejet.com/");
		 
		 By parentLocator = By.xpath("//div[text() = 'Add-ons']");
		 By childLocator = By.xpath("(//div[text() = 'SpicePlus'])[1]");
		 
		 handleParentSubMenu(parentLocator,childLocator);

		 
	}
	 
	 public static void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
		 
		 Actions act = new Actions(driver);
		 
			act.moveToElement(driver.findElement(parentLocator)).perform();

		 Thread.sleep(2000);
		 
		 driver.findElement(childLocator).click()	;
		 
	 }
	 

}
