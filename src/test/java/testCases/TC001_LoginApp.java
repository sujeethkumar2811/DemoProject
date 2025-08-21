package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC001_LoginApp extends BaseClass
{
	public Properties p;
	@Test
	void login() throws IOException
	{
		
	logger.info("**** TC001_LoginApp started *****");	
	WebElement txtusername= driver.findElement(By.xpath("//input[@placeholder='Username']"));
    txtusername.sendKeys("Admin");
    logger.info("Entered username");	
    WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));		
	password.sendKeys("admin123");
	logger.info("Entered password");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String exp_val ="OrangeHRM";
    String title = driver.getTitle();
    System.out.println(title);
   
    //Hard assertions
    Assert.assertEquals(exp_val, title);
    logger.info("validation passed");
    logger.info("TC001_LoginApp pass");
	}

}
