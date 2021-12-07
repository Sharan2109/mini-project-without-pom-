package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Proceed_button;
	
	

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed_button1;
	
	
	public Summary_page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed_button() {
		return Proceed_button;
	}

	public WebElement getProceed_button1() {
		return proceed_button1;
	}

}
