package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean flag = driver.findElement(By.id("input-email111")).isDisplayed(); // NoSuchElementException
//		System.out.println(flag);

		By emailId = By.id("input-email111");
		
		By forgottenPwd = By.linkText("Forgotten Password");
		
		By logo = By.className("img-responsive");

//		doIsDisplayed(emailId);

		if(doIsDisplayed(logo)) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
//		
//		List<WebElement> emailIdList = driver.findElements(emailId);
//		
//		if(emailIdList.size()==1) {
//			System.out.println("email is present on the page");
//		}
//		else {
//			System.out.println("email id is coming more than two times or is not present ");
//		}

//		isElementDisplayed(emailId);
//		System.out.println(isElementDisplayed(emailId));
		
		System.out.println(isElementDisplayed(forgottenPwd, 2));

	}

	public static boolean isElementDisplayed(By locator) {
		int elementCount = getElements(locator).size();
		if(elementCount ==1) {
			System.out.println("single element is displayed : "+ locator);
			return true;
		}else {
			System.out.println("multiple or zero elements are displayed : "+ locator);
			
			return false;
		}
	}

	public static boolean isElementDisplayed(By locator,int expectedElementCount) {
		int elementCount = driver.findElements(locator).size();
		if (elementCount == expectedElementCount) {
			System.out.println("element is displayed : " + locator + " with the occurrence of " + elementCount);
			return true;
		} else {
			System.out.println("multiple or zero elements are displayed : " + locator + "with Occurrence " + elementCount);

			return false;
		}

	}

	public static boolean doIsDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			System.out.println("element is displayed : " + locator);
			return flag;
		} catch (NoSuchElementException e) {
			System.out.println("element with locator : " + locator + "is not displayed");

			return false;
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}
	
//	element isEnabled,isDisabled, isSelected
	
//	alert: 
	
}
