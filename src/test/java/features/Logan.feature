Feature: Login into My BT Account

  Scenario: Positive test validating login
  
    Given Initialise the browser with chrome
    And navigate to "BT" Site
    And Clck on Login link in home page to land on Secure sign in Page
    When User enters Username as  "babb175@yahoo.co.uk" and Password as "Whisky888"
    And User clicks Submit tab
    Then User should successfully login
    

    
    
    
    