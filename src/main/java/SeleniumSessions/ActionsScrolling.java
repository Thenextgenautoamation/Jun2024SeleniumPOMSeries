package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/s?k=mackbook&crid=S1VIZSOSPAEJ&sprefix=mackbook%2Caps%2C105&ref=nb_sb_noss_2");
		


		Actions act = new Actions(driver);
		
//		partial Scrolling:
		
//		 act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		 
//		 Thread.sleep(2000);
//		 
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		//CMD/CONTROL + ARROW KEY UP/DOWN
		
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		
		 Thread.sleep(2000);
		 
		 act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		 
		 Thread.sleep(2000);
		 
		 act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		 
		act.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).build().perform();
		
		

	}

}
