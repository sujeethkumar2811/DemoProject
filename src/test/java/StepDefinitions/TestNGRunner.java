package StepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features",glue= {"StepDefinitions"},monochrome = false, 
plugin = {"pretty","html:reports/Reports.html","json:reports/Reports.json"}, tags= "@smoketest"
)

public class TestNGRunner extends AbstractTestNGCucumberTests
{

}
