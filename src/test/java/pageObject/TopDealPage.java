package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealPage 
{
	WebDriver driver;
	public TopDealPage (WebDriver driver)
		{
			this.driver=driver;
		}

	
	By search=By.xpath("//input[@type='search']");
	By productname=By.xpath("//tbody/tr[1]/td[1]");
		
	public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() 
	{
		return driver.findElement(productname).getText();
	}
	
}
