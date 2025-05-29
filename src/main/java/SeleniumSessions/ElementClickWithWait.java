package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementClickWithWait {

	static WebDriver driver;
	public static void main(String[] args) {
		
	
		 driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		By signUpLink =  By.linkText("Sign Up");
		
	ElementUtil el = new ElementUtil(driver);
	
	el.clickWhenReady(signUpLink, 3);
		
		
		
		
		
		
	}

}
