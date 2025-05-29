package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
//		html tag = Select
//		Select
		
		
		driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
		
//		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]")).click();
		
//		By country = By.id("Form_getForm_Country");
		By amazonSearchdrpdown = By.id("searchDropdownBox");
		
//		By employees = By.id("Form_getForm_NoOfEmployees");
		
//		Select select_country = new Select(driver.findElement(country));
//		
////		select_country.selectByVisibleText("Congo");
////		select_country.selectByIndex(1);
//		
//		select_country.selectByValue("American Samoa");
//		
//        doSelectByIndex(country, 10);
//        
//        doSelectByIndex(employees,5);
        
//		doSelectByValue(employees, "200 - 1,000");
//        doSelectByValue(country, "Nigeria");
           
		
//        doSelectByVisibleText(country, "Kenya");
//        doSelectByVisibleText(employees, "< 10");
        
//        doSelectByVisibleText(amazonSearchdrpdown, "Baby");
        
		ElementUtil eltil = new ElementUtil(driver);
		
		eltil.doSelectByVisibleText(amazonSearchdrpdown, "   Women");
		
	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSelectByIndex(By locator, int index) {
//		
//		Select select = new Select(getElement(locator));
//		 
//		select.selectByIndex(index);
//	}
//	
//	public static void doSelectByValue(By locator, String value) {
//		
//		Select select = new Select(getElement(locator));
//		 
//		select.selectByValue(value);;
//	}
//	
//	public static void doSelectByVisibleText(By locator, String visibleText) {
//		
//		Select select = new Select(getElement(locator));
//		 
//		select.selectByVisibleText(visibleText);
//	}

}
