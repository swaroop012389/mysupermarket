package commonClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;



@Listeners(CustomListener.class)
abstract public class SuperTestScript 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public static void preConfig() throws Exception
     {
		
	//for(int i=1;i<=2;i++)
	//	{
	String browser = ExcelOperation.readData("Sheet1",1,0);
    String url = ExcelOperation.readData("Sheet1",1,1);
	if(browser.equals("FF"))
    {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\Seleniumpractice\\drivers\\geckodriver.exe");		
		driver = new FirefoxDriver();	
		   }
		else if(browser.equals("CH"))
		   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\Seleniumpractice\\drivers\\chromedriver.exe");	
		driver = new ChromeDriver();	
		   }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
       }
    // }
	
	
	@AfterMethod
	public static void postConfig() throws Exception
	{
		driver.close();
	}
	
}