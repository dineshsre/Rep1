package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageLocators {
	WebDriver driver = null;
	By searchBoxLocator = By.name("q");
	By searchButtonLocator = By.name("btnK");

	public GoogleSearchPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public void setTextBoxSearch(String searchText) {
		driver.findElement(searchBoxLocator).sendKeys(searchText);

	}

	public void clickTextBoxSearchButton() {
		driver.findElement(searchButtonLocator).sendKeys(Keys.RETURN);

	}

}
