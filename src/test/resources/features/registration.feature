Feature: Registration

  Scenario: user registration in izyAcademic and create category
  Given user is in registration page
    When user enters valid registration data
    Then user should be redirected to the main page
    And  user should be able to create a new category for a course
