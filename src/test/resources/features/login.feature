

@login
Feature: User should be able to login
  Scenario: Login with valid credentials
    Given User in the login page
    When Logs with valid posmanager credentials
    Then User should be able to see main page

  @wip
  Scenario Outline: Login with valid credentials
    Given User in the login page
    When Logs with valid credentials "<Username>" "<Password>"
    Then User should be able to see main page

    Examples:
      | Username                        |Password          |
      | posmanager10@info.com           | posmanager       |
      | salesmanager16@info.com         | salesmanager     |
      | imm10@info.com                  | inventorymanager |
      | expensesmanager10@info.com      | expensesmanager  |
      | manuf_user10@info.com           | manufuser        |

