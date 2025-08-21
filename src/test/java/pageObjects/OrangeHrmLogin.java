package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.WebdriverCons;

public class OrangeHrmLogin extends WebdriverCons
{
	WebDriver driver;
	
	public OrangeHrmLogin(WebDriver driver)
	{
		super(driver);
	}
		
	@FindBy(xpath="//input[@placeholder='Username']") WebElement var_txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement var_txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement var_bt_login;
	
	public void setupUsername(String user) 
	{
		var_txt_username.sendKeys("Admin");
				
	}
	
	public void setupPassword(String pass)
	{
		var_txt_password.sendKeys("admin123");
	}
	
	public void clickSubmit(String submit)
	{
		var_bt_login.click();
	}
		

}

