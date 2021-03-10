@links
Feature: Should be able to see module links

  Scenario Outline: Verify users ability to see module links
    Given Logs with "<userType>"
    When the user navigates to "<module>"
    Then the title contains "<title>"


    Examples:

      | userType   | module        | title         |
      | posmanager | Expenses      | #Inbox - Odoo |
      | posmanager | Maintenance   | #Inbox - Odoo |
      | posmanager | Fleet         | #Inbox - Odoo |
      | posmanager | Dashboards    | #Inbox - Odoo |
      | posmanager | Discuss       | Odoo          |
      | posmanager | Calendar      | Odoo          |
      | posmanager | Notes         | Odoo          |
      | posmanager | Contacts      | Odoo          |
      | posmanager | CRM           | Odoo          |
      | posmanager | Sales         | Odoo          |
      | posmanager | Website       | Odoo          |
      | posmanager | Point of Sale | Odoo          |
      | posmanager | Purchases     | Odoo          |
      | posmanager | Inventory     | Odoo          |
      | posmanager | Manufacturing | Odoo          |
      | posmanager | Repairs       | Odoo          |
      | posmanager | Project       | Odoo          |
      | posmanager | Events        | Odoo          |
      | posmanager | Surveys       | Odoo          |
      | posmanager | Employees     | Odoo          |
      | posmanager | Attendances   | Odoo          |
      | posmanager | Leaves        | Odoo          |




