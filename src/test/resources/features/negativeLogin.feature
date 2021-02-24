Feature: Negative login functionality

  Scenario: Users should not be able to login with wrong credentials
    Given User in the login page
    When user input login with wrong credentials
    Then Wrong login or password should be seen


  Scenario: Users should not be able to login with blank credentials
    Given User in the login page
    When user input login with blank credentials
    Then Please fill out this field should be seen
  @wip
  Scenario Outline: Users should not be able to login with wrong credentials
    Given User in the login page
    When user input login with wrong credentials "<username>" "<password>"
    Then user should see wrong "<message>"
    Examples:
      | username              | password      | message              |
      | wrongUsername         | posmanager    | Wrong login/password |
      | posmanager10@info.com | wrongPassword | Wrong login/password |

    Scenario Outline: Users should not be able to login with blank credentials
      Given User in the login page
      When user input login with blank credentials "<username>" "<password>"
      Then user should see blank "<message>"
      Examples:
        | username              | password      | message                     |
        | blank                 | posmanager    | Please fill out this field. |
        | posmanager16@info.com | blank         | Please fill out this field. |
