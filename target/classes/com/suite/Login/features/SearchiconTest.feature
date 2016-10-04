Feature: Searchicon
        User should be able to search for game by typing
        the game in the search field text box and click enter
        the search should populate the game or related game
        
 # Background:
  					 #Given I have logged in supercasino on Mozilla
     
     
        
 @Searchicon
 Scenario Outline:Searchicon
  Given I have logged in supercasino on Mozilla
  When I click on "Gamesearchicon"
 And I enter "Gamesearch" as "<Game>"
 Then "<VerificationObject>" should be displayed
    
    Examples:
   				 |Game 											| VerificationObject |
   				 |Roulette Expresss Premium	|		REPGame					 |