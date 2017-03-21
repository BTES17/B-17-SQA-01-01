
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


import com.google.common.base.Function;

public class LocatorIdentifier {
	/*-- WebDriver is an interface that contain the 
	 * declaration of all the methods to
	 *  operate the browser. 
	 */
	public static void testcase_DataDriven() throws IOException{
		String path= "C:\\Documents and Settings\\install\\Desktop\\Sample.xls";
		 Hls_Reader object=new Hls_Reader(path);
		 String sheetname= object.getSheetName();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 int row_count=object.getRowCount(sheetname);
		 int i;
		 for(i=2;i<=row_count;i++)
		 {
			 open_fb();
			 String Username=object.getCellData(sheetname, 1, i);
			 String Password=object.getCellData(sheetname, 2, i);
			 String expected_title= object.getCellData(sheetname,3,i);
			 String tetscase_ID= object.getCellData(sheetname,0,i);
			 System.out.println(Username+"  "+Password+"   " +expected_title);
			 String actual_title=testscript_datadriven(Username, Password, expected_title);
		       
			 if( actual_title.equals(expected_title))
		       {
		      	 System.out.println("Test case is Failed");
		       }
		       else{
		      	 System.out.println("Test case is Passed");
		       }
		 }
		 	 
	}
	
	static String testscript_datadriven(String Username, String Password, String expected_title)
	{
		WebElement element_email= driver.findElement(By.id("email"));
        element_email.sendKeys(Username);
        WebElement element_pass= driver.findElement(By.id("pass"));
        element_pass.sendKeys(Password);
       WebElement element_login= driver.findElement(By.id("u_0_q"));
       element_login.click();
       
       String actual_title= driver.getTitle();
       return expected_title;
	}
   	

	static WebDriver driver;
	static void setup()
	{
		
		/*--------System is a class has a property object to define
		 *  the configuration of the working environment. It can 
		 * store the info of the current user, file path name and 
		 * current Java runtime version. 
		 * The User. directory means the current working directory.
		 *  */
		String directory= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
	       
        System.setProperty("webdriver.chrome.driver", directory);
       
	}
	static void open_fb()
	{
		 /*--- which means that the object (driver) is of type
		  *  WebDriver but points to 
		  * the memory allocation tall data and methods
		  *  in ChromeDriver
		  */
		 driver = new ChromeDriver();
		 
		 /*----the get method of the chrome driver class will help
		  * to get the passed URL on the chrome browser
		  * -*/
	     driver.get("http://facebook.com/");
	}
	static void  Testcase1()
	{
		
		WebElement element_email= driver.findElement(By.id("email"));
        element_email.sendKeys("ABC");
        WebElement element_pass= driver.findElement(By.id("pass"));
        element_pass.sendKeys("ABC");
       WebElement element_login= driver.findElement(By.id("u_0_q"));
       element_login.click();
       
       String actual_title= driver.getTitle();
       String expected_title= "Home";
       
     //  WebElement myDynamicElement = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='content1']/div/div[3]/img")));
       
 /* if( actual_title.equals(expected_title))
     {
    	 System.out.println("Test case is Failed");
     }
     else{
    	 System.out.println("Test case is Passed");
     }*/
       
       
     /*  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//  
      
       
       WebElement alt1= driver.findElement(By.cssSelector("div[class='_4rbf _53ij']"));
      String  actual_errormsg=alt1.getText();
      String expected_errormessage= "The email address or phone number that you've entered doesn't match any account.";
      
       if (actual_errormsg.contains(expected_errormessage))
       {
           System.out.println(" Test case is passed");
         
       }
       else{
      	 System.out.println("Test case is failed");
       }*/
       
       WebElement fluent_elemnt=fluent();
       String  actual_errormsg=fluent_elemnt.getText();
       System.out.println(actual_errormsg);
      
	}
	
private static WebElement fluent() {
    	
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(100, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

    return wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver webDriver) {
     return driver.findElement(By.cssSelector("div[class='_4rbf _53ij']"));
            }
        }); 
    }
 static void ID ()
 {
	 /*-- Webelement is an interface that contain the 
		 * declaration of all the methods to
		 *interact with the elements of the webpage
		 * on the browser. 
		 * 
		 * chromeDriver class override the methods of the
		 *  WebElement Interface
		 */
		
		/*-- the By class has  static methods that helps return the 
		 * object of By class type.  The findelement() method of the 
		 * WebDriver class help to find the webelemnt of object type By
		 * on the webpage and return the copy of that element in a return type 
		 * WebElement.
		 * 
		 */
	 WebElement element_email= driver.findElement(By.id("email"));
	 /*-- sendkeys and other methhods of Webelement Interface 
	  * send the input to the element.
	  */
     element_email.sendKeys("ABC");
 }
 static void name ()
 {
	 WebElement element_email= driver.findElement(By.name("email"));
     element_email.sendKeys("ABC");
 }
 static void XPATH ()
 {
	 WebElement element_email= driver.findElement(By.xpath(".//input[@id='email']"));
     element_email.sendKeys("ABC");
 }
 static void CSSSelector ()
 {
	 WebElement element_email= driver.findElement(By.cssSelector("inputtext"));
     element_email.sendKeys("ABC");
 }
 static void Classname ()
 {
List<WebElement> elements= driver.findElements(By.tagName("label"));
for(WebElement e: elements)
{
	//System.out.println(e.getText());
	//System.out.println(elements.indexOf(e));
}
String abc=driver.findElements(By.tagName("label")).get(0).getText();
System.out.println(abc);
 }
 static void link ()
 {
	 WebElement element_email= driver.findElement(By.linkText("Forgotten account?"));
     element_email.click();
	 
 }
 static void partialink ()
 {
	 WebElement element_email= driver.findElement(By.partialLinkText("Forgo"));
     element_email.click();
 }
 static void tagname ()
 {
	 WebElement element_email= driver.findElements(By.tagName("input")).get(1);
     element_email.sendKeys("ABC");
 }
	public static void main(String[] args) throws IOException {
		
		setup();
		open_fb();
		 testcase_DataDriven();
       
        
        
        
        
        
      
	}

}
