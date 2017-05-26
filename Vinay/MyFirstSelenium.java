package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {
	public static void main (String args[]){
	String url=System.getProperty("user.dir")+"\\src\\chromedriver.exe";
	 
	System.setProperty("webdriver.chrome.driver",url);
	System.out.println(System.getProperty("webdriver.chrome.driver"));
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
			Un_element.sendKeys("admin");  
			WebElement Pw_element=driver.findElement(By.name("pass"));
     Pw_element.sendKeys("admin");
     WebElement Login=driver.findElement(By.id("u_0_q"));
     Login.click();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
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
	
	}}
