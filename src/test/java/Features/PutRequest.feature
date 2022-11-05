Feature: To Update club details
##SportsClubControllerPutRequest
Scenario: User want to perform updation on the club details
Given User want to update/modify the sports club details
When User want to perform put action using API "http://localhost:8080/sportsclubs"
Then Validate that the status code is 200

