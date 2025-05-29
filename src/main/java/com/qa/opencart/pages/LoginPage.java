package com.qa.opencart.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.TimeUtil;

import SeleniumSessions.ElementUtil;
import io.qameta.allure.Step;

public class LoginPage {
//	1. page objects: By Locators:

	private WebDriver driver;
	private ElementUtil eleUtil;
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By forgotPwd = By.linkText("Forgotten Password");
	private By register = By.linkText("Register");
	private By loginbtn = By.xpath("//input[@value = 'Login']");

//	2. public const... of the page

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

//	3. public page actions/methods
	public String LoginPageTitle() {

		String title = eleUtil.waitForTitleToBe(AppConstants.LOGIN_PAGE_TITLE, TimeUtil.DEFAULT_TIME);
		System.out.println("login page Title" + title);
		return title;
	}

	public String LoginPageURL() {
		String url = eleUtil.waitForURLContains(AppConstants.LOGIN_PAGE_FRACTION_URL, TimeUtil.DEFAULT_TIME);
		System.out.println("login page Title" + url);
		return url;
	}

	@Step("user is getting the state of forgot passwor link exist")
	public boolean checkForgotPwdLinkExist() {
		return eleUtil.doIsDisplayed(forgotPwd);

	}

	@Step("user is logged in with username: {0} and password: {1}")
	public AccountPage doLogin(String username, String pwd) {

		System.out.println("user credentials " + username + ":" + pwd);
		eleUtil.doSendKeys(emailId, username);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginbtn);
		return new AccountPage(driver);

	}
}
