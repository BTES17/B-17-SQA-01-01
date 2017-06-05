package ranag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2 {
	static HLS_Reader obj=new HLS_Reader("D:\\inder.xls");
	static WebDriver driver;
	//static WebDriver driver1;
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
		WebElement Login=driver.findElement(By.id("u_0_q"));
		//WebElement un_get1=driver.findElement(By.name("notifications"));
		Login.click();
	}
	static void Result(int testcase)
	{
		String expected_result= obj.getCellData("Sheet1","Expected Result",testcase);
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
		for(int i=2;i<=row;i++)
		{
			if(obj.getCellData("Sheet1", "Status", row).equals("ON"))
			{
				setup(i);
				testcase(i);
				Result(i);
			}
		
		}
		
	
		//String directory = "D:\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", directory);
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com/");
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
