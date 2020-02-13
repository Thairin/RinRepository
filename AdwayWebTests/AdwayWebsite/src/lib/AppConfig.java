package lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppConfig {

	WebDriver driver;

	public AppConfig(WebDriver driver) throws Exception
	{
		
		this.driver = driver;
	}	
	
	public void LaunchApp() throws Exception
	{
		driver.manage().window().maximize();		
		//Launching the website using URL and printing message 
		driver.get("http://www.adwaytech.com/");
		System.out.println("AdwayTech Website launched successfully");
		
		//Finding "About" element on home page and printing relevant message
		WebElement element = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[1]/a"));
		Boolean AboutPresent = element.isDisplayed();
		if (AboutPresent == true) 
			System.out.println("Home page displayed as expected");
		
		Thread.sleep(3000);
		
		//Clicking on the Login button 
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[6]/a")).click();
		Thread.sleep(5000);
		
		//Checking element to confirm if login page is launched successfully
		Boolean loginPresent = driver.findElement(By.xpath("/html/body/div[2]/div/h2")).isDisplayed();
		if (loginPresent ==true)
				System.out.println("Login Page displayed successfully");
		}
	
	public void closeApp()
	{	
	driver.close();
	System.out.println("----Browser closed---");
	}
}