package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Image_Click {
	
	public WebDriver driver ;
	
	@FindBy(xpath="//img[@alt='Printed Dress']")
	 private WebElement quick_view;
	
	@FindBy(xpath="//a[@class='quick-view-mobile']")
	private WebElement img_clck;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath="(//a[@data-field-qty='qty'])[2]")
	private WebElement quantity_click;
	
	@FindBy(xpath="//a[@name='Pink']")
	private WebElement colour;
	

	@FindBy(id = "add_to_cart")
	private WebElement add_tocart;

	

	public Image_Click(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuick_view() {
		return quick_view;
	}

	public WebElement getImg_clck() {
		return img_clck;
	}
	
	public WebElement getFrame() {
		return frame;
	}
	
	public WebElement getQuantity_click() {
		return quantity_click;
	}
	
	public WebElement getColour() {
		return colour;
	}
	
	public WebElement getAdd_tocart() {
		return add_tocart;
	}

	

}
