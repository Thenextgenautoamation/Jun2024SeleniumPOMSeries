package mytests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountRegisterPageTest extends BaseTest {
	
	public static String getRandomEmailId() {
//		 String emailId = "Automation"+ System.currentTimeMillis() +"@gmail.com";
		String emailId = "Automation"+UUID.randomUUID()+"@gmail.com";
		 
		
		 return emailId;
	}
	@DataProvider
	 public Object[][] getTestData() {
		
		return new Object[][] {
			{"Jean D","Automation","97929829829","Jean@123"},
			{"Annie","Tester", "0927920","ann123@"},
			{"Annet","Admin","189080808","annet@4345"}
			
		};
	}
	@Test(dataProvider = "getTestData")
	public void registerTest(String firstName, String lastName, String telephone,String password) {
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("// input[@class = 'btn btn-primary']")).click();
		
		String text = driver.findElement(By.xpath("//div[@id = 'content']/h1")).getText();
		
		System.out.println(text); //Your Account Has Been Created!
		
		Assert.assertEquals(text, "Your Account Has Been Created!");
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
		
		
	}

}
