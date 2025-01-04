@DataTableWithHeader
Feature: DataTable With Header
Scenario: Test the login functionality with header
Given Im in login page
When I enter below credentials
|Username|Password|
|Admin   |admin123|
And I click on login button
Then I will see the Dashboad