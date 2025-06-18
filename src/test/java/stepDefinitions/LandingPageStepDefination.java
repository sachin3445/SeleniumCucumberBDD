package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.LandingPage;
import pageObject.PageObjectManager;
import utilities.TestContextSearch;

public class LandingPageStepDefination 
{
	public WebDriver driver;
	public String product;
	public String dealproduct;
	TestContextSearch testContextSearch;
	PageObjectManager pageObjectManager;
	LandingPage landingPage;
    
	
	public LandingPageStepDefination(TestContextSearch testContextSearch)
	{
		this.testContextSearch=testContextSearch;
		this.landingPage=testContextSearch.pageObjectManager.getLandingPage();
	}
	
	@Given("User landing on the product search page")
	public void user_landing_on_the_product_search_page() 
	{
 		Assert.assertTrue(landingPage.getPageTitle().contains("GreenKart"));
	}
	
	@When("^User search the product using (.+) short name$")
	public void user_search_the_product_using_short_name(String productname) throws InterruptedException 
	{
		
		landingPage.searchProduct(productname);
	    Thread.sleep(3000);
	    landingPage.getSearchProduct();
	    testContextSearch.product=landingPage.getProductName().split("-")[0].trim();
	    System.out.println("Search product name: "+testContextSearch.product);
	}
	@Then("^User add (.+) number of quantity and add product in cart$")
	public void User_add_qty_number_of_quantity_and_add_product_in_cart(String qty)
	{
		landingPage.incrementQty(Integer.parseInt(qty));
		landingPage.addToCart();
	}
}
