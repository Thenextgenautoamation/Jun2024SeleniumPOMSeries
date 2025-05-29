package testNgAnnotations;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority = 1, description = "search test")
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@Test(priority = 4)
	public void addToCartTest() {
		System.out.println("add to cart Test");
	}

	@Test(priority = 5, description = "checkout test")
	public void checkOutTest() {
		System.out.println("checkout Test");
	}

	@Test
	public void paymentTest() {
		System.out.println("payment Test");
	}

	@Test(priority = 6)
	public void orderTest() {
		System.out.println("order Test");
	}
	@Test(priority = 3)
	public void delivery() {
		System.out.println("delivery Test");
	}

	

}
