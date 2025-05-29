package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html"); // page
		
		
//		driver.switchTo().frame(2);
//		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		
//		String header = driver.findElement(By.xpath("//h2[contains(text() , 'Title bar ')]")).getText();
//		
//		System.out.println(header);
		
		String title = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(title);
		
		driver.switchTo().defaultContent(); // back to page
		
		
	
		
		
		

	}

}
