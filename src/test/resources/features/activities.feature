
@activities
Feature: User should be able to login
  Scenario: Login with valid credentials
    Given User in the login page
    When Logs with valid credentials "salesmanager16@info.com" "salesmanager"
    Then User should be able to see activities hover over