Feature: Negative login functionality
  Scenario: Users should not be able to login with wrong credentials
    Given user is on login page
    When user input login with wrong credentials
    Then Wrong login/password should be seen