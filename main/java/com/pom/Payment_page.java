package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	public WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='bankwire']")
   private	WebElement payment_mode;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement nxt_btn;
	
	public Payment_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	
	

	public WebElement getPayment_mode() {
		return payment_mode;
	}

	public WebElement getNxt_btn() {
		return nxt_btn;
	}




}
