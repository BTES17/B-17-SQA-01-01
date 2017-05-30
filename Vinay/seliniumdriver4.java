package Selenium;

import POI.Hls_Reader;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class seliniumdriver4 {
	
	
		static Hls_Reader obj1= new Hls_Reader("C:\\Documents and Settings\\install\\Desktop\\vinay.xls");
	   static WebDriver driver;
		
		static void setup(int testcase)
	  {
		  if (obj1.getCellData("Sheet1", "Browser", testcase).equals("Mozilla Firefox"))
		  {
			  String url="C:\\Documents and Settings\\install\\Desktop\\geckodriver.exe"; 
				System.setProperty("webdriver.gecko.driver",url);
				driver=new FirefoxDriver();
		  }
		  else if (obj1.getCellData("Sheet1", "Browser", testcase).equals("Google Chrome"))
		  {
		  String url=System.getProperty("user.dir")+"\\src\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",url);
			driver=new ChromeDriver();
			}
			
				driver.get("https://www.facebook.com");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	  }
	static	void testcase(int testcase)
		{
			WebElement UN_element=driver.findElement(By.id("email"));
			String UN= obj1.getCellData("Sheet1","User_Name",testcase);
			UN_element.sendKeys(UN);
			WebElement Pw_element=driver.findElement(By.id("pass"));
			String PW= obj1.getCellData("Sheet1","Paasword",testcase);
			Pw_element.sendKeys(PW);  
			
			WebElement Login=driver.findElement(By.id("u_0_q"));
		

			Login.click();
		}
		static void result(int testcase)
		{
			String expected_result= obj1.getCellData("Sheet1","Expected Result",2);
			WebElement e= (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
			String Actual_Result= driver.getCurrentUrl();
			
	if(expected_result.equals(Actual_Result))
	{
		 obj1.setCellData("Sheet1","Actual Result",testcase,"Pass");
	}
	else
	{
		obj1.setCellData("Sheet1","Actual Result",testcase,"Fail");
	}
	driver.close();
	}

	public static void main(String[] args) {
	
		int numberoftestcases=obj1.getRowCount("Sheet1");
		System.out.println(numberoftestcases);
		for (int i=2;i<=numberoftestcases;i++)
		{
			if (obj1.getCellData("Sheet1", "Status", i).equals("on")){
				setup(i);
				testcase(i);
				result(i);
			}
		}


	}

}
