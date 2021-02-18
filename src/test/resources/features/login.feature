
@login
  Feature: User should be able to login
    Scenario: Login with valid credentials
      Given User in the login page
      When Logs with valid credentials
      Then User should be able to see main page


    Scenario Outline: Login with valid credentials
      When Logs with valid credentials "<Username>" "<Password>"
      And click on login button
      Then User should be able to see main page

      Examples:
        | Username                        |Password          |
        | posmanager10@info.com           | posmanager       |
        | salesmanager15@info.com         | salesmanager     |
        | imm10@info.com                  | inventorymanager |
        | expensesmanager10@info.com      | expensesmanager  |
        | manuf_user10@info.com           |  manufuser       |



