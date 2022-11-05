Feature: To add the the sports club details
##SportsClubControllerPostRequest
Scenario: User want to post a request 
Given User want to insert the sports club details
When User want to post the request using API "http://localhost:8080/sportsclubs"
Then Validate that the status line is "HTTP/1.1 200 "

