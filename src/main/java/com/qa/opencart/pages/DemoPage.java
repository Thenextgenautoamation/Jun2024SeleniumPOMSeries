package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class DemoPage {
	
	By demo = By.id("demo");
	By cart = By.id("demo");
	
	

public void getDemo() {
	
	System.out.println("demo details");
	System.out.println(demo);
}
public void addToCart() {
	
	System.out.println("Cart details");
	System.out.println(cart);
}

}
