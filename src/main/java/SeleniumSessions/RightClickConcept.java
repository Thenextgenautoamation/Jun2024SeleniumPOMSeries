package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

//		By rightClick = By.cssSelector("span.context-menu-one");

		By rightClickEle = By.xpath("//span[text() = 'right click me']");

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightClickEle)).perform();

		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list > li.context-menu-icon > span"));

		for (WebElement e : optionsList) {

			String text = e.getText();

			System.out.println(text);
			
			if(text.equals("Copy")) {
				
				e.click();
				
				break;
			}
		}

	}

}
