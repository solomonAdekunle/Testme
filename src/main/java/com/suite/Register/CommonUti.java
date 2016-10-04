package com.suite.Register;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonUti {
	

WebConnector selenium =WebConnector.getInstance();
	
	
@Given("^I navigate to \"([^\"]*)\" on \"([^\"]*)\"$")
public void i_navigate_to_on_Mozilla(String siteName,String browser) throws Throwable {
		// check if logged in the browser.. if not.. login
	System.out.println("I navigate to "+ siteName +" on  "+ browser);
			selenium.openBrowser(browser);
			selenium.navigate(siteName);

}
@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
public void i_enter_as(String object, String text) throws Throwable {
	    System.out.println("Entering "+object+ "valueas +-------+--------+" +  text);
	  selenium.type(text, object);
}
@And("^I click on \"([^\"]*)\"$")
public void i_click_on(String object) throws Throwable {
	System.out.println(" I am clicking on"+ object);
		selenium.click(object);
	
}
}
