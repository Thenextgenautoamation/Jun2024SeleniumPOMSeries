package SeleniumSessions;

import java.util.Properties;

public class TheNextGenAutomation {

	public static void main(String[] args) {

		PropRead readProperties = new PropRead();

		Properties prop = readProperties.initProperties();

		String browser = prop.getProperty("browserName");

		String url = prop.getProperty("url");

		BrowserUtil bUtil = new BrowserUtil();

		bUtil.launchBrowser(browser);

		bUtil.launchUrl(url);

		String title = bUtil.getPageTitle();

		System.out.println(title);

//		Validation/check point
		if (title.equals("HOME | thenextgenautomation")) {
			System.out.println("the page title is correct");
		} else {
			System.out.println("the page title is not correct");
		}

		String pageUrl = bUtil.getCurrentUrl();
		System.out.println(pageUrl);

//		Validation/check point

		if (pageUrl.contains("nextgen")) {
			System.out.println("url is correct");
		} else {
			System.out.println("url is not correct");
		}

//		/ bUtil.quitBrowser();

		bUtil.closeBrowser();

	}

}
