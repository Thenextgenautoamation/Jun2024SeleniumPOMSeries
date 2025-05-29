package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleFooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		
		List<WebElement> FooterLinks = driver.findElements(By.xpath("//div[@class = 'KxwPGc SSwjIe']//a"));
		
//		WebElement element = driver.findElement(By.xpath("(//div[@class=\"KxwPGc AghGtd\"]/a)[3]"));
//		
//		element.click();
		
		
		System.out.println(FooterLinks.size());
		
		for(WebElement e:FooterLinks ) {
			
			String text = e.getText();
			
			System.out.println(text);
			
			if(text.contains("Business")){
				e.click();
			}
			
			
		}
		
	}

}
