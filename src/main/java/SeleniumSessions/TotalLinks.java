package SeleniumSessions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args)  {

		
		driver = new ChromeDriver();
		
		driver.get("https://www.thenextgenautomation.com/");
//		Total Links on the page:
		
//		All links Text
		
//	List<WebElement> totalLinks =	driver.findElements(By.tagName("a"));
//	
//	System.out.println(totalLinks.size());
//	
//	for(int i = 0;i<=totalLinks.size();i++) {
//		String text = totalLinks.get(i).getText();
//		 System.out.println(text);
//	}
//	
//	System.out.println("_________________");
//	
//	for(WebElement e:totalLinks ) {
//		String text = e.getText();
//		if(text.length()!=0) {
//			
//		System.out.println(text);
//		}
//
//	}
//
		By links = By.tagName("a");
		By image = By.tagName("img");
		
		By spanEle = By.tagName("span");
		
		
		List<WebElement> totalLinks = getElements(links);
		
		System.out.println("The Lotal number of links : " +getLinksCount(links));
		
		System.out.println("the total number of image are : "+ getLinksCount(image));
	
		System.out.println("the total number of span are : "+ getLinksCount(spanEle));
		
		
		System.out.println("the list of links text :" +getLinksTextList(links));
	}
		
		
		
//	 WAF: to fecth the text of each link, Store it and print, the text should a blank
//	name: getElement
//	define param: By Locator
	
//	return the list of links
	
	public static List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
		 
		
	}
	public static int getLinksCount(By locator) {
		return getElements(locator).size();
		
		
	}
	
	
	
	public static List<String> getLinksTextList(By locator) {
		
		List<WebElement> linkList = getElements(locator);
		
		List<String> totalLinks = new ArrayList<String>();
		
		for(WebElement e: linkList ) {
			
			String text = e.getText();
			
			if(text.length()!=0) {
				totalLinks.add(text);
		
			}
	
		}
		return totalLinks;
		
	}
	

}
