Feature: ChangePassword
    User should be able to change Password after login 
    by clicking on ChangePassword link within the Accounct Menu
    
Background:
  Given I have logged in supercasino on Mozilla
  #Given I have logged in supercasino on Chrome
  
  @ChangePassword
 Scenario Outline: ChangePassword
 When I move to "AccountMenu"
 And I click on "ChangePasswordlink"
 And I enter "CHOldPs" as "<oldpassword>"
 And I enter "CHNewPs" as "<newPassword>"
 And I enter "CHConfPs" as "<ConfPassword>"
 And I click on "CHSubmitt"
 Then Passowrd should be Reset "<ExpectedResult>"
 
 Examples:
    | oldpassword |newpassword 	| ConfPassword	| ExpeectedResult |
    | london			|  london  		| London				| Failure					|
    | London01		|  London01	  | London01		  |	Failure					|
