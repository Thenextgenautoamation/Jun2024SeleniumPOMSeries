package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.thenextgenautomation.com/");
	
//		xpath: is the address of element in HTMlDOM
		
//		1. absolute xpath:
//		starts with one single forwar slash: /
		
//		/html/body/div[2]/div/div/div[2]/form/div[0]/input
		
//		2. Relative xpath/Custom xpath
//		Starts with double forward slash: //
		
//		formula
//		xpath axes: Relationship: Ancestors, parent, child, siblings
//		function
		
//		//htmltag[@attribute = "Value"]
		
		//input[@id= "input-email"]
		
		//input[@name= "email"]
		//input[@placeholder= "E-Mail Address"]
		
		//input...14 FEs
		//input[@id]..6 FEs
		//input[@name]
		//input[@placeholder]
		
//		//htmltag[@attr1 = "value" and attr2 = "vallue" and attr3 ="value"]
		
		//input[@name = "firstname" and @id= "input-firstname" and @type ="text"]
		//input[@type and @name = "firstname" and @id= "input-firstname" ]
		//input[@type and @name and @id ]
		
		//htmltag[@attr1 = "value" or attr2 = "vallue" or attr3 ="value"]
		
		//input[@id = "input-firstname" or @type = "text" or @class ="form-control"]
		
		//*[@attr = 'Value']
//		driver.findElement(By.xpath("//input[@name = 'email']"));
//		driver.findElements(By.id(null));
		
		//*[@type = 'text']
		//input[@type = 'text']: Better performance
		//input[@name = 'email']
		
//		text() in xpath:
//		hmtltag[text()= 'value']
		
		//h1[text()= 'Register Account']
		//a[text()= 'Downloads']
		//legend[text()= 'Newsletter']
		//div[text()= 'I have read and agree to the ']
		//a[text() = 'My Account']
		
//		contains()in xpath: 
//		contains with attribute:
		
//		htmltag[contains(@attr, 'value')]
		
		//input[contains(@id, 'input-firstname')]
		//input[contains(@name, 'firstname')]
		//input[contains(@placeholder, 'Last Name')]
		
		//input[contains(@placeholder='Last Name')]... Wrong xpath
		
		//htmltag[contains(@attr1,'value' and contains@attr2,'value')]
		
		//input[contains(@placeholder, 'Last Name') and contains(@id,'input-lastname')]
		//input[contains(@placeholder, 'Last Name') and contains(@id,'input-lastname') and contains(@class, 'form-control')]
		
//		dynamic elements with dynamic attributes:
		
//		<input firstname = "12345"/>
//		<input firstname = "123"/>
//		<input firstname = "373992"/>
//		<input firstname = "76738"/>
		
//		By.id("firstname_76738");
		
		
		//contains() with text():
		
//		htmltag[contains(text(),'value')]
		
		//label[contains(text(),'E-Mail')]
		
		//p[contains(text(),'features through marketplace, uploading' )]
//		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'ensuring that our candidates are well-prepared')]"));
		
//		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'candi')]"));
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'ensuring that our candidates') and @class='wixui-rich-text__text']"));
		
		System.out.println(element.getText());
		
//		starts-with():
//		htmtltag[starts-with(@attr ='value'))]
		//input[starts-with(@placeholder, 'First Name')]
		
		//input[starts-with(@id, 'input')]
		
		//a[starts-with(@href,'https')]
		
		
		//span[@class='wixui-rich-text__text' and contains(text(),'ensuring that our candidates')]
		
		//input[contains(@id,'firstname')]
		
//		starts with and text():
		//htmltag[starts-with(text(),'value')]
		//a[starts-with(text(),'Address')]
		
		//a[starts-with(text(),'R')]
		
		
//		/ends-with: not available
		
//		last()?
		
//		(//input[@id])[last()]
		
//		(//input[@id])[last()-1]
		
//		(//input[@id])[last()-2]
		
//		(//input[@id])[last()-last()+1]
		
//		indexing in xpath:
		
//		(//a[text() ='Forgotten Password'])[2]
//		(//input[@class])[4]
		
//		position():
		
//		(//input[@id])[position()=1]
//		(//input[@id])[position()=last()-1]
		
//		text with space:
		
//		Nnth:
		
		//label[normalize-space() = 'Yes']
		
	
		

	}

}
