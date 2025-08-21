package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hooks.BeforeAfter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	WebDriver driver;


	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	    
		driver.findElement(By.name("password")).sendKeys("admin123");		
		System.out.println("Login creds are entered...");
	}

	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	Boolean ds = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	System.out.println("Dashboard header is visible...");
	driver.quit();
	}

}
