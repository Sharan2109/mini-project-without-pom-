package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	@FindBy(id="email")
	 private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pswrd;
	
	@FindBy(id="SubmitLogin")
	 private WebElement btn;

	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswrd() {
		return pswrd;
	}

	public WebElement getBtn() {
		return btn;
	}

}
