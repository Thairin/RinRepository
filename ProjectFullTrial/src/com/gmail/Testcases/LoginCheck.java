/**
 * 
 */
package com.gmail.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Lib.AppConfig;

/**
 * @author AdwayHR
 *
 *Login check using single set of credentials
 */
public class LoginCheck {

	WebDriver driver;
	@Test
	public void LoginCh() throws Exception
	{
		driver = new ChromeDriver();
		AppConfig app=new AppConfig(driver);
		app.launchApp();
		app.login("Username","Password");
		app.closeApp();
	}	
	
}
