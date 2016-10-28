Feature: FooterLinks
        User should be able to navigate to each of the link within the footer
        on the Home page or any other page on the site

  @FooterLinks
  Scenario Outline: FooterLinks
    Given I navigate to "siteName" on "<browser>"
    And I click on "<footerlinks>"
    Then "<VerificationObject>" element should be present

    Examples: 
      | browser | footerlinks    | VerificationObject |
      | Mozilla | TV_Presenter   | Presenter          |
      | Mozilla | Video          | AllVideoTab        |
      | Mozilla | vip            | VIPLogo            |
      | Mozilla | Winners        | winners            |
      | Mozilla | GettingStarted | gettingstarted     |
