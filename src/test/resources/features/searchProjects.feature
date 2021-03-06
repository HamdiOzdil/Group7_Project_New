
@SearchProject
Feature: Search Projects
  Agile Story: As a POS Manager I should be able to search projects with project names by using simple search input box
  Description: POS Manager can search projects with project names by using simple search input box
  Scenario: User should be able search projects
    When  Logs with valid credentials "posmanager11@info.com" "posmanager"
    And  navigates to "Project"
    And the user should be able to see initial project list
    And the user should be able to see search
    Then the user should be able to see searched project


