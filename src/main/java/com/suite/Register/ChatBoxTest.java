package com.suite.Register;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChatBoxTest {

	
	WebConnector selenium =WebConnector.getInstance();
	
	/**
	 * Checking if ChatbOt is clickable to 
	 * launch a chat and veriyingg if user can send 
	 * a text
	 * 
	 * 
	 */
	
	@When("^I click on Home\"([^\"]*)\"$")
	public void i_click_on_Home(String object) throws Throwable {
	    selenium.click(object);
	    Thread.sleep(2000);
	    selenium.switchToTab();
		  
	    
	}
	
	    
	    
	
	@Then("^Message should be \"([^\"]*)\"$")
	public void message_should_be(String ExpectedResult) throws Throwable {
		System.out.println("Hello- "+ ExpectedResult);
		Thread.sleep(200);
		boolean result=selenium.isElementPresent("ChatTextMsg");
		String actualResult=null;
		
		if(result)
			actualResult="Sucessfully";
		else
			actualResult="failure";
		
		Assert.assertEquals(ExpectedResult, actualResult);
	    
	}
}
