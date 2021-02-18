@negativeLogin
Feature: Negative login functionality
  Scenario: Users should not be able to login with wrong credentials
    Given User in the login page
    When user input login with wrong credentials
    Then Wrong login or password should be seen