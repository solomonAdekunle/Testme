Feature: ForgottenDetails
       user should should be able to reset there password 
       when they for it either their usename or password by clicking 
       forgotten details link on the HomePage

  @ForgottenDetails
  Scenario Outline: ForgottenDetails
    Given I navigate to "siteName" on "<browser>"
    #Given  Browser is "<browser>"
    When I click on "forgottenDetailslink"
    And I enter "FDUsername" as "<username>"
    And I enter "FDEmail" as "<Email>"
    And I enter "FDDay" as "<day>"
    And I enter "FDMonth" as "<month>"
    And I enter "FDYear" as "<year>"
    And I click on "FDSubmittButton"
    And I enter "ResetPassword" as "<newpassword>"
    And I enter "ResetConFirmPw" as "<confirmPassword>"
    And I click on "ResetSubmittButton"
    Then I should reset my password "<ExpectedResult>"

    Examples: 
      | browser | username    | Email             | day | month | year | newpassword | confirmPassword | ExpectedResult |
      | Mozilla | solomon2014 | testme@gmail.com  |  10 | Oct   | 1980 | asnanannn   | anananann       | Failure        |
      | Mozilla | Noblebug228 | test@playtech.com |  30 | Oct   | 1980 | Bola123$%^  | Bola123$%^      | SuccessFully   |
