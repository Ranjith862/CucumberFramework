@DataTableWithoutHeader
Feature: Data Table Without Header
Scenario: Test the login functionality
Given You are on the login page
When You enter the below credentials 
|Admin|admin123|
And click on the login button
Then you should navigated to Dashboad