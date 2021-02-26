
@activities
Feature: Able to see activities
  Scenario: Verify users able to see activities
    When Logs with valid credentials "salesmanager16@info.com" "salesmanager"
    Then User should be able to see activities hover over