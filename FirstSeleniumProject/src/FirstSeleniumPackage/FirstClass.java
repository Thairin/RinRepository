package FirstSeleniumPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {
public static void main(String[] args) throws InterruptedException, Exception
{
//System.setProperty("webdiver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

ChromeOptions options = new ChromeOptions();	
options.addArguments("--incognito");

WebDriver driver = new ChromeDriver(options);
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

String title = driver.getTitle();
System.out.println(title);
Thread.sleep(2000);

WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
firstName.click();
firstName.sendKeys("Test1");

WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
lastName.click();
lastName.sendKeys("Test1");

WebElement emailField = driver.findElement(By.xpath("//input[@name='reg_email__']"));
emailField.click();
emailField.sendKeys("riniclaudia@yahoo.com");

WebElement emailConfirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
emailConfirm.click();
emailConfirm.sendKeys("riniclaudia@yahoo.com");

WebElement newPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
newPassword.click();
newPassword.sendKeys("Abcdef@123");

WebElement month = driver.findElement(By.name("birthday_month"));

Select select = new Select(month);
select.selectByVisibleText("Jul");

WebElement day = driver.findElement(By.name("birthday_day"));

Select select1 = new Select(day);
select1.selectByVisibleText("22");

WebElement year = driver.findElement(By.name("birthday_year"));

Select select2 = new Select(year);
select2.selectByVisibleText("1991");

WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
gender.click();

TakesScreenshot ts=(TakesScreenshot)driver;
File f=ts.getScreenshotAs(OutputType.FILE);
FileHandler.copy(f,new File("E:\\Screenshots\\FirstSelenium_TestCase\\"+"Form_filled_Page"+".jpg"));


WebElement submit =driver.findElement(By.name("websubmit"));
submit.click();


//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Livin@2014");
////Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click(); 

System.out.println("Sucessful flow and exiting");
//driver.close();
}
}
        