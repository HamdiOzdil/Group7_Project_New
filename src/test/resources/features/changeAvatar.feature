@changeAvatar
Feature: Change avatar
  Agile story: As a user I should be able to change my avatar from the Preferences page
  Description: The purpose of this feature User can change their avatars from the Preferences page

  Scenario Outline: "<usertype>" can change their avatars from the Preferences page
    Given Logs with valid credentials "<usertype>" "<password>"
    And take the screenshot of "old" avatar
    When "<usertype>" navigates to preferences page
    And change the avatar with new one "newImage"
    And take the screenshot of "new" avatar
    Then verify the avatar has changed

    Examples:
      | usertype                | password     |
      | salesmanager16@info.com | salesmanager |