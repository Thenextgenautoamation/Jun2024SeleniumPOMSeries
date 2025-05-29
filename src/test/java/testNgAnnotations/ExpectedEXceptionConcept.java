package testNgAnnotations;

import org.testng.annotations.Test;

public class ExpectedEXceptionConcept {
	
	String name;

	@Test(priority = 4, description = "add to cart test ", expectedExceptions = {ArithmeticException.class, NullPointerException.class} )
	public void addToCartTest() {
		System.out.println("add to cart Test");
		
		
		int i = 9/3;
		
	System.out.println(" hello");
	
	ExpectedEXceptionConcept obj = null;
	
//	obj = new ExpectedEXceptionConcept();
	
	System.out.println(obj.name); //NPE

	
	
	}

}
