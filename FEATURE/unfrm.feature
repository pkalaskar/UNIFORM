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
#
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
#	I want to use this template for my feature file
#
#@tag1
#Scenario: Title of your scenario
#Given I want to write a step with precondition
#	And some other precondition
#When I complete action
#	And some other action
#	And yet another action
#Then I validate the outcomes
#	And check more outcomes
#
#@tag2
#Scenario Outline: Title of your scenario outline
#Given I want to write a step with <name>
#When I check for the <value> in step
#Then I verify the <status> in step
#
#Examples:
    #| name  |value | status |
    #| name1 |  5   | success|
    #| name2 |  7   | Fail   |
   #
Feature: Login to uniformm1

Scenario: Test login with valid data for admin
Given ChromeBrowser is launched for admin
When Admin enters valid details and click on login btn
Then Dashboard is displayed and Verify admin




Scenario:  login with valid data
Given ChromeBrowser is launched for user
When user enters valid details and click on login btn
And  user click change password and password changed
Then verify msg for success

Scenario:  login with valid data
Given ChromeBrowser is launched for user
When user enters valid details and click on login btn
And  user click change password and enter mismatchpassword details
Then verify msg for error


  
 #@SmokeTest
#Scenario: login with valid data
#Given ChromeBrowser is launched for user
#And  user enters valid details and click on login btn
#When user clk on uniform store and add the item in the shopping cart
#Then msg is dislayed for add and verify msg

@Verify
Scenario: login with valid data
Given ChromeBrowser is launched for user
And  user enters valid details and click on login btn
When user clk on cart icon and delete the item
Then msg is dislayed for deletion and verify msg

