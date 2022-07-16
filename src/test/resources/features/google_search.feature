@smoke
  Feature: Google Search Functionality Title Verification
    User Story: As a user, When I am on the google search page
    I should be able search whatever I want and see relevant information


    Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple – Google Search is in the google title

    @googleSearch
    Scenario: Search functionality result title verification
      Given User is on Google search page
      When User types "apple" in the google search box and clicks enter
      Then User sees "apple - Google Search" is in the google title




