package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		
		By linkId =By.xpath("//a[contains(@href,'linkedin')]");
		
		ElementUtil util = new ElementUtil(driver);
		
		util.clickWhenReady(linkId, 10); // chil
		
		waitForWindowToBe(2,6);
		
		 
//		 1. fetch the window ids:
//		 2.swithing
		

	}
	
	public static void waitForWindowToBe(int totalWindows, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows));

	}

}
