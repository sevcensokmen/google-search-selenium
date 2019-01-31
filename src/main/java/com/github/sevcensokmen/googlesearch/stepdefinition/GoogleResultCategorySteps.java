package com.github.sevcensokmen.googlesearch.stepdefinition;

import com.github.sevcensokmen.googlesearch.util.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GoogleResultCategorySteps extends DriverFactory {

	@Given("^User navigates \"([^\"]*)\" website$")
	public void user_navigates_website(String url) throws Throwable {
		googlePage.getGooglePage(url);
	}

	@Given("^User enters \"([^\"]*)\" searchvalue$")
	public void user_enters_searchvalue(String searchText) throws Throwable {
		googlePage.enterSearchValue(searchText);
	}

	@When("^User enters search button$")
	public void user_enters_search_button() throws Throwable {
		googlePage.clickEnterButton();

	}

	@Then("^Searchresult list is represented on the screen and visit result search category\\.$")
	public void searchresult_list_is_represented_on_the_screen_and_visit_result_search_category() throws Throwable {
		googlePage.getResultCategory();
	}

}
