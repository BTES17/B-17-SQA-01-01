package sj;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Selenium2 {
	Hls_Reader obj=new Hls_Reader("C:\\rav.xls");
	static WebDriver driver;
	//static WebDriver driver1;
	setup(int testcase)
	{
		if(getCellData.obj("Sheet1", "Browser", testcase).equals("Google Chrome"))
		{
			String directory = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", directory);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
		else if(getCellData.obj("Sheet1", "Browser", testcase).equals("Mozilla"))
		{
			driver =new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
		}
		
	}
	testcase(int testcase)
	{
		WebElement un_get = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		String id=obj.getCellData("Sheet1", "Username", testcase);
		un_get.sendKeys(id);
		System.out.println(id);
		String pw=obj.getCellData("Sheet1", "Password", testcase);
		pwd.sendKeys(pw);
		System.out.println(pw);
		WebElement click=driver.findElement(By.id("u_0_q"));
		//WebElement un_get1=driver.findElement(By.name("notifications"));
		click.click();
	}
	Result(int testcase)
	{
		
	}
	public static void main(String args[])
	{ int row=obj.getrowcount();
		for(int i=0;i<=row;i++)
		{
			if(getCelldata("Sheet1", "Username", 2).equals(ON))
			{
				setup(i);
				testcase(i);
				Result(i);
			}
		}
	
		String directory = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", directory);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.get("http://www.facebook.com");
		//String title = driver.getTitle();
		//System.out.println(title);
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		/*WebElement un_get1=driver.findElement(By.id("email"));
		WebElement pwd1 = driver.findElement(By.id("pass"));
		String id1=obj.getCellData("sheet1", "Username", 4);
		pwd1.sendKeys(id);
		String ps=obj.getCellData("sheet1", "password", 4);
		WebElement click1=driver.findElement(By.id("u_0_q"));

		click.click();*/
	}
}


