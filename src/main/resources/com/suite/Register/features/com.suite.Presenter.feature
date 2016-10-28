Feature: PrsenterPage
  User should be able to navigate to Presnters page by clicking
   on each presenter image .

  @PresenterPage
  Scenario Outline: PresenterPage
    Given I navigate to "siteName" on "<browser>"
    When I click on "TV_Presenter"
    And I click on each of morelink
    Then TitlePage should equal each PresenterTitle

    Examples: 
      | browser |
      | Mozilla |
