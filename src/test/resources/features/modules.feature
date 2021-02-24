  @login
  Feature: User should be able to login
  Scenario Outline: Login with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user navigates to "<module>"
    Then the title contains "<title>"





    Examples:
      | userType      | module          | title               |
      | posmanager    | Discuss         | Odoo       |
      | posmanager    | Calendar     | Meetings |


