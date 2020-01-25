package Lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

/*
 * Class with details of launching the application and login locators
 * 
 */

public class AppConfig 
{

  WebDriver driver;
  By Uname=By.id("identifierId");
  By nextToPassword=By.xpath("//*[@id=\"identifierNext\"]/span/span");
  By Pwd=By.name("password");
  By loginButton=By.xpath("//*[@id=\"passwordNext\"]/span/span");
  takeScreenshot ts=new takeScreenshot();
  
  	public AppConfig(WebDriver driver)
  	{
  		this.driver=driver;
  	}
  
	public void launchApp() throws Exception
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		Reporter.log("------------Browser Launched-----------", true);
		ts.Screenshot(driver, "Home");
	}
		
	public void login(String Username, String password) throws Exception
	{
		driver.findElement(Uname).sendKeys(Username);
		Reporter.log("Username inputted", true);
		ts.Screenshot(driver, "Username");
		driver.findElement(nextToPassword).click();
		driver.findElement(Pwd).sendKeys(password);
		Reporter.log("Password inputted", true);
		ts.Screenshot(driver, "Password");
		Thread.sleep(3000);
		driver.findElement(loginButton).click();
		Thread.sleep(3000);
		ts.Screenshot(driver, "LogonPage");
	}	
	
	public void closeApp()
	{
		driver.close();
		Reporter.log("------------Browser Closed-------------", true);
	}
	
}
