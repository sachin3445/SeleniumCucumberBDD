package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.PageObjectManager;
import pageObject.TopDealPage;
import utilities.TestContextSearch;

public class TopDealStepDefination 
{
	public WebDriver driver;
	public String dealproduct;
	TestContextSearch testContextSearch;
	PageObjectManager pageObjectManager;
	
	public TopDealStepDefination(TestContextSearch testContextSearch)
	{
		this.testContextSearch=testContextSearch;
	}
		
	@Then("^User search (.+) product short name in offer page$")
	public void user_search_same_product_short_name_in_offer_page(String productname) throws InterruptedException 
	{
		TopDealPage topDeal=testContextSearch.pageObjectManager.getTopDealPage();
		switchToTopDealPage();
		topDeal.searchProduct(productname);
	    Thread.sleep(3000);
	    dealproduct=topDeal.getProductName();
	}
	
	//Separate method for switching new page to achieve reusability
	public void switchToTopDealPage()
	{		
		LandingPage landingPage=testContextSearch.pageObjectManager.getLandingPage();
		landingPage.topDealPage();
		testContextSearch.genericUtils.SwitchToNewWindow();
	    
	}
	
	@Then("Validate landing page product with offer page product")
	public void Validate_landing_page_product_with_offer_page_product()
	{
		Assert.assertEquals(testContextSearch.product, dealproduct);
	}

}
