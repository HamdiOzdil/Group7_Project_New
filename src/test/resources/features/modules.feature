
Feature: User should be able to login

  @modules
  Scenario Outline: Different users access to all modules
    Given User logged in as "<usertype>"
    Then User should see following options "<tab>"

    Examples:
      | usertype          | tab             |
      | posmanager        | Discuss         |
      | posmanager        | Calendar        |
      | posmanager        | Notes           |
      | posmanager        | Contacts        |
      | posmanager        | CRM             |
      | posmanager        | Sales           |
      | posmanager        | Website         |
      | posmanager        | Point of Sale   |
      | posmanager        | Purchases       |
      | posmanager        | Inventory       |
      | posmanager        | Manufacturing   |
      | posmanager        | Repairs         |
      | posmanager        | Project         |
      | posmanager        | Events          |
      | posmanager        | Surveys         |
      | posmanager        | Employees       |
      | posmanager        | Attendances     |
      | posmanager        | Leaves          |
      | posmanager        | Expenses        |
      | posmanager        | Maintenance     |
      | posmanager        | Fleet           |
      | posmanager        | Dashboards      |
      | salesmanager      | Discuss         |
      | salesmanager      | Calendar        |
      | salesmanager      | Notes           |
      | salesmanager      | Contacts        |
      | salesmanager      | CRM             |
      | salesmanager      | Sales           |
      | salesmanager      | Website         |
      | salesmanager      | Point of Sale   |
      | salesmanager      | Purchases       |
      | salesmanager      | Inventory       |
      | salesmanager      | Repairs         |
      | salesmanager      | Invoicing       |
      | salesmanager      | Email Marketing |
      | salesmanager      | Events          |
      | salesmanager      | Employees       |
      | salesmanager      | Repairs         |
      | salesmanager      | Leaves          |
      | posmanager        | Expenses        |
      | posmanager        | Maintenance     |
      | posmanager        | Dashboards      |
      | inventorymanager  | Discuss         |
      | inventorymanager  | Calendar        |
      | inventorymanager  | Notes           |
      | inventorymanager  | Contacts        |
      | inventorymanager  | Website         |
      | inventorymanager  | Inventory       |
      | inventorymanager  | Manufacturing   |
      | inventorymanager  | Repairs         |
      | inventorymanager  | Invoicing       |
      | inventorymanager  | Timesheets      |
      | inventorymanager  | Employees       |
      | inventorymanager  | Leaves          |
      | inventorymanager  | Expenses        |
      | inventorymanager  | Lunch           |
      | inventorymanager  | Maintenance     |
      | inventorymanager  | Dashboards      |
      | expensesmanager   | Discuss         |
      | expensesmanager   | Calendar        |
      | expensesmanager   | Notes           |
      | expensesmanager   | Contacts        |
      | expensesmanager   | Website         |
      | expensesmanager   | Events          |
      | expensesmanager   | Employees       |
      | expensesmanager   | Leaves          |
      | expensesmanager   | Expenses        |
      | expensesmanager   | Lunch           |
      | expensesmanager   | Maintenance     |
      | expensesmanager   | Dashboards      |
      | manufacturinguser | Discuss         |
      | manufacturinguser | Calendar        |
      | manufacturinguser | Notes           |
      | manufacturinguser | Contacts        |
      | manufacturinguser | Website         |
      | manufacturinguser | Manufacturing   |
      | manufacturinguser | Events          |
      | manufacturinguser | Employees       |
      | manufacturinguser | Leaves          |
      | manufacturinguser | Expenses        |
      | manufacturinguser | Maintenance     |
      | manufacturinguser | Dashboards      |
