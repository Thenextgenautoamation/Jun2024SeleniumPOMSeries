package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithMultipleTabsHandling {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		
		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click(); //child
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		
		Set<String> handles = driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		  
		 while(it.hasNext()) {
			 String windowId = it.next();
			 driver.switchTo().window(windowId);
			 System.out.println(driver.getCurrentUrl());
			 
			 Thread.sleep(1000);
			 
			 
			 if(!parentWindowId.equals(windowId)) {
				 
				 driver.close();
			 }
			
		 }
		
		 driver.switchTo().window(parentWindowId);
		 
		System.out.println(driver.getTitle());
		
	}

}
