Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    
Background:
  Given I have logged in supercasino on Mozilla
 
  
  @Deposit
 Scenario Outline: Deposit
  When I click "Depositbutton"
 		And I input "AmtDeposit" as "<amount>"
 		And I enter "Cvv" as "<CvvNumber>"
 		And I click "Deposit"
 Then deposit text should be displyed
 
 Examples:
   |amount	|CvvNumber	|
   |  2			| 123				|
   | 10000	|	123				|
   |  10		| 		 			|
   |	0			| 123				|
   |	10		|	123				|
 
    