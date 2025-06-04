package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String Actualtitle = loginpage.LoginPageTitle();
		Assert.assertEquals(Actualtitle, AppConstants.LOGIN_PAGE_TITLE, AppError.BROWSER_NOT_FOUND);

	}

	@Test(priority = 2)
	public void LoginPageURLTest() {
		String ActualUrl = loginpage.LoginPageURL();
		Assert.assertTrue(ActualUrl.contains(AppConstants.LOGIN_PAGE_FRACTION_URL), AppError.URL_NOT_FOUND);

	}

	@Test(priority = 3)
	public void forgotPwdLinkExitTest() {

		Assert.assertTrue(loginpage.checkForgotPwdLinkExist(), AppError.ELEMENT_NOT_FOUND);
		
	}

	@Test(priority = 4)
	public void loginTest() {
		acctPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals(acctPage.AcctPageTitle(), AppConstants.Account_PAGE_TITLE, AppError.PAGE_TITLE_NOT_MATCH);

	}

}
