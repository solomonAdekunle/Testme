package com.suite.Register;

import org.openqa.selenium.By;

import com.WebConnector.TestUti;
import com.WebConnector.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PromotionPageTest {

	WebConnector selenium = WebConnector.getInstance();

	@When("^I click on each \"([^\"]*)\"$")
	public void i_click_on_each(String Object) throws Throwable {
		Thread.sleep(2000);
		 TestUti.PromoBanner();
		// System.out.println(" I am clicking on"+ Object);
		selenium.click(Object);
		//TestUti.PromoBanner();
	}

	@Then("^TitlePage should equal each promotionTitle$")
	public void titlepage_should_equal_each_promotionTitle() throws Throwable {
		// System.out.println(" I am checking on titlePage on"+ Object +
		// Object1);
		// TestUti.PromoBanner();
		
		
		
		
		}

	}


