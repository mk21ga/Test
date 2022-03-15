@RecordOfTeams
Feature: Record of teams playing

Scenario: Output all team names with a match today
Given Initialize the browser
When User navigates to "https://www.bbc.co.uk/sport/football/scores-fixtures"
Then He should get all the day's matches and teams
And A output message if there are no matches
And Close browser