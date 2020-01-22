package myTestNGfirstRun;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class validLoginCheck extends TestNGONE
{
	@Test(dataProvider="myDataRepository",description="Verify if the user is able to Login")
	public void inputvalidCredentials(String username, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name=\"identifier\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Reporter.log("Username inputted", true);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Reporter.log("Password inputted", true);
		Thread.sleep(5000);
		System.out.println("Login attempted successfully with username as "+username+" and password as "+password);
		
	}
	
	@DataProvider(name="myDataRepository")
	public Object[][] passData()
	{
		
		Object[][] dataLine=new Object[2][2];
		
		dataLine[0][0] = "riniclaudia22";
		dataLine[0][1] = "Password1";
		
		dataLine[1][0] = "riniclaudia";
		dataLine[1][1] = "Password2";
			
		return dataLine;
	
	}
	
//	@Test(description="Verify if the user is not able to Login")
//	public void inputCredentials()
//	{
//		System.out.println("Loggedin failed due to invalid credentials");
//	}
	

}
