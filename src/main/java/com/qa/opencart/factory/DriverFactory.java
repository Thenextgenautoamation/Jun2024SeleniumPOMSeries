package com.qa.opencart.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Properties;

import org.checkerframework.checker.units.qual.cd;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.errors.AppError;

import SeleniumSessions.BrowserException;
import SeleniumSessions.FrameWorkException;

public class DriverFactory {

	WebDriver driver;
	Properties prop;

	public static ThreadLocal<WebDriver> tLDriver = new ThreadLocal<WebDriver>();

	/**
	 * This is used to init the driver on the basis on given browserName
	 */

	public WebDriver initDriver(Properties prop) {

		String browserName = prop.getProperty("browser");

//		prop = new Properties();
//		String browserName = prop.getProperty("browser");
		System.out.println(" browser name is : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
//			driver = new ChromeDriver();
			tLDriver.set(new ChromeDriver());
			break;
		case "firefox":
//			driver = new FirefoxDriver();
			tLDriver.set(new FirefoxDriver());
			break;
		case "safari":
//			driver = new SafariDriver();
			tLDriver.set(new SafariDriver());
			break;
		case "edge":
//			driver = new EdgeDriver();
			tLDriver.set(new EdgeDriver());
			break;

		default:
			System.out.println("plz pass the right browser name..." + browserName);
			throw new BrowserException(AppError.BROWSER_NOT_FOUND);

		}

		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();

		getDriver().get(prop.getProperty("url"));

		return getDriver();

	}

	public static WebDriver getDriver() {

		return tLDriver.get();
	}

	public Properties initPro() {

		prop = new Properties();

		FileInputStream ip = null;
//		mvn clean install -Denv = "qa"

		String envName = System.getProperty("env");

		if (envName == null) {
			System.out.println("env name is not given , hence running it on QA environment");

			try {
				ip = new FileInputStream(AppConstants.CONFI_QA_FILE_PAHT);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		} else {

			try {

				switch (envName.trim().toLowerCase()) {

				case "qa":

					ip = new FileInputStream(AppConstants.CONFI_QA_FILE_PAHT);
					break;

				case "dev":

					ip = new FileInputStream(AppConstants.CONFI_DEV_FILE_PAHT);
					break;
				case "stage":

					ip = new FileInputStream(AppConstants.CONFIG_STAGE_FILE_PAHT);
					break;
				case "uat":

					ip = new FileInputStream(AppConstants.CONFIG_UAT_FILE_PAHT);
					break;
				case "prop":

					ip = new FileInputStream(AppConstants.CONFI_PROD_FILE_PAHT);

					break;

				default:
					System.out.println("please pass the rith env name... " + envName);
					throw new FrameWorkException(" ==== WRONG ENV PASSED===");

				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}

		try {
			prop.load(ip);

		} catch (IOException e) {
			e.printStackTrace();

		}
		return prop;
	}

	public static String getScreenShort(String methodName) {

		// get the driver instance

		TakesScreenshot screenshotTaker = (TakesScreenshot) getDriver();
		

		// Take the screenshot and save it to a temporary location

		File scrFile = screenshotTaker.getScreenshotAs(OutputType.FILE);

		// Define the path for the screenshot folder

		String screenshotDirPath = System.getProperty("user.dir") + "/screenshots"; 

		// create the screenshots folder if it doesn't exist

		File screenShotDir = new File(screenshotDirPath);
		if (!screenShotDir.exists()) {
			if (screenShotDir.mkdir()) {
				System.out.println("Folder 'screenShots' created successfully at :" + screenShotDir);
			} else {
				System.out.println("Failed to create the folder 'screenshots' at " + screenShotDir);
			}
		}

		// Define the destination path for the screenshot

		String screenshotPath = screenshotDirPath + "/" + methodName + "_" + System.currentTimeMillis() + ".png"; 

		File destination = new File(screenshotPath);

		// copy the screenshot to the destination path
		try {
			FileHandler.copy(scrFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return destination.getAbsolutePath();

	}

}
