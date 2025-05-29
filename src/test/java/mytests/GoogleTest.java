package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	

	@Test(description = "checking login page title...", priority = 1)
	public void loginPageTitleTest() {
		String actualtTitle = driver.getTitle();
		System.out.println("page title : " + actualtTitle);
		Assert.assertEquals(actualtTitle, "Google", " ======= title is not mathiching =======");

	}

	@Test(description = "checking login page url...",priority = 2)
	public void loginPageUrlTest() {
		String actualUrl = driver.getCurrentUrl();
		System.out.println("page title : " + actualUrl);

		Assert.assertTrue(actualUrl.contains("google.com/"), "======= url is not mathiching =======");

	}

}
