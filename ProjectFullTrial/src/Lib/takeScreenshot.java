package Lib;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshot {
	public void Screenshot(WebDriver driver,String FileName) throws Exception
	{
		String path= "E:\\Screenshots\\TC_001_Login_Check\\";
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File(path+FileName+".jpg"));
	}
}