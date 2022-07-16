@smoke
  Feature: User should be able to login with correct credentials

    Background:
      Given user is on web table login page

    Scenario: Web table login scenario

      When user enters username "Test"
      And user enters password "Tester"
      And user clicks login button
      Then user should see url contains orders


      Scenario: positive login scenario

        When user enters username "Test", password "Tester" and login
        Then user should see url contains orders


        Scenario: map data table practice
          When user enters below credentials
          |username| Test  |
          |password| Tester|

