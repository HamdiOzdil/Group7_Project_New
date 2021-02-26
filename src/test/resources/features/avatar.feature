@basepage @avatar
Feature: Able to see avatar on top menu

  Scenario: Login with valid credentials
    When Logs with valid credentials "posmanager10@info.com" "posmanager"
    Then User should be able to see their avatars