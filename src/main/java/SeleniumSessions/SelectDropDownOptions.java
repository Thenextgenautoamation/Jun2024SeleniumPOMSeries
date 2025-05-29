package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) {

//		html tag = Select
//		Select

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

//		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]")).click();

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
		Select select_country = new Select(driver.findElement(country));
		
		select_country.selectByVisibleText("Brazil");
		select_country.deselectAll();
//		
//		List<WebElement> countryOptions = select_country.getOptions();
//		
//		System.out.println(countryOptions.size()); //1
//		
//		for(WebElement e : countryOptions) {
//			String text = e.getText();
//			
//			System.out.println(text);
//			
//		}
			
		
//		/countryOptions.size(); //
			
//		System.out.println(select_country.getFirstSelectedOption());
		
		List<String> countryList = getDropDownOptionsTextList(country);
		System.out.println(countryList);
		
		List<String> empList = getDropDownOptionsTextList(employee);
		
		System.out.println(empList);
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		
		Select select = new Select(driver.findElement(locator));
		
		List<WebElement> OptionsList = select.getOptions();
		
		List<String> optionsTextList = new ArrayList<String>();
		
		
		for(WebElement e : OptionsList ) {
			
			String text = e.getText();

			optionsTextList.add(text);
			
			
		}
		return optionsTextList; 
	}
	
//1.	Select Value from drowdown without using select class methods: By Index, By value, By visible Text
//	2. Select value form dropdown  without using select class
//	3. how deselect Element From dropdown
	

}
