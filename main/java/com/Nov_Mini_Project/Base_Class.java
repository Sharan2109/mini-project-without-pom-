package com.Nov_Mini_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static TakesScreenshot shot;

	public static WebDriver getbrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\firefox.exe");

			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static void url(String url) {

		driver.get(url);

	}

	public static void ClickOnElement(WebElement element) {

		element.click();

	}

	public static void inputvalue(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void quit() {

		driver.quit();
	}

	public static void close() {

		driver.close();
	}

	public static void select(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}

	}

	public static void navigate(String type, String url) {

		if (type.equalsIgnoreCase("forward")) {

			driver.navigate().forward();

		} else if (type.equalsIgnoreCase("back")) {

			driver.navigate().back();

		} else if (type.equalsIgnoreCase("to")) {
			driver.navigate().to(url);
		} else if (type.equalsIgnoreCase("refresh")) {

			driver.navigate().refresh();
		}

	}

	public static void screenshot(String name) throws Throwable {

		shot = (TakesScreenshot) driver;
		File f = shot.getScreenshotAs(OutputType.FILE);
		File m = new File("C:\\Users\\Sharan\\eclipse-workspace\\Selenium\\screenshots//" + name);
		FileHandler.copy(f, m);

	}

	public static void actions(String type, WebElement element) {

		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {

			a.click(element).perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {

			a.doubleClick(element).perform();
		} else if (type.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).perform();
		} else if (type.equalsIgnoreCase("contextClick")) {
			a.contextClick(element).perform();
		}

	}

	public static void sleep(int mili_seconds) throws Throwable {

		Thread.sleep(mili_seconds);

	}
      
	public static  void frame(String type , WebElement element ) {
     
		if (type.equalsIgnoreCase("framein")) {
			driver.switchTo().frame(element);
		}
		else if (type.equalsIgnoreCase("frameout")) {
			driver.switchTo().defaultContent();
		}
	}
	
}
