package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womens_page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement select_womwn;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[1]")
	private WebElement evening_dress;



	public Womens_page(WebDriver driver2) {
     this.driver = driver2;
     PageFactory.initElements(driver, this);
	
	}

	public WebElement getSelect_womwn() {
		return select_womwn;
	}

	public WebElement getEvening_dress() {
		return evening_dress;
	}

}
