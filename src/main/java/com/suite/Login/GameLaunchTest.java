package com.suite.Login;

import com.WebConnector.TestUti;
import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GameLaunchTest {
	
	WebConnector selenium =WebConnector.getInstance();
	
	
	@When("^I click on RouletteExpressPremiumPlayForReal$")
	public void i_click_on_RouletteExpressPremiumPlayForReal() throws Throwable {
	   	   TestUti.gameLunchTest();
	}

	@Then("^Game should launch$")
	public void game_should_launch() throws Throwable {
	    
	}

}
