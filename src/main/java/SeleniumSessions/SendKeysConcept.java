package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.get("https://demo.opencart.com/en-gb?route=account/register");

//		driver.findElement(By.id("input-firstname")).sendKeys("veda");
//		
////		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("hsa");
//		
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Veda");

		String firstName = "Veda";

		String lastName = "Hsan";
		String design = "SDET";
		int tel = 1238;
		

		StringBuilder sb = new StringBuilder("Automation");

		StringBuffer sf = new StringBuffer("Selenium");
		

		driver.findElement(By.id("input-firstname")).sendKeys(firstName, " ", lastName, " ", design, " ", "Google", " ",
				sb, sf);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/input")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("// button[contains(text(), 'Continue')]")).click();
		driver.findElement(By.cssSelector("#form-register > div > button")).click();

//		Address: Street,City,state,zipcode

	}

}
