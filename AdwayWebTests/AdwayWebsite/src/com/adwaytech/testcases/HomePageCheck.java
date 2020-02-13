package com.adwaytech.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import lib.AppConfig;


public class HomePageCheck 
{
	//public static void main(String args[]) throws Exception
	@Test
	public void HomePage() throws Exception
	{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito");
	
	WebDriver driver = new ChromeDriver(options);
	AppConfig launch = new AppConfig(driver);
	launch.LaunchApp();
	launch.closeApp();
	}
	
}
