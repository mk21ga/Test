@AllNewsArticles
Feature: Search all articles related to sports

Scenario: Find all articles related to sports and output first and the last one.
Given Initialize the browser
When User navigates to "https://www.bbc.co.uk/sport/football/scores-fixtures"
And Click on search icon and type sports
Then He gets all articles related to sports
And Outputs first and last heading
And Close browser