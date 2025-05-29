package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/ancestor::tr//input"))
		  .click();
		
//		parent to child:
//		drirect child:/
//		indirect child : //
		
		//div[@class="form-group"]/input
		
		//div[@id="account-login"]//form//input
		//div[@id= 'content']/div  ..1
		
		//div[@id= 'content']//div ...7
		
		
		//select[@id='Form_getForm_Country']/option  ...233
		
		//select[@id='Form_getForm_Country']//option ...233
		
//		(//div[@class='form-group']//label)[1]
		
//		(//div[@class='form-group']//input)[2]
		
//	/	(//div[@class='form-group required']//input)[3]
		//div[@id]//a[text()='My Account']
		
		//input[@id='input-password']/..
		//input[@id='input-password']/parent::div
		//option[@value="Angola"]/parent::select
		//option[@value="Angola"]/parent::select
		
		//option[@value="Angola"]/ancestor::form
		
		//input[@id='input-password']/ancestor::form
		
		
		//a[text()= 'Joe.Root']/parent::td/parent::tr/td/input
		
		//a[text()= 'Joe.Root']/parent::td/parent::tr//input
		
		//a[text()= 'Joe.Root']/parent::td/preceding-sibling::td/input[@type="checkbox"]
		//a[text()= 'Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		//aside[@id='column-right']/div/following::div
		
		//aside[@id='column-right']/div/preceding::div

	}

}
