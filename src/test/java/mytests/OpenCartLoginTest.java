package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test(description = "checking login page title...", priority = 1)
	public void loginPageTitleTest() {
		String actualtTitle = driver.getTitle();
		System.out.println("page title : " + actualtTitle);
		Assert.assertEquals(actualtTitle, "Account Login", " ======= title is not mathiching =======");
		
		
	}
	
	@Test(description = "checking login page url...",priority = 2)
	public void loginPageUrlTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println("page title : " + actualUrl);
		
		Assert.assertTrue(actualUrl.contains("account/login"), "======= title is not mathiching =======");
		
	}
		@Test(description = "checking login page logo...", priority = 3) 
		public void loginPageLogoTest() {
			
		boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true, "======= logo is not mathiching =======");
		
	}
}
