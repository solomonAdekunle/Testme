Feature: ChatBox
        user should be able to chat with customer support
        when having an issue by clicking the chat box 
        and sending the message to the customer support.

  #Background:
  # Given  I navigate to "siteName" on "<browser>"
  @ChatBox
  Scenario Outline: ChatBox
    Given I navigate to "siteName" on "<browser>"
    When I click on Home"Chatlink"
    And  I enter "chatTextBox" as "<Msg>"
    And I click on "chatSextButton"
    Then Message should be "<ExpectedResult>"

    Examples: 
      | browser | Msg   | ExpectedResult |
      | Mozilla | Hello | Sucessfully    |
