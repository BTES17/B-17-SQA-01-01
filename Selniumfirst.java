import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selniumfirst {
	//---- WebDriver ia an interface that conatin the declaraction of all the methods to
	//----- operate the sepecific browser. 
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		//----- System clas will enable to set the wroking directory to the 
		//--- chromedriver.
		
	   String directory= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
        System.out.println(System.getProperty("user.dir"));
        System.out.println(directory);
        System.setProperty("webdriver.chrome.driver", directory);
       
      //----- the object driver will be able to acess all the methods of the class ChromeDriver
      		//
        driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
       String title = driver.getTitle();
       System.out.println(title);
        driver.manage().window().maximize();
       driver.close();
	}

}
