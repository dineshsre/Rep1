package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class GoogleSearchPageTest2 {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public static void GoogleSearchcopy() throws InterruptedException {

		GoogleSearchPage.textSearch(driver).sendKeys("Pappu of India");
		Thread.sleep(1000);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);

		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
	}

}
