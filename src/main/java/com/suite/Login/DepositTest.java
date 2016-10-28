package com.suite.Login;

import org.junit.Ignore;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.WebConnector.WebConnector;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositTest {
	WebConnector selenium = WebConnector.getInstance();

	/**
	 * Entering the amount user want to input
	 * 
	 * @param{string} Object- is Amount Deposit text box in the cashier
	 * @param{text} text- is the amount enter into the Amount deposit text box
	 */
	@When("^I input \"([^\"]*)\" as (\\d+)$")
	public void i_input_as(String object, String text) throws Throwable {
		selenium.switchframe();
		System.out.println("Entering " + object + "valueas +-------+--------+" + text);
		selenium.type(text, object);
	}

	/**
	 * Verifying if credit card use to deposit is approved
	 * 
	 * @param{string} object- card approval pop-up text
	 */
	@Then("^deposit text should be displyed$")
	public void deposit_text_should_be_displyed(String object) throws Throwable {
		String Text = selenium.getText("Cashier_CreditcardApprovedMessage");
		Thread.sleep(200);
		if (Text.equals(
				"Your credit card deposit has been approved and will be charged as NetPlayTV Grp.Thank you and good luck!")) {
			System.out.println(Text);
		} else {
			System.out.println(Text + "--------" + "user unable to register invalid card");

		}
		selenium.logOut(object);
	}

}
