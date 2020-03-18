package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^the application is working$")
	public void the_application_is_working() throws Throwable {
		System.out.println("Application is working >>>>>>>>>>>>");
	}

	@When("^the credentials are \"([a-zA-Z0-9]{1,})\"$")
	public void the_credentials_are_valid(String validStatus) throws Throwable {
		System.out.println("Credentials are " + validStatus +">>>>>>>>>>>>");
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("Take user to home page >>>>>>>>>>>>");
	}


	@Then("^take user to login page$")
	public void take_user_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println();
	}


}
