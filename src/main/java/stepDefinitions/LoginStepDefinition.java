package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    System.out.println("step1: user already on login pages");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		System.out.println("step2: check title of login page");
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    System.out.println("step3: username and password");
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	  System.out.println("step4: click the login button");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.out.println("step5: check if we are in home page");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("step6:close the browser");

	}
	
}
