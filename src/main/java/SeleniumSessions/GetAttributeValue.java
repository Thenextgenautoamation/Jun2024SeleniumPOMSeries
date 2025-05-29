package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {


	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		
		By hrefValue = By.xpath("//*[@id=\"column-right\"]/div/a[1]");
//
		By emlId = By.xpath("//*[@id=\"input-email\"]");
		
		By pwd = By.id("input-password");
//
//		By forgottenLink = By.xpath("//*[@id=\"column-right\"]/div/a[3]");
//		
//	String hrefValue =driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).getAttribute("href");
		
//		System.out.println(hrefValue);
		
		ElementUtil util = new ElementUtil(driver);
		String getattvalue =  util.getAttributeValue(hrefValue, "href");
		System.out.println(getattvalue);
		
		String emlattr =  util.getAttributeValue(emlId,"placeholder");
		System.out.println(emlattr);
		
		String pwdattr =  util.getAttributeValue(pwd,"placeholder");
		System.out.println(pwdattr);
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		
		String emailValue = util.getAttributeValue(emlId,"value");
		
		System.out.println(emailValue);
		

	}

}
