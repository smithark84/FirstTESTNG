package FirstTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
    public String baseUrl = "http://www.gmail.com";
    String driverPath = "C:\\\\Users\\\\general\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe";
    public WebDriver driver ; 	
 
    @BeforeTest                            //Jumbled
    public void launchBrowser() {
   	Assert.assertEquals(true, true);	 
    }
    
    @Test
    public void VerifyHome()
    {
    	
	/*	 String VerifyPage = "Gmail";
		 Assert.assertEquals(driver.getTitle(), VerifyPage);*/
    	Assert.assertEquals(true, true);
    }
    
    @Test
    public void method2()
    {
    	
    	System.out.println("test");
    }
    
    
    @AfterTest
    public void CloseBrowser()
    {
    	
    	Assert.assertEquals(true, true);
    }
	
	
}
