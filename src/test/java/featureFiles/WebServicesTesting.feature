Feature: This feature file includes all the scenarios to test WebServices

Scenario: To test the response of JSON
Given we have the valid URI connection "/users"
When we hit the URL to get the success response
Then we can observe that correct response is returned
