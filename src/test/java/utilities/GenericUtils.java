package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils 
{
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwitchToNewWindow()
	{
		Set <String> windowhandel= driver.getWindowHandles();
	    Iterator<String> windowList = windowhandel.iterator();
	    String parentWindow=windowList.next();
	    String childWindow=windowList.next();
	    driver.switchTo().window(childWindow);
	}
}
