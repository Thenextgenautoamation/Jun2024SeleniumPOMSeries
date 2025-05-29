package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGConcepts {

	public static void main(String[] args) throws InterruptedException {

//		SVG: Scalable Vector Graphics

		// normal xpath will not work for SVG
		// svg[@fill='none']... not valid

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");

//		driver.findElement(By.xpath("(//*[local-name() = 'svg'])[1]"))
//	      .click();

		driver.get("https://petdiseasealerts.org/forecast-map#/");

		Thread.sleep(6000);

//		driver.findElement(By.xpath("(//*[local-name() ='svg'])[5]"));

//		(//*[local-name() ='svg'])[5]//*[name() = 'path']

//		//*name() = 'path']

//		svg --> local-name() = 'svg'
//		svg --> name();

		// *[name() = 'svg' and @id='map-svg']
		// *[local-name() = 'svg' and @id='map-svg']

		// *[name() = 'svg' and @id='map-svg']//*[local-name() = 'g' and @id =
		// 'regions']
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id , 'map-instance')]")));

		String xpathValue = "//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']/*[name()='g' and @id='regions']//*[name()='path']";

		List<WebElement> UsstateList = driver.findElements(By.xpath(xpathValue));

		System.out.println(UsstateList.size());
		
		
		for(WebElement e : UsstateList ) {
			
			String StateName = e.getAttribute("name");
			
			System.out.println(StateName);
		}

	}

}
