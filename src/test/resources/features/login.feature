
@login
Feature: User should be able to login
  Scenario Outline: Login with valid credentials
    When Logs with valid credentials "<Username>" "<Password>"
    Then User should be able to see main page

Examples:
| Username                        |Password          |
| posmanager10@info.com           | posmanager       |
| salesmanager16@info.com         | salesmanager     |
