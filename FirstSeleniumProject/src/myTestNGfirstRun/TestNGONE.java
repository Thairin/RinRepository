package myTestNGfirstRun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGONE {

	WebDriver driver;
		
	@BeforeMethod()
	public void launchApplication()
	{
		driver=new ChromeDriver();
		Reporter.log("Session is being launched",true);
		driver.get("http://www.gmail.com");
		//	driver.findElement(By.className("Dummy"));
		}
	
	@AfterMethod()
	public void closeApplication()
	{
		driver.close();
		Reporter.log("Browser Closed",true);
	}
	
	
	
	}


