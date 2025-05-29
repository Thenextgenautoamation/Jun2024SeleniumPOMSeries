package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

//		isDisplayed, isEnabled,isSelected

//		 By password = By.id("pass");

		driver.findElement(By.id("pass")).click(); // for click nothing will happen with no Exception

//		 driver.findElement(By.id("pass")).sendKeys("Veda"); //ElementNotInteractableException: element not interactable

//		/driver.findElement(By.id("passnew")).sendKeys("Veda123");//ElementNotInteractableException: element not interactable in case of SendKeys on Disabled element
		boolean disabledEle = driver.findElement(By.id("pass")).isDisplayed();

		System.out.println(disabledEle);

		boolean b2 = driver.findElement(By.id("pass")).isSelected();

		System.out.println(b2);

		boolean b3 = driver.findElement(By.id("pass")).isEnabled();

		System.out.println(b3);
		

	}

}
