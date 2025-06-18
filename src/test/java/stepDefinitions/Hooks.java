package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
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
}
