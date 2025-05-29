package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-scenario/");

		driver.switchTo().frame("pact1"); // f1

		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Testing");
//		
//		driver.switchTo().frame("pact2"); // f2
//
//		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("Automation");

//		driver.switchTo().frame("pact3");// f3
//		
//		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("With Java");
		

//		driver.switchTo().defaultContent();
//		
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
//		

//		page --F1 : yes
		// F1 -- F2: Yes
		// F2 --> F3 : Yes
		// Page -->F2 : No
		// Page --> F3 : No
		// Page -->F1 -->F2 -->F3: yes

		driver.switchTo().frame("pact2"); // f2

		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("selenium");
		
		
		
		driver.switchTo().frame("pact3");// f3

		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("With Java");
		
		driver.switchTo().parentFrame(); // f2

		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys(" CI CD");

//		driver.switchTo().parentFrame(); // f1
//
//		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("is love");

		driver.switchTo().parentFrame();
////		
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);

		
		
		//F3 -->F2 -->F1 --> Page : parentFrame();
		
		//F3 --> defaultContent()-->page
	}

}
