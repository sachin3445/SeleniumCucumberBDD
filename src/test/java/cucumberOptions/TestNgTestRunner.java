package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Report types: html, json, Junit, extent
@CucumberOptions
		(features="./src/test/java/features",
			glue="stepDefinitions",
			
			monochrome=true,
			tags="@AddToCart or @SearchProduct",
			plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"rerun:target/Failed_Test.txt"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests 
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
 
}
