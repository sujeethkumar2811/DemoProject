#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: feature to test login functionality
@smoketest
Scenario: login to check user

Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to homepage	


@smoketest
  Scenario: Failed login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message should be displayed				

