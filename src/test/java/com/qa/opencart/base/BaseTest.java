package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.SearchResultsPage;

public class BaseTest {
	WebDriver driver;
	protected DriverFactory df;
	protected Properties prop;

	protected LoginPage loginpage;
	protected AccountPage acctPage;
	protected SearchResultsPage searchResultsPage;
	protected ProductInfoPage prodInfoPage;

	@BeforeTest
	@Parameters({"browser"})
	public void setUp(@Optional("chrome")String browserName) {
		
		df = new DriverFactory();
		prop = df.initPro();
		
		if(browserName != null) {
			prop.setProperty("browser", browserName);
		}

		driver = df.initDriver(prop);

		loginpage = new LoginPage(driver);
		
		
		

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
//		if(DriverFactory.getDriver() != null) {
//			
//			DriverFactory.getDriver().close();
//		}

	}
}
