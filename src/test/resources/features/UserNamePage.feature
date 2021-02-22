
@userName

Feature: Users should be able to see their usernames on the top menu
  Scenario: Users should be able to see their usernames on the top menu
    Given User in the login page
    When Logs with valid credentials
    Then User should be able to see username
