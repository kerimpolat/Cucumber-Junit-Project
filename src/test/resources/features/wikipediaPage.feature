
  Feature: Wikipedia search functionality verification

    Background:
      Given user is on the wikipedia home page
      When user write "Steve Jobs" in the wikipedia search Box
      And user clicks search icon
    @Steve
    Scenario: Wikipedia search functionality result title verification
      Then user sees "Steve Jobs" in the wiki title
    @Jobs
      Scenario: Main header verification
        Then user sees Steve Jobs is in the main header

      Scenario: Image header verification
        Then user sees Steve Jobs is in the image header
