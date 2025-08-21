package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebdriverCons 
{
	
	WebDriver driver;
	
	public WebdriverCons(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
