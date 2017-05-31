package sj;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Selenium2 {
	

	
static	Hls_Reader obj=new Hls_Reader("C:\\rav.xls");

	
static WebDriver driver;

	
static void setup(int testcase)
	{
		if(obj.getCellData("Sheet1", "Browser", testcase).equals("Google Chrome"))
		{
			String directory = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", directory); 
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
		else if(obj.getCellData("Sheet1", "Browser", testcase).equals("Mozilla"))
		{
			String directory = "D:\\geckodriver.exe";
			System.setProperty("webdriver.firefox.driver", directory);
			driver =new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		}
		
	}
	static void testcase(int testcase)
	{
		WebElement un_get = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		String id=obj.getCellData("Sheet1", "Username", testcase);
		un_get.sendKeys(id);
		System.out.println(id);
		String pw=obj.getCellData("Sheet1", "Password", testcase);
		pwd.sendKeys(pw);
		System.out.println(pw);
		WebElement login=driver.findElement(By.id("u_0_q"));
		
		login.click();
	}
static void Result(int testcase)
	{
	String expected_result= obj.getCellData("Sheet1","Expected Result",2);
			WebElement e= (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
			String Actual_Result= driver.getCurrentUrl();
			
	if(expected_result.equals(Actual_Result))
	{
		 obj.setCellData("Sheet1","Actual Result",testcase,"Pass");
	}
	else
	{
		obj.setCellData("Sheet1","Actual Result",testcase,"Fail");
	}
	driver.close();

	}
	public static void main(String args[])
	{ int row=obj.getRowCount("Sheet1");
	System.out.println(row);
		for(int i=2;i<=row;i++)
		{
			
			if(obj.getCellData("Sheet1", "Status", row).equals("ON"))
			{
				System.out.println("hello");
				setup(i);
				testcase(i);
				Result(i);
			}
			
		}
	}
}


