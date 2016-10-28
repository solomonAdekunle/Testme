package com.suite.Login;

import com.WebConnector.TestUti;
import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VegasGamesTest {
	
	WebConnector selenium= WebConnector.getInstance();
	
	
	@When("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String arg1) throws Throwable {
	   Thread.sleep(1000);
	   TestUti.PlaytechVegas();
	}

	
	@Then("^SecondGame should launch$")
	public void secondgame_should_launch() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
