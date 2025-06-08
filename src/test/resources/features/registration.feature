Feature: Registration

  Scenario: user registration in izyAcademic and create category
    Given user is in registration page
    When user enters valid registration data
      | name    | username   | country  | city   | idnumber   | phone      | email                         | password  |
      | Ernesto | Ernesto123 | Colombia | Bogota | 1234567890 | 3659853698 | fodejequacri-1696@yopmail.com | Soporte@1 |
    Then user should be redirected to the main page
    And  user should be able to create a new category for a course
