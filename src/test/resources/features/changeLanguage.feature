@changeLanguage
Feature: MotorK functionalities

  Scenario: Change language
    When click to language bar
    And select new language
    Then verify language is changed
    @Contacts
    Scenario: Click to Contacts
      Given Click to Contacts
      Then Verify you are in Contacts Page

