
@bjk
Feature: Dropdown Menu
Scenario: Users should be able to use all links under the username dropdown
  Given Logs with valid credentials "posmanager16@info.com" "posmanager"
  And the user should be able to click on the username dropdown
  Then the user should see following options

    |Documentation      |
    |Support            |
    |Preferences        |
    |My Odoo.com account|
    |Log out            |