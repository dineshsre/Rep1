package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver ;
	
	private By email_id = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	//private By forgotPWDLink = By.xpath("//a[contains(text(),'Forgot your password?')]");
	private By forgotPWDLink = By.linkText("Forgot your password?");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUserName(String username) {
		driver.findElement(email_id).sendKeys(username);
	}
	
	public void enterUserPwd(String userpwd) {
		driver.findElement(password).sendKeys(userpwd);
	}
	
	public void clickOnLogon() {
		driver.findElement(signInButton).click();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPWDLink).isDisplayed();
	}
	
	public AccountsPage getLogon(String uname,String upwd) {
		System.out.println("Login with :- "+uname+" password "+upwd);
		driver.findElement(email_id).sendKeys(uname);
		driver.findElement(password).sendKeys(upwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);//returning object of the Accounts Page 	 
	}
	

}
