@basePage @conversations
Feature: Conversations Functionality
  Agile Story: As a user I should be able to see Conversations link on the top menu
  Description: The purpose of this feature is to test the Conversations link functionality on the top menu

  Scenario: Users should be able to see Conversations link on the top menu
    Then Logs with valid credentials
    Then the user should be able to see Conversations link on the top menu