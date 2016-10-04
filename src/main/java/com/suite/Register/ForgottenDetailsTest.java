package com.suite.Register;

import org.junit.Assert;
import org.junit.Ignore;
import org.testng.annotations.AfterMethod;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;

public class ForgottenDetailsTest {
	
	WebConnector selenium =WebConnector.getInstance();
	
	
	/**
	 * Checking if user can click the forgotten Details
	 * And see if user can reset his password by tying correct details
	 * @param ExpectedResult is what am expecting
	 * @throws Throwable
	 */
	@Then("^I should reset my password \"([^\"]*)\"$")
	public void i_should_reset_my_password(String ExpectedResult) throws Throwable {
		System.out.println("Login - "+ ExpectedResult);
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
