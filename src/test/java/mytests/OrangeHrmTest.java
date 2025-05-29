package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {

	
	
	@Test(description = "checking login page title...", priority = 1)
	
	public void loginPageTitleTest() {
		String actualtTitle = driver.getTitle();
		System.out.println("page title : " + actualtTitle);
		Assert.assertEquals(actualtTitle, "Get in Touch with OrangeHRM Sales | OrangeHRM HR Software",
				" ======= title is not mathiching =======");

	}

	@Test(description = "checking login page url...",priority = 2)
	public void loginPageUrlTest() {
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("page title : " + actualUrl);

		Assert.assertTrue(actualUrl.contains("contact-sales"), "======= title is not mathiching =======");
		

	}

}
