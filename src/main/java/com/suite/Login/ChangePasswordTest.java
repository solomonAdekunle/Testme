package com.suite.Login;

import org.junit.Assert;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePasswordTest {
	
	WebConnector selenium =WebConnector.getInstance();
	
/**
 *  Move to Account menu
 * */
	
@When("^I move to \"([^\"]*)\"$")
public void i_move_to(String object) throws Throwable {
	selenium.MoveToAccount(object);
    
}

@Then("^Passowrd should be Reset \"([^\"]*)\"$")
public void passowrd_should_be_Reset(String ExpectedResult) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("PasswordSuccess_Message - "+ ExpectedResult);
	boolean result=selenium.isElementPresent("PasswordSuccess_Message");
	String actualResult=null;
	
	if(result)
		actualResult="SuccessFully";
	else
		actualResult="failure";
	
	Assert.assertEquals(ExpectedResult, actualResult);
     selenium.Closebrowser();
}

}
