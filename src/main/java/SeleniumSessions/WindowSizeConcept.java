package SeleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizeConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
//		driver.manage().window().fullscreen();
		
//		Thread.sleep(500);
		
//		driver.manage().window().minimize(); //sele4.x
		
		Dimension dim = new Dimension(770,1080);
		driver.manage().window().setSize(dim);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		

	}

}
