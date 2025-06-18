package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage{ 
	public WebDriver driver;
			public LandingPage(WebDriver driver)
			{
				this.driver=driver;
			}
			
	By search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	By topDealpage=By.linkText("Top Deals");
	By increment=By.cssSelector("a.increment");
	By addTocart =By.cssSelector(".product-action Button");
	
public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}

public void getSearchProduct()
	{
		driver.findElement(search).getText();
	}
public String getProductName()
	{
		return driver.findElement(productname).getText();
	}
public void topDealPage()
	{
		driver.findElement(topDealpage).click();
	}
public String getPageTitle()
	{
		return driver.getTitle();
	}
public void incrementQty(int qty) 
	{
		for(int i=1; i<=qty; i++)
		{
			driver.findElement(increment).click();
			i++;
		}
	}
public void addToCart()
	{
		driver.findElement(addTocart).click();
	}
}