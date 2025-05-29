package SeleniumSessions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTabConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //parent
		
		String parentWindowId =  driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
//		 selenium 4.x
		
		driver.switchTo().newWindow(WindowType.WINDOW); //create a new blank window/tab and switch to it also
		
//		driver.switchTo().newWindow(WindowType.TAB); // create a new blank window/tab and switch to it 
		
		driver.get("https://www.amazon.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getTitle());
		
		// window 1: admin portal - logout
		//window2: customer Pertal - login with customer
		
		
		
	}

}
