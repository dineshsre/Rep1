package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageLocators;

public class GoogleSearchPageLocatorsTest {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		googleSearchPageObjectTest();
	}

	public static void googleSearchPageObjectTest() throws InterruptedException {
		driver = new ChromeDriver();

		GoogleSearchPageLocators GoogleSearchPageLocatorsObj = new GoogleSearchPageLocators(driver);
		driver.get("https://www.google.com");
		GoogleSearchPageLocatorsObj.setTextBoxSearch("BJP INDIA");
		Thread.sleep(3000);
		GoogleSearchPageLocatorsObj.clickTextBoxSearchButton();
		driver.close();
		driver.quit();

	}

}
