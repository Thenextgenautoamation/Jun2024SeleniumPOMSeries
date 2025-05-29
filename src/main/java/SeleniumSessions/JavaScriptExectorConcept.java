package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExectorConcept {

	public static void main(String[] args) throws InterruptedException {

//		JavaScriptExecutor --- Interface --executeScript();

//		RWD -->JavaScriptExecutor
//		RWD ---> WebDriver

//		to execute the Js on the browser -- JS

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		WebDriver driver = new WebDriver();

//		driver.executeScript();

		JavascriptExecutor jS = (JavascriptExecutor)driver;
		
		String title = jS.executeScript("return document.title").toString();
		
		System.out.println(title);
		
		
		JavaScriptUtil jUtil = new JavaScriptUtil(driver);
		
//		String title = jUtil.getTitleByJs();
		
		System.out.println(title);
		
		String url = jUtil.getURLByJs();
		
		System.out.println(url);
		
//		jUtil.generateJSConfirm("I am happy with confirm");
//		
		jUtil.generateJSPrompt("I am js prompt alert", "veda");
		
//		Thread.sleep(2000);
//		
//		jUtil.generateJSPrompt("this is js Prompt", "testing");
//		
//		
//		Thread.sleep(2000);
		
		
//		
//		jS.executeScript("prompt("Iam a prompt alert")");
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("testing");
////		alert.accept();
//		
//		String pageText = jUtil.getPageInnerText();
//
//		System.out.println(pageText);
//		System.out.println("+++++++++++++++++=====");
//		if(pageText.contains("CONTACT US")) {
//			System.out.println("Pass");
		//}
		
//		WebElement ele = driver.findElement(By.cssSelector(".product-spotlight"));
//		WebElement ele = driver.findElement(By.xpath("//h2[text()= 'Grow better with HubSpot today']"));
//		
//		jUtil.scrollIntoView(ele);
//		WebElement ele = driver.findElement(By.cssSelector("#input-email"));
//		
//		WebElement pwd = driver.findElement(By.cssSelector("#input-password"));
//		
//		WebElement link = driver.findElement(By.linkText("Continue"));
//		
//		jUtil.drawBorder(ele);
//		
//		jUtil.flash(ele);
//		ele.sendKeys("Veda@gmail.com");
//		
//		
//		jUtil.drawBorder(pwd);
//		
//		jUtil.drawBorder(link);
//		
//		jUtil.flash(pwd);
//		
//		pwd.sendKeys("Veda@123");
	}

}
