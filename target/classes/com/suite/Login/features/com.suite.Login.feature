Feature: Login
          I want to login in other in other to see my balance
          Background:
#Given I am logged in salesforce in Mozilla
  @Login        
 Scenario Outline: Login
Given  I navigate to "siteName" on "<browser>"
 And I enter "Logusername" as "solomon2014"
 And I enter "Logpassword" as "London01"
 And I click "LoginButton"
 Then <VerificationObject>should be present
 #Then  "<VerificationObject>"should be present
 
 Examples:
    | browser	|VerificationObject																			|
    | Mozilla	|"Depositbutton", "usernameInfo", "BalInfo", "Account"	|
   						
  