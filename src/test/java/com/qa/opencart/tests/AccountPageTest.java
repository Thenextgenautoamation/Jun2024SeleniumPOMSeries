package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;
import com.qa.opencart.pages.SearchResultsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

//@Epic
//@Story
//@Feature

public class AccountPageTest extends BaseTest {
	
	@BeforeClass
	@Description("Setup method to login and navigate to the account page")
	@Severity(SeverityLevel.NORMAL)
	public void acctSetUp() {
		acctPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String ActualPagetitle = acctPage.AcctPageTitle();
		Assert.assertEquals(ActualPagetitle, AppConstants.Account_PAGE_TITLE, AppError.PAGE_TITLE_NOT_MATCH);
	}

	@Test(priority = 2)
	public void AcctPageURLTest() {
		String ActualUrl = acctPage.AcctPageURL();
		Assert.assertTrue(ActualUrl.contains(AppConstants.Account_PAGE_FRACTION_URL), AppError.URL_NOT_FOUND);

	}

	@Test(priority = 3)
	public void isLogoutLinkExist() {

		Assert.assertTrue(acctPage.isLogoutLinkExist(), AppError.ELEMENT_NOT_FOUND);
	}
	@Test(priority = 4)
	public void pageHeadersTest() {
		List<String> acctpageHeadersList = acctPage.getPageHeaders();
		Assert.assertEquals(acctpageHeadersList, AppConstants.PAGE_HEADERS_LIST, AppError.LIST_IS_NOT_MATCHED);
	}
	
	@DataProvider
	public Object[][] getSearchData() {
		
		return new Object[][] {
			{"macbook", 3},
			{"imac", 1},
			{"iphone", 1},
			{"car", 0}
			
		};
	}
	

	@Test(dataProvider = "getSearchData" ,priority = 5)
	public void searcTest(String searchKey, int resultsCount) {
	 searchResultsPage = acctPage.doSearch(searchKey);
	 Assert.assertEquals(searchResultsPage.getSearchResultsCount(), resultsCount, AppError.RESULTS_COUNT_NOT_MATCHED);
	}

}
