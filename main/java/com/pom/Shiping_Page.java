package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shiping_Page {
	
	public WebDriver driver;
	 
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement tick_btn;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement nxt_btn;
	
	public Shiping_Page(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNxt_btn() {
		return nxt_btn;
	}

	public WebElement getTick_btn() {
		return tick_btn;
	}

}
