@createProject
Feature: Creating Project with Simple Information
  Story: As a POS Manager I should be able to create new project with only Project Name information

  Scenario: Users should be able to create a new project with simple information
    When Logs with valid credentials "posmanager11@info.com" "posmanager"
    And the user navigates to "Project"
    Then the user should be able to create a new project
