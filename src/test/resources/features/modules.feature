Feature: User should be able to login

  @modules
  Scenario Outline: Different users access to all modules
    Given  Logs with valid credentials "<Username>" "<Password>"
    Then User should see following options "<modules>"

    Examples:
      | Username              | modules         | Password         |
      | posmanager10@info.com | Discuss         | posmanager       |

