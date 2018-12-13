package com.ApplicationOpen;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_FaceBook {

	public static void main(String[] args)
	{
		
		  FirefoxDriver   irfan  = new FirefoxDriver();
		   irfan.get("http://facebook.com");
		  
		  irfan.navigate().to("http://amazon.com");
		  
		  irfan.close();
		  
		  
		  

	}

}
