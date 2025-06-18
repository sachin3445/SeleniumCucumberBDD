package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.CheckOutPage;
import utilities.TestContextSearch;

public class CheckOutStepDefinations {
	String productname;
	public WebDriver driver;
	public String product;
	public String dealproduct;
	TestContextSearch testContextSearch; 
	public CheckOutPage checkOutPage;
	String checkOutProduct;
	
	public CheckOutStepDefinations(TestContextSearch testContextSearch)
	{
		this.testContextSearch=testContextSearch;
		this.checkOutPage=testContextSearch.pageObjectManager.getCheckOutPage();
	}
	
	@Then("^User procced to check out page and validate the (.+) checkout page$")
	public void user_procced_to_check_out_page_and_validate(String productname) throws InterruptedException 
	{
		
		checkOutPage.checkoutItems();
		checkOutProduct=checkOutPage.getcheckoutproducts().split("-")[0].trim();
		System.out.println("This is Check Out Page Product: "+checkOutProduct);
		Assert.assertEquals(checkOutProduct, testContextSearch.product);
		System.out.println("Search product and Check out page product match...!");
		
	}
	
	@Then("User ability to enter promocode and place order")
	public void user_ability_to_enter_promocode_and_place_order() 
	{
		Assert.assertTrue(checkOutPage.verifypromoBtn());
		Assert.assertTrue(checkOutPage.verifyplaceorderBtn());
	}
	
}
