package FirstTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class FirstTest {

	
	WebDriver driver;
@BeforeTest
public void SetUp()
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\general\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.gmail.com");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.manage().window().
}
	
	@Test(priority = 3)
  public void VerifyGmailPage() {

		 
		 String VerifyPage = "Gmail";
		 Assert.assertEquals(driver.getTitle(), VerifyPage);
		// Assert.assertNotEquals(driver.getTitle(), VerifyPage);
		 
		 //System.out.println(driver.getTitle());
		// driver.close();
  }
	
    @AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
    }
   
  @Test(priority = 2)
  public void a_test()
  {
	Assert.assertTrue(true);
  }
  
  @Test(priority = 1)
  public void b_test()
  {
	  Assert.assertTrue(true);
  }
  
  
}
