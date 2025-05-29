package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;

public class ProductInfoPageTest extends BaseTest{
	
	@BeforeClass
	public void productInfoPageSetup() {
		
		acctPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@DataProvider
	public Object[][] getProductHeaderData() {
		
		return new Object[][] {
			{"macbook", "MacBook Pro"},
			{"imac", "iMac"},
			{"iphone", "iPhone"},
			{"samsung", "Samsung SyncMaster 941BW"}
			
		};
	}
	
	
	@Test(dataProvider = "getProductHeaderData", priority = 1)
	public void productHeaderTest(String searchKey, String productName ) {
		searchResultsPage = acctPage.doSearch(searchKey);
		prodInfoPage = searchResultsPage.selectProduct(productName);
		Assert.assertEquals(prodInfoPage.getProductHeader(), productName, AppError.HEADER_NOT_FOUND);

		
	}
	@DataProvider
	public Object[][] getProductImageData() {
		
		return new Object[][] {
			{"macbook","MacBook Pro", 4},
			{"imac","iMac", 3},
			{"iphone","iPhone",6},
			{"samsung", "Samsung SyncMaster 941BW" ,1}
			
		};
	}
	@Test(dataProvider = "getProductImageData", priority = 2)
	public void productImagesCount(String searchKey, String productName, int imageCount) {
		searchResultsPage = acctPage.doSearch(searchKey);
		prodInfoPage = searchResultsPage.selectProduct(productName);
		Assert.assertEquals(prodInfoPage.getProductImageCount(), imageCount , AppError.IMAGE_COUNT_NOT_MATCHED);

		
	}

}
