package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
//		Wait().until();
		
		//implemnted by fluentWait(c) --- methods() + until()
		//extented by WebDriverWait(C) --> inherited mthods + Individual methods
		
		//Don't mix impl wait and explit wait
		
		//e1: 20  + 10 --->  30 secs
		//e1: 10  +  5 --->  15 sec
		//e1 18   +  1 --->  19 secs
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By passwordId = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login00']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //sel 4.x
		
		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		
//		email_ele.sendKeys("test@gmail.com");
		
		getElement(passwordId).sendKeys("Veda@123");
		
		wairForElementPresence(emailId, 5).sendKeys("Veda@gmail.com");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
//		elUtil.waitForElementVisible(loginBtn, 10).click();

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/*
	 * 
	 * An expectation for checking that an element is present on the DOM of a page.
	 *  This does not necessarily mean that the element is visible.
	 * 
	 */

	public static WebElement wairForElementPresence(By locator , int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/*
	 * 
	 * An expectation for checking that an element is present on the DOM of a page and visible. 
	 *Visibility means that the element is not only displayed but also has a height and width that is greater than 0. 
	 * 
	 * 
	 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}

}
