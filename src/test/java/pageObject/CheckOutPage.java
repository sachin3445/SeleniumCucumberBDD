package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage{ 
	public WebDriver driver;
			public CheckOutPage(WebDriver driver)
			{
				this.driver=driver;
			}
			
	By cartbag=By.xpath("//img[@alt='Cart']");
	By proccedtocheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobutn=By.cssSelector(".promoBtn");	
	By placeOrderBtn=By.xpath("//button[contains(text(),'Place Order')]");
	By checkoutproducts=By.cssSelector(".product-name");
	
public void checkoutItems()
	{
		driver.findElement(cartbag).click();
		driver.findElement(proccedtocheckout).click();
	}

public Boolean verifypromoBtn()
	{
		return driver.findElement(promobutn).isDisplayed();
	}

public Boolean verifyplaceorderBtn()
	{
		return driver.findElement(placeOrderBtn).isDisplayed();
	}
public String getcheckoutproducts()
	{
		return driver.findElement(checkoutproducts).getText();
	}

}