package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSearch 
{
	public WebDriver driver;
	public String product;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSearch() throws IOException
	{
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManage());
		genericUtils=new GenericUtils(testBase.WebDriverManage());
	}
	
	 
}
