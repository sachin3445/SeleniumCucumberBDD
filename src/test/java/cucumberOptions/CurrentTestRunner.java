package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
		(
				features=".\\src\\test\\java\\features\\addToCartProduct.feature",
				glue="stepDefinitions",
				//dryRun=true,
				monochrome=true
		)


public class CurrentTestRunner extends AbstractTestNGCucumberTests
{
	
}
