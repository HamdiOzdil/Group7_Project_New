
@Modules
Feature: Modules Names
Agile Story: As a user I should be able to see all modules which I have right to access on the top menu
Description: The purpose of this feature is to test if users can see all modules they are supposed to see

  Scenario Outline: Users should be able to see all modules which they have right to access with "<userType>"
    Given the user logged in as "<userType>"
    When the user should be able to see following modules
      | <Module1>  |
      | <Module2>  |
      | <Module3>  |
      | <Module4>  |
      | <Module5>  |
      | <Module6>  |
      | <Module7>  |
      | <Module8>  |
      | <Module9>  |
      | <Module10> |
      | <Module11> |
      | <Module12> |
      | <Module13> |
      | <Module14> |
      | <Module15> |
      | <Module16> |
      | <Module17> |
      | <Module18> |
      | <Module19> |
      | <Module20> |
      | <Module21> |
      | <Module22> |
    Examples:
      | userType           | Module1 | Module2  | Module3 | Module4  | Module5 | Module6       | Module7   | Module8       | Module9   | Module10    | Module11      | Module12   | Module13        | Module14 | Module15  | Module16  | Module17    | Module18    | Module19   | Module20    | Module21 | Module22   |
      | pos manager        | Discuss | Calendar | Notes   | Contacts | CRM     | Sales         | Website   | Point of Sale | Purchases | Inventory   | Manufacturing | Repairs    | Project         | Events   | Surveys   | Employees | Attendances | Leaves      | Expenses   | Maintenance | Fleet    | Dashboards |
      | sales manager      | Discuss | Calendar | Notes   | Contacts | CRM     | Sales         | Website   | Point of Sale | Purchases | Inventory   | Repairs       | Invoicing  | Email Marketing | Events   | Employees | Leaves    | Expenses    | Maintenance | Dashboards | -           | -        | -          |
      | expenses manager   | Discuss | Calendar | Notes   | Contacts | Website | Events        | Employees | Leaves        | Expenses  | Lunch       | Maintenance   | Dashboards | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |
      | inventory manager  | Discuss | Calendar | Notes   | Contacts | Website | Manufacturing | Employees | Leaves        | Expenses  | Maintenance | Dashboards    | -          | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |
      | manufacturing user | Discuss | Calendar | Notes   | Contacts | Website | Events        | Employees | Leaves        | Expenses  | Maintenance | Dashboards    | -          | -               | -        | -         | -         | -           | -           | -          | -           | -        | -          |
