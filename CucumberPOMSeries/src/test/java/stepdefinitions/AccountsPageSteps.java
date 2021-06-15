package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountsPage;
	 
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		List<Map<String,String>> credlist = credTable.asMaps();
		String username = credlist.get(0).get("username");
		String password = credlist.get(0).get("password");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountsPage=loginPage.getLogon(username,password);

	}
	
	@Given("user is on the accounts page")
	public void user_is_on_the_accounts_page() {
		accountsPage.getAccountsPageTitle();
		//System.out.println("Accounts Page Title : "+accountsPageTitle);
	}
	
	@Then("user gets account section")
	public void user_gets_account_section(DataTable sectionsTable) {
		List<String> expectedSectionList = sectionsTable.asList();
		System.out.println("Accounts Expected List : "  + expectedSectionList);
		
		List<String> actualSectionList = accountsPage.getAccountsSectionsList();
		System.out.println("Accounts Actual List : "  + actualSectionList);
		
		Assert.assertTrue(expectedSectionList.containsAll(actualSectionList));
	}

	@Then("accounts section count must be {int}")
	public void accounts_section_count_must_be(Integer expectedCount) {
		
		Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedCount);

	}
}
