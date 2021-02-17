package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class GoogleSearchPageTestTestNG {
	
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
		
	}
	
	public static void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		GoogleSearchPage.textSearch(driver).sendKeys("PM of India");
		Thread.sleep(2000);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
	
		Thread.sleep(3010);
		
		driver.close();
		driver.quit();
	

	}

}
