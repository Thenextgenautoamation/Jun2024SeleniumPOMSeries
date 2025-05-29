package testNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	
	// global pre-conditions
	//pre conditions
	 //test steps + expect vs actual results
	// after steps
	//global after steps
	
	//BM.... loginToApp
	//addtoCart test
	//AM...logout
	
	//BM.... loginToApp
	//checkout test
	//AM...logout
	
	
	//BM.... loginToApp
	//search test
	//AM...logout

	
	
	
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS...conect with Data base");
	}
	
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT...creater user");
	}
	
	//3 
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC... launch Browser");
	}
	//4 7 9 11
	
	@BeforeMethod
	public void loginToApp() {
		
		System.out.println("BM.... loginToApp");
	}
	//5
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	//8
	@Test
	public void addToCartTest() {
		System.out.println("addtoCart test");
	}
	//10
	@Test
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	//6 8 12
	@AfterMethod
	public void logout() {
		System.out.println("AM...logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC...close Browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT...delete user");
	}
	//15
	@AfterSuite
	public void diconnectDB() {
		System.out.println("As...disconnect data base");
	}
	

}
