package com.gmail.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.AppConfig;
import Lib.ExcelConfig;

public class LoginCheckMultipleCredentials 
{
	WebDriver driver;
			
	@Test(dataProvider="passData")
	public void validLoginCheck(String Username,String Password) throws Exception
	{
		driver=new ChromeDriver();
		
		AppConfig appConfig=new AppConfig(driver);
		
		appConfig.launchApp();
		
		Reporter.log("Attempting login using :"+Username+" and "+Password, true);
		
		appConfig.login(Username,Password);		
		
		Reporter.log("Login attempted successfully",true);
		appConfig.closeApp();
	}

	@DataProvider(name="passData")
	public Object[][] passData() throws Exception
	{
		ExcelConfig excelConfig=new ExcelConfig("E:\\DataProviderExcel1.xlsx");
		int rowNum = excelConfig.rowCount("LoginCredentials");
		
		Object[][] obj=new Object[rowNum][2];
		
		for(int i=0; i<rowNum; i++)
		{
			obj[i][0] = excelConfig.readData("LoginCredentials", i, 0);
			obj[i][1] = excelConfig.readData("LoginCredentials", i, 1);
		}
		return obj;
	}	
}
