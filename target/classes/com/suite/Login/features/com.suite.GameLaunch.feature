Feature: GameLaunch
        User should be able to click any games on the homepage after
        Logining in wtih valid credential and the game should lunch
        
      Background:
  						Given I have logged in supercasino on Mozilla
  						
  	@GameLaunch
  	Scenario: GameLaunch
  	When I click on RouletteExpressPremiumPlayForReal
  	Then Game should launch