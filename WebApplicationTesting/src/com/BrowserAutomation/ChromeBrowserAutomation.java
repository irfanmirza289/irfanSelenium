package com.BrowserAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserAutomation {

	public static void main(String[] args) 
	{
		// Chrome browser  Automation
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mesum\\Desktop\\IrfanSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		ChromeDriver     driver = new ChromeDriver();           
	     driver.get("http://google.com");
	     driver.manage().window().maximize();
		WebElement element =driver.findElementByName("q"); element.sendKeys("cheese!");
		element.submit();
		driver.quit();

	}

}
