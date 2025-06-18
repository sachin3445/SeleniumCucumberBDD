package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Stra");
	    Thread.sleep(3000);
	    String product=driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	    System.out.println("Search product name: "+product);
			
	}

		}