package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/legacy");
//		CSS: Locator (Cascading Style sheets)
		
//		id: #id
//		#input-email
		
		//htmltag#id
//		input#input-email
		
		//class: .className
//		.form-control
//		.btn-primary
		
//		htmltag.className
//		input.form-control
//		input.btn-primary
		
//		.img-responsive
//		img.img-responsive
	
		
		
//		.c1.c2.c3......cn
//		.hidden-xs.hidden-sm.hidden-md
		
//		htmltag.c1.c2.c3......cn
		
//		span.hidden-xs.hidden-sm.hidden-md  ...FEs
//		a.list-group-item
		
//		#input-email
//		.form-control
		
//		htmltag#id.className
		
//		input#input-password.form-control
		
		//input[@placeholder='Password'] ...xpath
//		input[placeholder='Password'] ...CSS
		
//		input[id='input-email']
		
//		htmltag[attr1 = 'value'][attr2 = 'value'][attr3 = 'value']
		
//		input[name= 'email'][id = 'input-email'][class = 'form-control']
		
//		input[type= 'text'][placeholder= 'E-Mail Address']
		
//		input[name='email'][id ='input-email']
		
//		input[id][name][class]
//		input[id][name][class][type]
		
//		a[href]
		
//		input[name ='email']#input-email 
//		input#input-email[name ='email']
//		input#input-email[name ='email'].form-control
		
//		contains:
		
//		input[id*='password'] --contains
//		input[placeholder^='E-Mail'] ---startwith
//		input[placeholder$='Address']   --endswith
		
		
//		text in CSS? : not available
		
//		Parent to child:
		
//		select#Form_getForm_Country > option  ---direct
		
//		select#Form_getForm_Country  option  ---direct+indirect child Element
		
//		div#content div.well > form
		
//		div#content form
//		form > div.form-group > label[for$= 'email']
		
		
//		nav > div  --direct child
		
//		nav#top div ---direct child + indirect
		
		//child to parent/ancestor?  -- not available : backward traversing in DOM is not allowed
		
		
//		sibling in css:
//		preceding-sibling : N/A
//		following-sibling : Yes
//		label[for$= 'email'] +input#input-email direct immediate following-sibling
//		label[for = 'input-password']~a
		
//		indexing in css:
		
//		select#Form_getForm_Country > option:first-child
//		select#Form_getForm_Country > option:last-child
//		select#Form_getForm_Country > option:nth-child(200)  ---start from top
//		select#Form_getForm_Country > option:nth-child(n)   --All from top
//		select#Form_getForm_Country > option:nth-last-child(3)
//		select#Form_getForm_Country > option:nth-last-child(5)  --start from buttom
		
//		select#Form_getForm_Country > option:nth-child(odd)
//		select#Form_getForm_Country > option:nth-child(even)
//		select#Form_getForm_Country > option:nth-child(n+10) start from 10th element
		
//		select#Form_getForm_Country > option:nth-child(10n)
		
//		odd/even in xpath:
		
//		odd: 3 7 9 11
//		(//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1]
//		even: 2 4 6 8
		
//		(//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0]
//		n/2 == 0 ---even
		
		// comma in CSS,
		
//		input#input-email,input#input-password,input.btn-primary
		
//		By loginFields = By.cssSelector("input#input-email,input#input-password,input.btn-primary");
//		
//		int loginFieldCount = driver.findElements(loginFields).size();
//		
//		System.out.println(loginFieldCount);//4
//		
//		if(loginFieldCount == 3) {
//			
//			System.out.println("the important elements are available on the login page");
//		}
//		
		
//		union operator in xpath: 
		
		//footer//h5 | //footer//a
		
		//footer//h5 | //footer//a | //footer//p
		//footer//h5/ancestor::footer//a[text() = 'Brands']
		//h5[text() = 'Extras']/following-sibling::ul//a[text() = 'Brands']
		
		
//		not in CSS:
		
//		input.form-control:not(input[name='search'])
//		input.form-control:not(input[name='search']):not(input#input-firstname)
		
		
//		Invalid:
		
//		driver.findElement(By.className("form-control private-form__control login-email"))
//		.sendKeys("testing@gmail.com");
//		
//		InvalidSelectorException: Compound class names not permitted
		
		
//		valid:
		
//		driver.findElement(By.className("login-email")).sendKeys("testing@gmail.com");
		
//		valid:
			
//		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"))
//		.sendKeys("testing@gmail.com");
		
//		valid:
		
		driver.findElement(By.xpath("//input[@class = 'form-control private-form__control login-email']"))
		.sendKeys("testing@gmail.com");
		
		
		
		
		
//                   xpath    vs          CSS:
		
//		1. syntax:       medium          easy
//		2. Performance    slow            faster
//		3. backward:     Yes             No
//		4. sibling:       Yes            Yes ----only following-siblings
//		5. text:          yes            No
//		6. index:          yes           Yes --Better
//		7. ancestor:      yes            No
//		8. startWith:     Yes            yes
//		9. endsWith:      No             yes
//		10. comma/union   Yes            yes
//		11. and           yes            yes
//		12. or            yes            no
//		13. not           yes            yes
//		14. SVG           yes             no
//		15. shadowDom     no              yes
//		
		
		
		

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
