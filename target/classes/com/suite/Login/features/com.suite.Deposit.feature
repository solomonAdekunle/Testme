Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    
Background:
  Given I have logged in supercasino on Mozilla
 
  
  @Deposit
 Scenario: Deposit
  And I click "Depositbutton"
 And I input "AmtDeposit" as "10"
 And I enter "Cvv" as "123"
 And I click "Deposit"
 Then deposit text should be displyed
 
    