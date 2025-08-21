package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass 
{
    public WebDriver driver;
    
    public Logger logger;
    public Properties p;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
   public void setup(String br) throws IOException 
    {
    	switch(br)
    	{
    	case "chrome" : driver = new ChromeDriver();
    	break;
    	case "edge" : driver = new EdgeDriver();
    	break;    	
    	default : System.out.println("Invalid browser");
		}
    	
    	logger = LogManager.getLogger(this.getClass());
        
    	FileReader file = new FileReader("./src//test//resources//config.properties");
    	p = new Properties();
    	p.load(file);
    	
    	driver.get(p.getProperty("appURL"));      //using config.properties file
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
   public void teardown() {
        driver.quit();
    }
}
