package ranag;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniu {
	
		public static void main(String[] args) {
				// TODO Auto-generated method stub

			

			String url=System.getProperty("user.dir")+"\\src\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",url);
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			//driver.get("https://www.gmail.com");
			String title=driver.getTitle();
			//System.out.println(title);
			WebElement UN_element=login.txtbx_UserName(driver);
			UN_element.sendKeys("admin");
			WebElement PW_element=login.txtbx_Password(driver);
			PW_element.sendKeys("admin");
			//TimeUnit seconds =TimeUnit.SECONDS;
			
			 //driver.manage().timeouts().implicitlyWait(10,seconds);
			//try{
			//Thread.sleep(500);
		//}
		//catch(Exception e){
			//System.out.println(e);
		//}
			WebElement Login=driver.findElement(By.id("u_0_q"));
			Login.click();
		//WebDriverWait wait=new WebDriverWait(driver,30);
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
			
			//driver.navigate().back();
	//WebElement S=driver.findElement(By.linkText("Games"));
	//S.click();
	//List<WebElement> list =driver.findElements(By.partialLinkText("Policy"));
	//System.out.println(list.size());
	//list.get(2).click();
	 
			
		//	List<WebElement> list =driver.findElements(By.className("inputText"));
		 
	 
			//String pagesource=driver.getPageSource();
			//System.out.println(pagesource);
			//driver.close();
			//driver.quit();
				//driver.navigate().back();
	//System.out.println("clickback");
	//driver.navigate().forward();
	//driver.navigate().to("https://www.gmail.com/");		
	
		}
}


