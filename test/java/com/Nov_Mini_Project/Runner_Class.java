package com.Nov_Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pom.Adress_Page;
import com.pom.Home_Page;
import com.pom.Image_Click;
import com.pom.Login_Page;
import com.pom.Payment_page;
import com.pom.Shiping_Page;
import com.pom.Summary_page;
import com.pom.Womens_page;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver = getbrowser("chrome");
	
	public static Home_Page hp = new Home_Page(driver);
	public static Login_Page login = new Login_Page(driver);
	public static Womens_page wp = new Womens_page(driver);
	public static Image_Click ic = new Image_Click(driver);
	public static Summary_page sp = new Summary_page(driver);
	public static Adress_Page ap = new Adress_Page(driver);
	public static Shiping_Page shp= new Shiping_Page(driver);
    public static Payment_page pp = new Payment_page(driver);
	

	public static void main(String[] args) throws Throwable {
		
		
       url("http://automationpractice.com/index.php");
       sleep(2000);
    	
		ClickOnElement(hp.getSignin_btn());
		
        inputvalue(login.getEmail(),"sharan1234@mail.com");
        sleep(2000);
        inputvalue(login.getPswrd(), "123456");

        ClickOnElement(login.getBtn());
		
		sleep(2000);

		actions("movetoelement", wp.getSelect_womwn());
	
		ClickOnElement(wp.getEvening_dress());
	
		
		actions("moveToElement", ic.getQuick_view() );
		
		sleep(2000);

		ClickOnElement(ic.getImg_clck());
		
		sleep(2000);
		
		
		frame("framein", ic.getFrame());
		
			
		for (int i = 0; i <4 ; i++) {
			    ClickOnElement(ic.getQuantity_click());
		}

		ClickOnElement(ic.getColour());
		
		sleep(2000);

		ClickOnElement(ic.getAdd_tocart());
		
		sleep(2000);

		frame("frameout",null);
		
		System.out.println("fff");
		
		sleep(3000);
		
		ClickOnElement(sp.getProceed_button());
		
		ClickOnElement(sp.getProceed_button1());
		

		ClickOnElement(ap.getNext_btn());

		ClickOnElement(shp.getTick_btn());

		ClickOnElement(shp.getNxt_btn());
		
		sleep(2000);
	
		ClickOnElement(pp.getPayment_mode());

		ClickOnElement(pp.getNxt_btn());
		
		sleep(2000);
		screenshot("dress.png");
			}
	
}
