@wip
Feature: Vvytrack cars page functionality verification

  User story :
  As a user when I am on Vytrack => Fleet => Vehicles,
  I should be able to see Export Grid dropdown, Refresh, Reset and
  Grid Settings Buttons


    Background:
    Given user is on the Cars page

    Scenario: User should be able to click Export Grid  button

      When user clicks Export Grid button
      Then user should see Export Grid dropdown popup


    Scenario: User should be able to click refresh button

      When user clicks refresh button
      Then page should be refresh

      Scenario: User sees Export Grid dropdown on the left side of the page

        Then user sees the Export Grid dropdown on the left side of the page

      Scenario: User sees Refresh Button on the left side of the Reset button

        Then User should be able to see Refresh Button on the left side of the Reset button

      Scenario: User sees Grid setting button on the right side of the reset button

        Then User should see Grid Settings on the right side of the Reset button

