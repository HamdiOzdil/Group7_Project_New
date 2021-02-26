@basePage @conversations
Feature: Conversations Functionality
  Agile Story: As a user I should be able to see Conversations link on the top menu
  Description: The purpose of this feature is to test the Conversations link functionality on the top menu

  Scenario: Users should be able to see Conversations link on the top menu
    When Logs with valid credentials "posmanager10@info.com" "posmanager"
    Then the user should be able to see Conversations link on the top menu