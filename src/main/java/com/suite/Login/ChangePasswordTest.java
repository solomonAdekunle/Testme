package com.suite.Login;

import org.junit.Assert;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePasswordTest {

	WebConnector selenium = WebConnector.getInstance();

	/**
	 * Move to Account menu
	 */
	@When("^I move to \"([^\"]*)\"$")
	public void i_move_to(String object) throws Throwable {
		selenium.MoveToAccount(object);
	}

	/**
	 * verify if user is able to reset his /her password
	 * 
	 * @param {string} ExpectedResulut- is the either successfully or failure
	 */
	@Then("^Passowrd should be Reset \"([^\"]*)\"$")
	public void passowrd_should_be_Reset(String ExpectedResult) throws Throwable {
		System.out.println("PasswordSuccess_Message - " + ExpectedResult);
		boolean result = selenium.isElementPresent("PasswordSuccess_Message");
		String actualResult = null;
		if (result)
			actualResult = "SuccessFully";
		else
			actualResult = "failure";

		Assert.assertEquals(ExpectedResult, actualResult);
		selenium.Closebrowser();
	}

}
