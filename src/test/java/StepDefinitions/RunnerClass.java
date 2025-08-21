package StepDefinitions;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Tags;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"StepDefinitions"	},monochrome = false, 
plugin = {"pretty","html:reports/Reports.html"}, tags= "@smoketest"
)


public class RunnerClass 
{
	

}
