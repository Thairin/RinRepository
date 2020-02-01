package com.adwaytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAdwway {

	
	public static void main(String[] args) throws Exception
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("http://www.adwaytech.com/");
		System.out.println("AdwayTech Website launched successfully");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[1]/a"));
		Boolean AboutPresent = element.isDisplayed();
		if (AboutPresent == true) 
			System.out.println("Home page displayed as expected");
		else
			System.out.println("Unable to launch home page");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[6]/a")).click();
		Thread.sleep(5000);
		
		Boolean loginPresent = driver.findElement(By.xpath("/html/body/div[2]/div/h2")).isDisplayed();
		if (loginPresent ==true)
				System.out.println("Login Page displayed successfully");
		driver.close();
		}
}
