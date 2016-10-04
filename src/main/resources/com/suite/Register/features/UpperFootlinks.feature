Feature: UpperFooterlinks
        User should be able to navigate to all the uppper links within
        the footer to read all the information on each page
        
        
    @UpperFooterlinks
 Scenario Outline: FooterLinks
  Given I navigate to "siteName" on "<browser>"
	And I click on "<footerlinks>"
	Then "<VerificationObject>" element should be present
Examples:
 |	browser			|	footerlinks					|	VerificationObject				|
 |   Mozilla    |   aboutus					  |  	AboutSuper			  			|
 |   Mozilla 	  |   contact-us 				|   ContactUs		  					|
 | 	Mozilla			|		Help&Faq					|		FAQ											|
 |	Mozilla			|		PivacyPolicy			|  PrivacyPolicy						|
 |	Mozilla			|	ResponsibleGambling	| RespGambling							|
 | Mozilla			| Term								| TermCondition							|