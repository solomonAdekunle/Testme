package com.suite.Login;

import org.junit.Ignore;

import com.WebConnector.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest {

	WebConnector selenium = WebConnector.getInstance();

	/*
	 * @param{string} object- is SiginButton
	 */
	@And("^I click \"([^\"]*)\"$")
	public void i_click(String object) throws Throwable {
		System.out.println(" I am clicking on" + object);
		selenium.click(object);
	}

	/*
	 * @param {string} object1-4 -are Depositbutton,userinfo,balanceInformation
	 * and AccountMenu Verifying that all these objects are present.
	 * 
	 **/
	@Then("^\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"should be present$")
	public void should_be_present(String object1, String object2, String object3, String object4)
			throws Throwable {
		System.out.println("VerificationObject - " + object1);
		boolean Db1 = selenium.isElementPresent(object1);
		System.out.println("VerificationObject - " + object2);
		boolean Db2 = selenium.isElementPresent(object2);
		System.out.println("VerificationObject - " + object3);
		boolean Db3 = selenium.isElementPresent(object3);
		System.out.println("VerificationObject - " + object4);
		boolean Db4 = selenium.isElementPresent(object4);
		System.out.println(Db1);
		System.out.println(Db2);
		System.out.println(Db3);
		System.out.println(Db4);
		//selenium.logOut(object);

	}

}
