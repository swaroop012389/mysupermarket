package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(className="Email  Input")
      private WebElement username;
	
	@FindBy(className="PasswordLogin  Input")
	  private WebElement password;
	
	@FindBy(id="SignInButton")
	  private WebElement loginButton;
	
	public void enterUsername()
	{
		username.sendKeys("swaroop012389@gmail.com");
	}
	
	public void enterPassword()
	{
		password.sendKeys("23May1989");
	}
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	
}
