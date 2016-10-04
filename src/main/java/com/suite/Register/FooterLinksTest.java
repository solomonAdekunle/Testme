package com.suite.Register;

import java.util.List;

import org.junit.Assert;

import com.WebConnector.WebConnector;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class FooterLinksTest {

	WebConnector selenium = WebConnector.getInstance();

	/**
	 * Checking if all the links within the footer are clickable and verifying
	 * if they navigated to the right pages
	 * 
	 * 
	 */

	@Then("^\"([^\"]*)\" element should be present$")
	public void element_should_be_present(String object) throws Throwable {
		System.out.println("Element_Should_Be_Present  " + object);
		Assert.assertTrue("Object not found " + object, selenium.isElementPresent(object));
	}

}
