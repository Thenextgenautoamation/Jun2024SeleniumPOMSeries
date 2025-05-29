package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 
		
		 Actions act = new Actions(driver);
		
		 WebElement sourceEle = driver.findElement(By.id("draggable"));
		 WebElement targetEle = driver.findElement(By.id("droppable"));
		 
		 
		 act.dragAndDrop(sourceEle, targetEle).perform();
		 
//		 doDragAndDrop();
		
		
	}
	
	public static void doDragAndDrop(By SourceLocator, By targetLocator) {
		
		 WebElement sourceEle = driver.findElement(By.id("draggable"));
		 WebElement targetEle = driver.findElement(By.id("droppable"));
		 
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(sourceEle, targetEle).perform();
		 
//		 act
//		 .clickAndHold(sourceEle)
//		              .moveToElement(targetEle)
//		                         .release().perform();
		
	}

}
