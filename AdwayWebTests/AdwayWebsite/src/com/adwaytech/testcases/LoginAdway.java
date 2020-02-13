package com.adwaytech.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.AppConfig;

public class LoginAdway {

WebDriver driver;
String validusername = "Rclaudia";
String validpasswd = "Livin@16";
	@Test(priority=1)
	//TS-2 : TC-1 Verify if the user is able to login to the Adway website using valid credentials 
	public void LoginValidTest1() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		AppConfig config =new AppConfig(driver);
		config.LaunchApp();
		WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
		username.click();
		username.sendKeys(validusername);
		Thread.sleep(3000);
				
		WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
		passwd.click();
		passwd.sendKeys(validpasswd);
		Thread.sleep(3000);
		
		WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
		loginbut.click();
		
		String HomeText = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/h4")).getText();
		System.out.println(HomeText);
		AssertJUnit.assertEquals("SM Analytica",HomeText);
		config.closeApp();
		
	}
	@Test(priority=2)
	//TS2 : TC2 : Verify if the user is not able to login to the Adway website using invalid credentials
	public void LoginValidTest2() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();
	WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
	username.click();
	username.sendKeys("TrialX");
	Thread.sleep(3000);
	
	WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	passwd.click();
	passwd.sendKeys("XXXXX");
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
//	
	config.closeApp();
	}
	@Test(priority=3)
	//TS2 : TC3 : Verify if the user is not able to login to the Adway website using invalid credentials
	public void LoginValidTest3() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();

	WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
	username.click();
	username.sendKeys(validusername);
	Thread.sleep(3000);
	
	WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	passwd.click();
	passwd.sendKeys("XXXXX");
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
	
	config.closeApp();
	}
	@Test(priority=4)
	//TS2 : TC4 : Verify if the user is not able to login to the Adway website using Valid Password but Invalid Username
	public void LoginValidTest4() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();

	WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
	username.click();
	username.sendKeys("TrialXX");
	Thread.sleep(3000);
	
	WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	passwd.click();
	passwd.sendKeys(validpasswd);
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
	
	config.closeApp();
	}
	
	@Test(priority=5)
	//TS2 : TC5 : Verify if the user is not able to login to the Adway website when no credentials are inputted
	public void LoginValidTest5() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();

	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
	
	config.closeApp();
	}
	
	@Test(priority=6)
	//TS2 : TC6 : Verify if the user is not able to login to the Adway website when only username is entered
	public void LoginValidTest6() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();

		
	WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
	username.click();
	username.sendKeys(validusername);
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
	
	config.closeApp();
	}
	
	@Test(priority=7)
	//TS2 : TC7 : Verify if the user is not able to login to the Adway website when only password is entered
	public void LoginValidTest7() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();
	
	WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	passwd.click();
	passwd.sendKeys(validpasswd);
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	String a = driver.findElement(By.name("username")).getText();
	String p = driver.findElement(By.name("password")).getText();
	System.out.println(a +"and"+p);
	Assert.assertEquals("",a);
	Assert.assertEquals("",p);
//	Thread.sleep(5000);
	
	config.closeApp();
	}
	
	@Test(priority=8)
	//TS2 : TC8 : Verify if the user is able to login to the Adway website after one logon failure attempt
	public void LoginValidTest8() throws Exception
	{
	WebDriver driver=new ChromeDriver();
	AppConfig config =new AppConfig(driver);
	config.LaunchApp();
	
	WebElement passwd = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	passwd.click();
	passwd.sendKeys(validpasswd);
	Thread.sleep(3000);
	
	WebElement loginbut = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	loginbut.click();
	Thread.sleep(2000);
	String ErrorText = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[2]/strong")).getText();
	System.out.println(ErrorText);
	Assert.assertEquals("Invalid Username / Password!",ErrorText);
	
	LoginValidTest1();
	
	/*WebElement username = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[1]/input"));
	username.click();
	username.sendKeys(validusername);
	Thread.sleep(3000);
	
	WebElement pass = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[2]/input"));
	pass.click();
	pass.sendKeys(validpasswd);
	Thread.sleep(3000);
	
	WebElement login = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/form/div[3]/button"));
	login.click();
	
	String HomeText = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/h4")).getText();
	System.out.println(HomeText);
	AssertJUnit.assertEquals("SM Analytica",HomeText);
	config.closeApp();
	*/
	} 
	@Test(priority=9)
	//TS2 : TC9 : Verify if the user is able to login to the Adway website after two logon failure attempts
	public void LoginValidTest9() throws Exception
	{
		LoginValidTest8();
		LoginValidTest8();
		LoginValidTest1();	
	}
	public void LoginValidTest10() throws Exception
	{
		LoginValidTest8();
		LoginValidTest8();
		LoginValidTest8();
		LoginValidTest1();	
	}
}


