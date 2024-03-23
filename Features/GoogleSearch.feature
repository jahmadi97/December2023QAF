Feature: google Search

Scenario Outline: perform a google job search 

Given I am on Google homepage 
When I enter the search "<terms>" 
And I click Search button 
Then I recieve the result 

Examples: 
|terms								 |
|Quality Assurance Jobs|
|Software Testing Jobs |
