package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.TimeUtil;

import SeleniumSessions.ElementUtil;

public class ProductInfoPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	By productImagesCount = By.cssSelector("a.thumbnail");
	By productHeader = By.cssSelector("div#content h1");
		
	public ProductInfoPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}
	
	public int getProductImageCount() {
		List<WebElement> Productimagecount = eleUtil.waitForElementVisible(productImagesCount, TimeUtil.LONGER_TIME);
		
		int resultCount = Productimagecount.size();
		System.out.println(resultCount);
		
		return resultCount;
		
	}
	
	public String getProductHeader()
	{
		String header = eleUtil.doGetText(productHeader);
		System.out.println("Product hear ===" + header);
		return header;
	}
	
	

}
