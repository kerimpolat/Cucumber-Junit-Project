@Regression

Feature: Library app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts
  and dashboard should be displayed

  Accounts are: librarian, student, admin

  #Background is similar to TestNG @BeforeMethod. Background is running before each scenario
  Background: For each scenario user is on the library login page
    Given user is on the library login page

@Librarian @employee
  Scenario: Login as librarian
   # Given User is on the library login page
    When user enter librarian user name
    And user enter librarian password
    Then user should see dashboard

@Student
    Scenario: Login as  student
     # Given User is on the library login page
      When user enter student user name
      And user enter student password
      Then user should see dashboard
  @Admin
  Scenario: Login as Admin
   # Given User is on the library login page
    When user enter admin user name
    And user enter admin password
    Then user should see dashboard

