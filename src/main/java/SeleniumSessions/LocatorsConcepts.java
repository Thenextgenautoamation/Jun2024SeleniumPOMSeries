package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

//		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Veda");

//		driver.findElement(By.className("form-control")).sendKeys("thenextgenautomation@gmail.com"); // NSE
		
//		id: unique attribute
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
//		2/ By Name:
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
//		3. By ClassName:
//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
//		4. xpath:
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("test@gmail.com");
		
		
//		5.cssSelector:
//		 css: Cascated style Sheets
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
//		6 LinkText:
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
//		7 PartialLinkText:
		
//		driver.findElement(By.partialLinkText("Delivery")).click();

//		 Delivery information
//		 Delivery product
		
		
//		7) By Tag Name: html tag
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		
		
	}

}
