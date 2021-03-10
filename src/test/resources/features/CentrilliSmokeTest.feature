@CEN-209
Feature: 

	#User Story: As a user I should be able to login with valid credentials
	#
	#Acceptance Criteria: Users should be able to login with valid credentials
	@CEN-177
	Scenario Outline: Positive Login Functionality (Aut.)
		      When Logs with valid credentials "<Username>" "<Password>"
		      Then User should be able to see main page
		      Examples:
		        | Username                        |Password          |
		        | posmanager10@info.com           | posmanager       |
		        | salesmanager16@info.com         | salesmanager     |	

	

	@CEN-199
	Scenario: Username Dropdown Links Functionality
		Given Logs with valid credentials "posmanager16@info.com" "posmanager"
		And the user should be able to click on the username dropdown
		Then the user should see following options
		|Documentation      |
		|Support            |
		|Preferences        |
		|My Odoo.com account|
		|Log out            |