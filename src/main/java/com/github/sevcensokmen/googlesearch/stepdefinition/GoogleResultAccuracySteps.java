package com.github.sevcensokmen.googlesearch.stepdefinition;

import com.github.sevcensokmen.googlesearch.util.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GoogleResultAccuracySteps extends DriverFactory {

	@Given("^User navigates to the  website$")
	public void user_navigates_to_the_website() throws Throwable {
		googlePage.getGooglePage("http://www.google.com/");
	}

	@Given("^User enters \"([^\"]*)\" search$")
	public void user_enters_search(String arg1) throws Throwable {
		googlePage.enterSearchValue(arg1);

	}

	@When("^User enters searchbutton$")
	public void user_enters_searchbutton() throws Throwable {
		googlePage.clickEnterButton();

	}

	@Then("^Searchresult is compared \"([^\"]*)\"$")
	public void searchresult_is_compared(String arg1) throws Throwable {
		googlePage.getResultAccuracy(arg1);

	}

}
