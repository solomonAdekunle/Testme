Feature: PromotionPage
  User should be able to navigate to promotion page 
  and click or the promotion banners to look att the promotions availabe on the site.
  
  #Background:
       
      
    @PromotionBanners
  Scenario Outline: PromotionPage
   Given I navigate to "siteName" on "<browser>"
   When I click on "PromotionTab"
     And I click on each "InfoButton"
    Then TitlePage should equal each promotionTitle
    
    Examples:
    |browser |
    |Mozilla |