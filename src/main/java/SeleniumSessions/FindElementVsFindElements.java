package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.id("input-email111")).click(); //NoSuchElementException
		
		List<WebElement> elements = driver.findElements(By.id("input-email123"));
			System.out.println(elements.size());
		
		
		
		

	}

}
