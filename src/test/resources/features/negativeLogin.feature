@login
Feature: Negative login functionality

  Scenario Outline: Users should not be able to login with wrong credentials
    When user input login with wrong credentials "<username>" "<password>"
    Then user should see wrong "<message>"
    Examples:
      | username              | password      | message              |
      | wrongUsername         | posmanager    | Wrong login/password |
      | posmanager10@info.com | wrongPassword | Wrong login/password |

  Scenario Outline: Users should not be able to login with blank credentials
    When user input login with blank credentials "<username>" "<password>"
    Then user should see blank "<message>" "<username>" "<password>"
    Examples:
      | username              | password   | message                     |
      |                       | posmanager | Please fill out this field. |
      | posmanager16@info.com |            | Please fill out this field. |
