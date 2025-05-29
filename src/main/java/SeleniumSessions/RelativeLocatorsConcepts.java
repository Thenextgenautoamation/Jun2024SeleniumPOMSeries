package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorsConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		
		
//		sele 4.x                            above
		                                      
//		                                     |
//		                                     |
//		
//		              left <------------- WebElement --------->Right
//		
//		                                     |
//		                                     |
//		                                     |
//		                             near   Below
//		
		
		
		WebDriver driver = new ChromeDriver();
//		 driver.get("https://www.iqair.com/ca/canada");
		 
//		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		 
////		 Thread.sleep(20000);
////		 
////		 WebElement ele =  driver.findElement(By.partialLinkText(" Peace River"));
////		 
////		String rightScore =  driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
////		
////		System.out.println(rightScore);
//		 
//		 WebElement eleChkBox = driver.findElement(By.name("agree"));
////		 driver.findElement(with(By.cssSelector("input.btn-primary")).toRightOf(eleChkBox)).click();
//		 
//	String prvcytext= driver.findElement(with(By.tagName("b")).toLeftOf(eleChkBox)).getText();
//	
//	System.out.println(prvcytext);
		 
		 
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		WebElement ele =  driver.findElement(By.xpath("//h2[text() = 'New Customer']"));
		
		String pagtext= driver.findElement(with(By.tagName("p")).below(ele)).getText();
		
		System.out.println(pagtext);
		
		String bgPargp =driver.findElement(with(By.xpath("//p[contains(text(), 'shop faster')]")).below(By.tagName("p"))).getText();
		
		System.out.println(bgPargp);
		
		
		 
		
			
		
		
		
		
		
		
	}

}
