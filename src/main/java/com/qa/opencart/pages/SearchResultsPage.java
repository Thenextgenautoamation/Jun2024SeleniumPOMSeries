package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.TimeUtil;

import SeleniumSessions.ElementUtil;

public class SearchResultsPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	By searchResults = By.cssSelector("div.product-thumb");
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		
		eleUtil = new ElementUtil(driver);

	}
	
	public int getSearchResultsCount() {
		List<WebElement> resultList = eleUtil.waitForElementVisible(searchResults, TimeUtil.LONGER_TIME);
		
		int resultCount = resultList.size();
		System.out.println(resultCount);
		
		return resultCount;
		
	}
	public ProductInfoPage selectProduct(String productName) {	
	eleUtil.doClick(By.linkText(productName),TimeUtil.DEFAULT_TIME);
	return new ProductInfoPage(driver);

		
	}
	

}
