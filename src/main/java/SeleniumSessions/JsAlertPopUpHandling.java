package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
//		JS Alert: 
		
//		1. alert:
//		2.confirm:
//		3.prompt:
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		 driver.switchTo().alert(); // NoAlertPresentException: no such alert
		 
//		 1. alert:
		 
//		 driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click();
		 
//		 Thread.sleep(2000);
		 
//		 Alert alert = driver.switchTo().alert();
		 
//		 String text = alert.getText();
//		 System.out.println(text);
//		   alert.accept();
//		   alert.dismiss(); // remove the alert
		   
//		   2. confirm:
		   
//		   driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		   
//		   Thread.sleep(2000);
//		   
//		   Alert alert = driver.switchTo().alert();
//			 
//		   String text = alert.getText();
//		    System.out.println(text);
//		    
//		    alert.accept();
//		    alert.dismiss();
		    
//		    3.Prompt:
		    
		    driver.findElement(By.xpath("//button[text() ='Click for JS Prompt']")).click();
		    
		    Thread.sleep(3000);
		    
		    Alert alert = driver.switchTo().alert();
		    
		    String text = alert.getText();
		    System.out.println(text);
		    
		    alert.sendKeys("Test Automation");
		    alert.accept(); // ok
		    
//		    /alert.dismiss();// remove/ cancel
		    
		    
		    
		
		

	}

}
