package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
		
		Action action = act.sendKeys(driver.findElement(firstName), "Automation").build();
		Action actn = act.click(driver.findElement(By.linkText("Forgotten Password"))).build();
		
		 action.perform();
		 actn.perform();
		  
		
		
	}

}
