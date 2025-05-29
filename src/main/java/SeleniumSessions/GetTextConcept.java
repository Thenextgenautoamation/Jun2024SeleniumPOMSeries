package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/en-gb?route=account/login");

//			String forgottenLink = driver.findElement(By.linkText("forgotten Password")).getText();

//			String forgottenLink = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[3]")).getText();
//			
//		System.out.println(forgottenLink);
//		
//		//*[@id="form-login"]/h2
//		
//		String pageTle = driver.findElement(By.xpath("//*[@id=\"form-login\"]/h2")).getText();
//		
//		System.out.println(pageTle);
//		
//	String para = driver.findElement(By.tagName("p")).getText();
//	
//	System.out.println(para);
//	
//	String header = driver.findElement(By.tagName("h2")).getText();
//	 System.out.println(header);

		// *[@id="content"]/div/div[1]/div/h2

//	 String header1 = driver.findElement(By.xpath("//*[@id=\"form-login\"]/h2")).getText();
//	 System.out.println(header1);

		By headr = By.tagName("h2");

		By para = By.xpath("//*[@id=\"form-login\"]/h2");

		By forgottenLink = By.xpath("//*[@id=\"column-right\"]/div/a[3]");

		ElementUtil elUtil = new ElementUtil(driver);

		String hder = elUtil.doGetText(headr);
		
		System.out.println(hder);

		String params = elUtil.doGetText(para);
		
		System.out.println(params);
		
		String linkTxt = elUtil.doGetText(forgottenLink);

		System.out.println(linkTxt);

	}

}
