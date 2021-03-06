package commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

@Listeners(CustomListener.class)
abstract public class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public static void preConfig() throws Exception
     {
		
	for(int i=1;i<=2;i++)
		{
	String browser = ExcelOperation.readData("data",1,0);
    String url = ExcelOperation.readData("data",1,1);
	if(browser.equals("FF"))
    {
		System.setProperty("webdriver.gecko.driver","C://Users//hp//Desktop//New folder//geckodriver.exe");		
		driver = new FirefoxDriver();	
		   }
		else if(browser.equals("Chrome"))
		   {
		System.setProperty("webdriver.chrome.driver","C://Users//hp//Desktop//New folder//chromedriver.exe");	
		driver = new ChromeDriver();	
		   }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
       }
     }
	
	
	@AfterMethod
	public static void postConfig() throws Exception
	{
		driver.close();
	}
	
}