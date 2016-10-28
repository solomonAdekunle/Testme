Feature: Vegas Games
        User should be able to lunch any Games in the Vegas Home page when the they logged in and 
        navigate to the website.

  Background: 
    Given I have logged in supercasino on Mozilla

  @VegasGames
  Scenario Outline: Vegas Games launch
    When I click on "VegasTab"
    And I click on "<GamesCategory>"
    And I click on the "SecondGame"
    Then SecondGame should launch

    Examples: 
      | GamesCategory |
      | Slot          |
