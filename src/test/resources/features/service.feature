Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on loginpage
    When user enters name and password
    Then success message is displayed