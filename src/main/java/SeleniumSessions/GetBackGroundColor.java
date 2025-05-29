package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackGroundColor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		 driver.get("https://api.cogmento.com/register/?lang=en");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
//		WebElement signupBtn = driver.findElement(By.cssSelector("button#sign-in-btn"));
		 
		 WebElement shopCart = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button"));
		
		String color = shopCart.getCssValue("backgroundColor");
		
		System.out.println(color);
		
	
//		WAP without if and else
//		int n = 3;
//		int result = 0;
//		
////		?: turnally operator if is true 10 will be execute: if is false then 20
//		result = n%2==0 ? 10 : 20;
//		
//		System.out.println(result);
//	
		
//	arrow in switch supported for java 14
//	int status = 100;
//	
//	switch (status) {
//	case 100 -> "Create";
//		
//		break;
//
//	default:
//		break;
//	}
	
		
		
		
	}

}
