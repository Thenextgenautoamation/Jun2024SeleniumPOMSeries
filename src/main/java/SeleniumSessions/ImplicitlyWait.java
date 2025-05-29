package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {

//		Sync concept:

//		sel script  ---> app

		Thread.sleep(10000); // 10 secs --- static wait/ hard wait -- Java

		// e1 -->0 secs, 2 secs , 14 secs , 18 secs

//		dynamic wait: 10 secs  ---> 2 secs  ---> 8 secs(cancelled)
		// 10 secs --->0 secs --->10 secs (cancelled)
		// 10 secs ---> 8 secs --> 2 secs (Cancelled)
		// 10 secs --->12 secs --->

		// 1. Implicitly Wait:

		// global Wait: It will be applied for all the web element by default
		// when element not found within set amount time it will throw
		// noSuchElementException

		// 2.Explicit Wait:
		// 2.a WebDriverWait
		// 2.b FluentWait

		WebDriver driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //sel 3.x

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Login page: 10 secs

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com"); // 10 secs : 2 secs

//		  driver.findElement(By.id("input-password")).sendKeys("test@123");  //10 secs : 5 secs
//		  
//		  driver.findElement(By.xpath("//input[@value='Login']")).click(); //10 secs : 11

//		  Home page : 15sec

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		  e11 e12 e13 --> 15secs

//		  reg page : 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		   nullify the imp wait = = 0

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		// implicitly Wait can not be used for non web elements: url, title, alerts

	}

}
