package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		ExtentTest test = extent.createTest("Google Search Test1","Test For Search Validation");
		
		driver = new ChromeDriver();
		test.log(Status.INFO, "Starting Testcase");
		driver.get("https://www.google.com");
		test.pass("At Google Home Page"); 
		driver.findElement(By.name("q")).sendKeys("India");
		test.pass("Search Test is Entered");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Result are displayed");
		driver.close();
		driver.quit();
		test.pass("Exiting Browser");
		extent.flush();


	}

}
