package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By country = By.id("Form_getForm_Country");
		
//		By country = By.xpath("// select[@id = 'Form_getForm_Country']/option");
		
		By employee = By.id("Form_getForm_NoOfEmployees");

		Select select_country = new Select(driver.findElement(country));
		
//		select_country.selectByVisibleText("Rwanda");
		
		selectValueFromDropDown(country, "     Brazil ");
		
//		selectValueFromDropDownWithoutSelectClass(country," Chad");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static void selectValueFromDropDown(By locator, String optionText) {
		
		Select select = new Select(getElement(locator));
		
		 List<WebElement> optionsList = select.getOptions();
		 
//		System.out.println(optionsList.size()); 233
		 
		 for(WebElement e : optionsList ) {
			 String text = e.getText();
			 if(text.equals(optionText.trim())) {
				 
				 e.click();
				 
				 break;
				 
			 }
		 }
	}
		 
		 public static void selectValueFromDropDownWithoutSelectClass(By locator, String optionText) {
				
//			 System.out.println(driver.findElements(locator).size()); //233
			 
			 List<WebElement> optionsList = driver.findElements(locator);
			 
			 for(WebElement e :optionsList ) {
				String text  = e.getText();
				
				if(text.equals(optionText.trim())) {
					
					e.click();
					
					break;
				}
			 }
			 
		
		
	}
}
