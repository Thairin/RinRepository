/**
 * 
 */
package com.gmail.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		AppConfig app=new AppConfig(driver);
		app.launchApp();
		app.login("riniclaudia","Password");
		app.closeApp();
	}	
}
