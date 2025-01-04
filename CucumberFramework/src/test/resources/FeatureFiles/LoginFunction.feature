@LoginFuntion
Feature: This is the login feature of OrangeHRM
Scenario: Test the login functionality
Given user is on login page
When user enters the valid username and password
And click on login button
Then user should be navigated to Dashboad