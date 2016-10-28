package com.suite.Register;

import com.WebConnector.TestUti;
import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PresenterPageTest {
	
	
	WebConnector selenium= WebConnector.getInstance();
	
	
	@When("^I click on each of morelink$")
	public void i_click_on_each_of_morelink() throws Throwable {
		Thread.sleep(2000);
	    TestUti.Presenter();
	}
	
	
	
	
	@Then("^TitlePage should equal each PresenterTitle$")
	public void titlepage_should_equal_each_PresenterTitle() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
