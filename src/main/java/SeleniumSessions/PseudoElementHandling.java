package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

	public static void main(String[] args) {

//		Pseudo classes:

//		::Before
//		::After
//		::Has
		
		String firstNameJsContent =
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";

		String firstNameColor =
				"return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('color');";
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		

		JavascriptExecutor jS = ((JavascriptExecutor) driver);

		String Mand_fieldText = jS.executeScript(firstNameJsContent).toString();

		System.out.println(Mand_fieldText);
		
		if(Mand_fieldText.contains("*")) {
			System.out.println("first name is mandantory field");
		}

		String FirstNameColor = jS.executeScript(firstNameColor).toString();
		System.out.println(FirstNameColor);
		
		if(FirstNameColor.contains("rgb(255, 0, 0)")) {
			System.out.println("first name mand field is with red color");
		}
	}

}
