@Avatar
Feature: User should be able to login

  Background:
    Given User in the login page
    When Logs with valid credentials

  Scenario: Login with valid credentials
    Then User should be able to see their avatars