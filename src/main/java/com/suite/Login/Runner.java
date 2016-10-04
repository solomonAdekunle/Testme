package com.suite.Login;


	import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.suite.Register.RegisterTest;

import cucumber.api.java.it.Date;
	import cucumber.api.junit.Cucumber;

	// runner class
	

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features="C:\\Maven\\focusSmart\\src\\main\\resources\\com\\suite\\Login\\features\\",
		      tags= {""
		      		 // + "@ForgottenDetails"
		      		//+ "@Deposit,"
		      		//+"@ChangePassword,"
		      		// +"@Searchicon",
		    		+"@Login"}, format={"html:output"})

//@Cucumber.Options(format={"html:output"}
	
	public class Runner {
	
		
		
		
		
	
}
