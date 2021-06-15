package stepdefinitions;

//import static org.testng.Assert.assertTrue;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;  
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String pageTitle ;
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		pageTitle = loginPage.getLoginPageTitle();
	    System.out.println("Title of Page :" + pageTitle);
	}

	@Then("title of page is {string}")
	public void title_of_page_is(String expectedTitleName) {
	    Assert.assertTrue(pageTitle.contains(expectedTitleName));
	}

	@Then("forget your password link is displayed")
	public void forget_your_password_link_is_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    loginPage.enterUserName(username);
	}

	@When("user enters userpassword {string}")
	public void user_enters_userpassword(String userpwd) {
	    loginPage.enterUserPwd(userpwd);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		loginPage.clickOnLogon();
	}

	/*@Then("user get the title of the Accounts page")
	public void user_get_the_title_of_the_page() {
	    
	}*/


}
