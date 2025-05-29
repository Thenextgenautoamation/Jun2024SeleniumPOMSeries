package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		

		  driver = new ChromeDriver();
		  
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/ancestor::tr//input"));
//		driver.findElement(By.xpath("//a[text() = 'Jasmine.Morgan']/ancestor::tr//input[@ type = 'checkbox']"))
//		
//		   .click();
//		
//		driver.findElement(By.xpath("//a[text() = 'Joe.Root']/ancestor::tr//input[@ type = 'checkbox']")).click();
//				
		//a[text() = 'Joe.Root']/parent::td/following-sibling::td/ancestor::tr/td/child::input
		
		
		selectUserName("John.Smith");
		selectUserName("Joe.Root");
		selectUserName("Jasmine.Morgan");
		selectUserName("Garry.White");
		selectUserName("Jordan.Mathews");
		selectUserName("Kevin.Mathews");
		
		System.out.println(getUserDataList("John.Smith"));
		System.out.println(getUserDataList("Jasmine.Morgan"));
		System.out.println(getUserDataList("Joe.Root"));
		System.out.println(getUserDataList("Garry.White"));
		System.out.println(getUserDataList("Jordan.Mathews"));
		System.out.println(getUserDataList("Kevin.Mathews"));
		

		
	}
	public static void selectUserName(String userName ) {
		
		driver.findElement(By.xpath("//a[text() = '"+userName+"']/ancestor::tr//input[@ type = 'checkbox']"))
		
		   .click();
				
		
	}
	public static List<String> getUserDataList(String userName) {
		
		List<WebElement> userDataList = driver.findElements(By.xpath("//a[text() = '"+userName+"']/parent::td/following-sibling::td"));
		
		List<String> dataList = new ArrayList<String>();
		
		for(WebElement e : userDataList) {
			
			String text = e.getText();
			
			dataList.add(text);
			
			
		}
		
		return dataList;
		

		
	}
	

}
