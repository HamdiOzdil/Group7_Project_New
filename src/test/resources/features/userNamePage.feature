@basepage @userName

Feature: Users should be able to see their usernames on the top menu
  Scenario: Users should be able to see their usernames on the top menu
    When Logs with valid credentials
    Then User should be able to see username
