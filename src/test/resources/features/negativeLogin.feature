@login
Feature: Negative login functionality

  Scenario: Users should not be able to login with wrong credentials
    When user input login with wrong credentials
    Then Wrong login or password should be seen

  Scenario: Users should not be able to login with blank credentials
    When user input login with blank credentials
    Then Please fill out this field should be seen