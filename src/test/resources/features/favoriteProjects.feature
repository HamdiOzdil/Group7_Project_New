@favoriteProjects
Feature: To see only my favorite projects on the Dashboard Page
  Story: As a POS Manager I should be able to see only my favorite projects on the Dashboard Page by using
  My Favorite search functionality of the Project Module

  Scenario: Users should be able to see only my favorite projects on the Dashboard Page
    When Logs with valid credentials "posmanager16@info.com" "posmanager"
    And the user navigates to "Project"
    And click to advance search icon
    And click on filters button
    And User clicks on favorites button
    Then User should be able to see Favorite Projects
    And Verify all visible projects are favorite