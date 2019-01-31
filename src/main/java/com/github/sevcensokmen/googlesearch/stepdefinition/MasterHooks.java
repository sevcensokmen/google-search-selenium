package com.github.sevcensokmen.googlesearch.stepdefinition;

import com.github.sevcensokmen.googlesearch.util.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
		driver = getDriver();
	}

	@After
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}