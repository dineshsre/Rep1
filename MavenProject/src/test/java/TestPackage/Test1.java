package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		newsign();
		
	}
	
	public static void newsign() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("987897890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("nopassword");
	
		Thread.sleep(4000);
		driver.close();
		driver.quit();
	

	}

}
