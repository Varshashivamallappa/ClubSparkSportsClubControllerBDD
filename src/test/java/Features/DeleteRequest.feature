Feature: To Delete a club by its name
##SportsClubControllerDeleteRequest
Scenario: To perform delete action 
When Delete Api url "http://localhost:8080/sportsclubs/BelagamClub62"
Then To validate that the status code is 200
