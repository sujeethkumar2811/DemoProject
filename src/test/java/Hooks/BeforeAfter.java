package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfter
{
	WebDriver driver;
	
	@Before
	public void setup() 
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@After
	public void Teardown()
	{
	driver.quit();
	}

}
