package org.cucumber.stepdefinition;

public class stepdefintion {
	@Given("^browser launch$")
	public void browser_launch() throws Throwable {
		System.setProperty("webdriver.chrome.driver","")
		
	}

	@When("^get the url$")
	public void get_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^get the user name$")
	public void get_the_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^get the password$")
	public void get_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click the signin$")
	public void click_the_signin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify recover my account$")
	public void verify_recover_my_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
