package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/example-form-templates/file-upload-example/"); //

		driver.findElement(By.xpath("//img[@title='File-Upload-Demo-Forms-and-Examples']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

//		driver.findElement(By.cssSelector("#RESULT_TextField-2")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id = 'RESULT_TextField-2']")).sendKeys("Paul");

		driver.switchTo().defaultContent(); // back to main page

		String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();

		System.out.println(header);

	}

}
