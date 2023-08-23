package testRunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions
(features = ".//Features/Login.feature",
 glue ="stepDefinitions",
 dryRun =false,
 monochrome =true,
 tags= "@Positive",
 plugin = {"pretty", "html:output.html"} 
)
public class TestRunner extends AbstractTestNGCucumberTests{
//	@Override 
//	@DataProvider(parallel = true)
}
