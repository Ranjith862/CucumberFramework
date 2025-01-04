@DataTablesAndExamples
Feature: DataTables and Examples
Scenario Outline: Test the login functionality with Examples
Given User enters in loginPage
When User enters valid credentials "<UserName>" and "<Password>"
And User clicks on the login btn 
Examples:
|UserName|Password|
|Admin   |admin123|
|invalid |admin123|