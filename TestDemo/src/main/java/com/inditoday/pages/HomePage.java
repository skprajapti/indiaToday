package com.inditoday.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	final WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//img[@title=\"Flipkart\"]")
	private WebElement flipkartLogo;
	
	
	public String logoName() {
		return flipkartLogo.getAttribute("title");
	}
	
	
	
	
	

}
