Feature: To fetch all clubs
##SportsClubControllerGetRequest1
Scenario: User want to perform get action
Given  User want to perform get action using API 
When Api url "http://localhost:8080/sportsclubs"
Then user want to validate that the status line is "HTTP/1.1 200 "
And Validate that Content-Type is "application/json"
