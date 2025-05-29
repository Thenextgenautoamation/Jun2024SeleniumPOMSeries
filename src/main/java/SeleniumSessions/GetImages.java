package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImages {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");

//		By links = By.tagName("a"); 
		By images = By.tagName("img");
		
		ElementUtil utl = new ElementUtil(driver);
		
        utl.getElementAttributeList(images,"src");

	}
//	public static void getElementAttributeList(By locator, String attrName) {
//	List<WebElement> imagesList = getElements(locator);
//	
//	for(WebElement e : imagesList ) {
//		
//		String attrivalue = e.getAttribute(attrName);
//		
//		if(attrivalue != null) {
//			
//			System.out.println(attrivalue);
//			
//		}
//	}
	
	
		
//	}

}
