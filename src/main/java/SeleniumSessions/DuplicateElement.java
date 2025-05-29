package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateElement {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();

		driver.get("https://demo.opencart.com/en-gb?route=account/login");

//		driver.findElement(By.className("form-control")).sendKeys("thenextgenautomation@gmail.com"); // NSE

		 By emailId = By.id("input-email");
		 
		 By pwd = By.id("input-password");
		
		 By forgettenpwd = By.linkText("Forgotten Password");
		 
		 By loginbtn = By.linkText("Login");
		 
		 
		ElementUtil el= new ElementUtil(driver);
		
//		el.doClick(forgettenpwd);
		el.doClick(pwd);
		
		el.doClick(loginbtn);
	}


}
