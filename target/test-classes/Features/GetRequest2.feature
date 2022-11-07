Feature: To fetch particular club details
##SportsClubControllerGetRequest2
Scenario: User want to perform get action
Given  User want to perform get action to fetch a particular club by name using API 
When API url "http://localhost:8080/sportsclubs/name/Belagavi_Club"
Then To validate that the status line is "HTTP/1.1 200 "
And To validate that Content-Type is "application/json"
