package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement Element = null;

	public static WebElement textSearch(WebDriver driver) {
		Element = driver.findElement(By.name("q"));
		return Element;
	}

	public static WebElement buttonSearch(WebDriver driver) {
		Element = driver.findElement(By.name("btnK"));
		return Element;

	}

}
