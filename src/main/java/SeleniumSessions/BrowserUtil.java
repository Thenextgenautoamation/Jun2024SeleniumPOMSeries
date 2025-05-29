package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserUtil {
	
	 WebDriver driver;
	 
	 public WebDriver launchBrowser(String browserName) {
		 
		 System.out.println("The broweser name : " +browserName);
		 
		 switch (browserName) {
		 
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Pass the right browser: "+ browserName);
			
			 throw new BrowserException("INVALID BROWSER.... " + browserName);
			
		}
		 return driver;
		 
	 }
	 public void launchUrl(String url) {
		 
		 if(url == null) {
			 
			 throw new BrowserException("INVALID url.... " + url);
		 }
		 if(url.isBlank()|| url.isEmpty()) {
			 throw new BrowserException(" BANK/EMPTY URL.... " + url);
		 }
		 
//		  www.https://google.com
		 
		 if(url.indexOf("http") == -1 ||url.indexOf("http")>0) { 
			 throw new BrowserException(" HTTP(s) is missing or misplaced.... " + url);
		 }
		 
		 driver.get(url);

	 }
	 public String getPageTitle() {
		 
		 String  title = driver.getTitle();
		 if(title == null) {
			 System.out.println("getting the null titl....");
			 return null;
		 }
		 return title;
	 }
	 public String getCurrentUrl() {
		 
		 return driver.getCurrentUrl();
	 }
	 
	 public void quitBrowser() {
		 driver.quit();
	 }
	 
	 public void closeBrowser() {
		 driver.close();
	 }
     

}
