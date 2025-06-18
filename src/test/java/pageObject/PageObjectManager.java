package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public LandingPage landingPage;
	public TopDealPage topDealPage;
	public CheckOutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() 
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public TopDealPage getTopDealPage()
	{
		topDealPage=new TopDealPage(driver);
		return topDealPage;
	}
	
	public CheckOutPage getCheckOutPage()
	{
		checkoutPage=new CheckOutPage(driver);
		return checkoutPage;
	}

}
