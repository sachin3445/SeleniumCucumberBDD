package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
		(features="./src/test/java/features",
			glue="stepDefinitions",
			
			monochrome=true,
			//tags="@AddToCart",
			plugin={"pretty", "html:target/cucumber.html"}	
		)

public class TestNgTestRunner extends AbstractTestNGCucumberTests 
{
/*	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
 */
}
