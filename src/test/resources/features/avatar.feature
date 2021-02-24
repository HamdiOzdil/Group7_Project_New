@basepage @avatar
Feature: User should be able to login

  Background:
    When Logs with valid credentials

  Scenario: Login with valid credentials
    Then User should be able to see their avatars