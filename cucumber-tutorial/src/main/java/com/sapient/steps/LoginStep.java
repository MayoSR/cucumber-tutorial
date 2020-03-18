package com.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^the application is working$")
	public void the_application_is_working() throws Throwable {
		System.out.println("Application is working >>>>>>>>>>>>");
	}

	@When("^the credentials are valid$")
	public void the_credentials_are_valid() throws Throwable {
		System.out.println("Credentials are valid >>>>>>>>>>>>");
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("Take user to home page >>>>>>>>>>>>");
	}

}
