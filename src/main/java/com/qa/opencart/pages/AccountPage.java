package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.TimeUtil;

import SeleniumSessions.ElementUtil;

public class AccountPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	private By searchText = By.xpath("//div[@id='search']/input");
	private By searchIcon = By.cssSelector("div#search  button");
	private By headers = By.cssSelector("div#content h2");
	private By logoutLink = By.linkText("Logout");

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

//	3. public page actions/methods
	public String AcctPageTitle() {

		String title = eleUtil.waitForTitleToBe(AppConstants.Account_PAGE_TITLE, TimeUtil.DEFAULT_TIME);
		System.out.println("Account page Title" + title);
		return title;
	}

	public String AcctPageURL() {

		String url = eleUtil.waitForURLContains(AppConstants.Account_PAGE_FRACTION_URL, TimeUtil.DEFAULT_TIME);
		System.out.println("login page Title" + url);
		return url;
	}

	public boolean isLogoutLinkExist() {
		return eleUtil.doIsDisplayed(logoutLink);
	}

	public void logout() {
		eleUtil.doClick(logoutLink);

	}

	public boolean isSearchExist() {
		return eleUtil.doIsDisplayed(searchText);

//		return eleUtil.waitForElementVisible(searchText, TimeUtil.DEFAULT_TIME).isDisplayed();

	}

	public List<String> getPageHeaders() {

		List<WebElement> headersList = eleUtil.waitForElementVisible(headers, TimeUtil.MEDIUM_TIME);

		List<String> headersValList = new ArrayList<String>();

		for (WebElement e : headersList) {

			String text = e.getText();

			headersValList.add(text);

		}
		return headersValList;
	}

	public SearchResultsPage doSearch(String searchKey) {

		if (isSearchExist()) {
			eleUtil.doSendKeys(searchText, searchKey);
			eleUtil.doClick(searchIcon);
			return new SearchResultsPage(driver);
		} else {
			System.out.println("Search field is not present on the current page");
			return null;
		}

	}

}
