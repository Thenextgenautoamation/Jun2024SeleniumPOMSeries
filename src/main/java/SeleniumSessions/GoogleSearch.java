package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
//		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//		
//		Thread.sleep(3000);
//		
//		List<WebElement> suggetionsList = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		
	
//		List<WebElement> suggetionsList = driver.findElements(By.xpath("//ul/li[@class='sbct PZPZlf']"));
		
		By searchField = By.name("q");
		
//		By suggestions = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		
		By suggestions = By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li//div[@class='YGcVZO _2VHNef']");
		
		doSearch(searchField,"macbook", suggestions," pro");
		
		
		
	}
	public static void doSearch(By searchField, String searchKey, By suggestions, String value) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);
		
		Thread.sleep(5000);
		
		List<WebElement> suggetionsList = driver.findElements(suggestions);
		
		System.out.println(suggetionsList.size()); 
		
		
		for(WebElement e :suggetionsList ) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
		
	}

}
