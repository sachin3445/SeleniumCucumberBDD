package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.TestContextSearch;

public class Hooks 
{
	TestContextSearch testContextSearch;
	
	public Hooks(TestContextSearch testContextSearch)
	{
		this.testContextSearch=testContextSearch;
	}
	
	@After
	public void AfterSenarios() throws IOException
	{
		testContextSearch.testBase.WebDriverManage().quit();
	}
	
	@AfterStep
	public void AddScreenShots(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSearch.testBase.WebDriverManage();
		if(scenario.isFailed())
		{
		File sourceFile	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte [] filecontent=FileUtils.readFileToByteArray(sourceFile);
		scenario.attach(filecontent, "image/png", "image");
		}
	}
}
