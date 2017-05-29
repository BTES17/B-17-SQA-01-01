package selenium;
import POI.Hls_Reader;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstselenium {
	
		static Hls_Reader obj1=new Hls_Reader("C:\\Documents and Settings\\install\\Desktop\\seleniumfirst.xls");
	
	public static void main(String[] args) {
		
		

			
			String url="C:\\Documents and Settings\\install\\Desktop\\chromedriver.exe";
			 
			System.setProperty("webdriver.chrome.driver",url);
			//System.out.println(System.getProperty("webdriver.chrome.driver"));
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//driver.get("https://172.16.0.42/placementcell/admin/");
			String title=driver.getTitle();
			System.out.println(title);
			//String pagesource=driver.getPageSource();
			//System.out.println(pagesource);
			//driver.close();
			//driver.quit();
			WebElement Un_element=driver.findElement(By.id("email"));
			String UN=obj1.getCellData("Sheet1","User_name",2);
					Un_element.sendKeys(UN); 
					
					 
					WebElement Pw_element=driver.findElement(By.name("pass"));
					String PS=obj1.getCellData("Sheet1","Password",2);
		     Pw_element.sendKeys(PS);
		     
		     WebElement Login=driver.findElement(By.id("u_0_q"));
		     Login.click();
		     
		 	String ER=obj1.getCellData("Sheet1","Expected_result",2);
		 	WebElement e=(new WebDriverWait(driver,30)).until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
		 	String AR=driver.getCurrentUrl();
		 	if(ER.equals(AR))
		 	{
		 		obj1.setCellData("Sheet1", "Actual Result",2,"Pass");
		 	}
		 	else
		 	{
		 		obj1.setCellData("Sheet1", "Actual Result",2,"Fail");
		 	}
		 	driver.close();
		 	
		 	
		  
		    //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   /* try 
		     {
		    Thread.sleep(4000);			
		     }
		    		catch(Exception n)
		    		{
		    		System.out.println(n);
		    	}*/
		     System.out.println("endleep");
		     WebElement o=driver.findElement(By.linkText("Games"));
		     o.click();
		     
		     
		            
		    /* try 
		     {
		    	Thread.sleep(4000);
		     }
		    		catch(Exception n)
		    		{
		    		System.out.println(n);
		    	}*/
		    // System.out.println("endleep");
		    	
		     
		     
		    // Navigation obj=driver.navigate();
		   //  driver.navigate().back();
		   //  driver.navigate().forward();
		  //   driver.navigate().refresh();
		   //  driver.navigate().to("https://www.google.com/");
			
			}
	}

