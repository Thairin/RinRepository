package com.adwaytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAdwway {

	
	public static void main(String[] args) throws Exception
	{
		
		//Adding chromeoptions to view the website in incognito window
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		//Initialising webdriver and maximizing
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Launching the website using URL and printing message 
		driver.get("http://www.adwaytech.com/");
		System.out.println("AdwayTech Website launched successfully");
		
		//Finding "About" element on home page and printing relevant message
		WebElement element = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[1]/a"));
		Boolean AboutPresent = element.isDisplayed();
		if (AboutPresent == true) 
			System.out.println("Home page displayed as expected");
		else
			System.out.println("Unable to launch home page");
		
		Thread.sleep(3000);
		
		//Clicking on the Login button 
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[6]/a")).click();
		Thread.sleep(5000);
		
		//Checking element to confirm if login page is launched successfully
		Boolean loginPresent = driver.findElement(By.xpath("/html/body/div[2]/div/h2")).isDisplayed();
		if (loginPresent ==true)
				System.out.println("Login Page displayed successfully");
		
		//Closing the driver
		driver.close();
		}
}
