package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	//private By accountSections = By.xpath("//div[@id='center_column']");
	private By accountSections = By.cssSelector("div#center_column span");
	public int getAccountsSectionCount() {
		System.out.println("Actual Count "+ driver.findElements(accountSections).size());
		return driver.findElements(accountSections).size();
	}
	
	//int getAccountsSectionCount = driver.findElements(accountSections).size()-1;
	
	public List<String> getAccountsSectionsList() {
		List<String> accountList = new ArrayList<>(); 
		List<WebElement> accountsHeaderList = driver.findElements(accountSections);
		for(WebElement e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountList.add(text);
			
		}
		return accountList;
			
		}
	}
	


