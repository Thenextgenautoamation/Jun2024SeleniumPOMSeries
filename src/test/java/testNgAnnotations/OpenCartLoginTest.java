package testNgAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mytests.BaseTest;

public class OpenCartLoginTest  {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(description = "checking login page title...")
	public void loginPageTitleTest() {
		String actualtTitle = driver.getTitle();
		System.out.println("page title : " + actualtTitle);
		Assert.assertEquals(actualtTitle, "Account Login", " ======= title is not mathiching =======");
		
		
	}
	
	@Test(description = "checking login page url...")
	public void loginPageUrlTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println("page title : " + actualUrl);
		
		Assert.assertTrue(actualUrl.contains("account/login"), "======= title is not mathiching =======");
		
	}
		@Test(description = "checking login page logo...") 
		public void loginPageLogoTest() {
			
		boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Assert.assertEquals(flag, false, "======= logo is not mathiching =======");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
