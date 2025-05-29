package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

//		java+Selenium 4.x

//		Automation Steps:
//		open browser:

//		WebDriver driver = new ChromeDriver();
		
		
//		WebDriver driver = new SafariDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();

//		enter url:
		driver.get("http://google.com");
//       get the Title:
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
//         validation point/checkpoint
		if (pageTitle.equals("Google")) {
			System.out.println("The page title is correct");
		} else {
			System.out.println("The page title is not correct");
		} 
//		Autamation Steps+Validation/checkpoint = Automation Testing
		System.out.println("------------------");
		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("google")) {

			System.out.println("The url is correct");
		} else {
			System.out.println("The url is not correct");
		}

		driver.quit();
//		driver.close();

	}

}
