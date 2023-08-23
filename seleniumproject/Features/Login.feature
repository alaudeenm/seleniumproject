@Login
Feature: Login to Nop Commerce application
  I want to use this template for my feature file

  @Negative
  Scenario Outline: Login to the NopCommerce application
    Given user launch the Chrome browser
    And user open the URL "<URL>"
    And user enters "<UserName>" and password "<Password>"
    Then user clicks on login button		
    Then user clicks on logout button    


  Examples: 
      | URL  | UserName | Password  |
      | https://admin-demo.nopcommerce.com/login |     admin@yourstore.com | admins |
      
  @Positive
  Scenario Outline: Login to the NopCommerce application
    Given user launch the Chrome browser
    And user open the URL "<URL>"
    And user enters "<UserName>" and password "<Password>"
    Then user clicks on login button		
    Then user clicks on logout button


  Examples: 
      | URL  | UserName | Password  |
      | https://admin-demo.nopcommerce.com/login |     admin@yourstore.com | admin |
      

