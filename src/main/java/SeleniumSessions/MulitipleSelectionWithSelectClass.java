package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulitipleSelectionWithSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropDownEle = driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select"));
		
		Select select = new Select(dropDownEle);
		
		if(select.isMultiple()) {
			select.selectByVisibleText("American flamingo");
			
			select.selectByVisibleText("Chilean flamingo");
			
			select.selectByVisibleText("James's flamingo");
			
			select.selectByVisibleText("Lesser flamingo");
			
			
		}
		
		select.deselectByVisibleText("James's flamingo");
		
//		select.deselectAll();


	}

}
