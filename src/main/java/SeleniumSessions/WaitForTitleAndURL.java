package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		ElementUtil el = new ElementUtil(driver);

		el.isPageLoading(2);

		By pricingLink = By.linkText("Pricing");

		el.clickWhenReady(pricingLink, 10);

//	String title = waitForTitleContains("PRICING", 5);
//		System.out.println(title);
//		System.out.println(title.contains("PRICING"));

//		String url = waitForURLContains("pricing.html", 4);
//
//		System.out.println(url);
//
//		System.out.println(url.contains("pricing.html"));

		String url = waitForURLToBe("https://classic.freecrm.com/pricing.html", 3);
		System.out.println(url);
		System.out.println(url.equals("https://classic.freecrm.com/pricing.html"));

	}

//	public static void isPageLoading(int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//
//		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"))
//				.toString(); // "true"
//
//		if (Boolean.parseBoolean(flag)) {
//
//			System.out.println("page is completly laoded");
//		} else {
//			System.out.println("page is not loaded");
//		}
//
//	}
	public static String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not correct ");

		}
		return driver.getTitle();
	}

	public static String waitForTitleToBe(String titleValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println("title not correct ");

		}
		return driver.getTitle();
	}

	public static String waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(" url not correct ");

		}
		return driver.getCurrentUrl();
	}

	public static String waitForURLToBe(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
				return driver.getCurrentUrl();
			}
		} catch (TimeoutException e) {
			System.out.println(" url not correct ");

		}
		return driver.getCurrentUrl();
	}
}
