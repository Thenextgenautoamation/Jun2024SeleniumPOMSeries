package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/example-form-templates/file-upload-example/"); //

		driver.findElement(By.xpath("//img[@title='File-Upload-Demo-Forms-and-Examples']")).click();

		By frameLocator = By.xpath("//iframe[contains(@id,'frame-one')]");
		
		waitForFrameByLocator(frameLocator, 10);

		driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-2']")).sendKeys("Paul");

		driver.switchTo().defaultContent(); // back the main page

		String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();

		System.out.println(header);

	}

	public static void waitForFrameByLocator(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));

	}

	public static void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	public static void waitForFrameByIDOrName(String frameIDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIDOrName));

	}

	public static void waitForFrameByWebElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));

	}

}
