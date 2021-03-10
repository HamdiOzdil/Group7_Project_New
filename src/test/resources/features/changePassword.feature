

@changePassword
Feature: Verifying user succesfully changes Password

  Scenario: User should be able to change password

    When Logs with valid credentials "posmanager6@info.com" "posmanager"
    And  user navigates to "Preferences page"
    Then user should be able to change password