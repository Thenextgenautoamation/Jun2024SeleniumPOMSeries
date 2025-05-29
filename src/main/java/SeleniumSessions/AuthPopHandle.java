package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopHandle {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
//		
//		String userName = "adminn";
//		String password = "admin";
//		
//		driver.get("https://"+userName+":" + password + "@" +"the-internet.herokuapp.com/basic_auth");
//		
//		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		

	}

}
