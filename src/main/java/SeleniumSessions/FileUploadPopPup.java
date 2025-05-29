package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadPopPup {

	public static void main(String[] args) throws InterruptedException {
		
//		
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
	 
//	  type ="file": 
	 Thread.sleep(5000);
	 driver.findElement(By.id("upload")).sendKeys("/Users/vedastehasangwineza/Documents/BLogo.docx");
	 
//	 AutIT: windows --- not recommanded
//	 Sikuli : lib: images
//		
		
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.name("username")).sendKeys("apiautomation");
//		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
	}

}
