@LoginNegative
Feature: Verify all negative scenarios for login

Scenario: Verify if blank username and password works
Given Initialize the browser
When User navigates to "https://www.bbc.co.uk/sport/football/scores-fixtures"
And Click on Sign In button
And Click on Sign In button in the page
Then User should get error msg as "Sorry, those details don't match. Check you've typed them correctly."
And Close browser

Scenario Outline: Verify if invalid username and password works
Given Initialize the browser
When User navigates to "https://www.bbc.co.uk/sport/football/scores-fixtures"
And Click on Sign In button
And Enter <username> and  <password>
And Click on Sign In button in the page
Then User should get error msg as <error_message>
And Close browser

Examples:
	|username|password|error_message|
	|"mkg@ghoo.com"|""|"Something's missing. Please check and try again."|
	|"mkg@ghoo.com"|"ytrew3467"|"Sorry, we can’t find an account with that username. If you're over 13, try your email address instead or get help here."|
	|"mkg@ghoo.com"|"4321789065"|"Sorry, that password isn't valid. Please include a letter."|
	|"mkg@ghoo.com"|"tyre56d"|"Sorry, that password is too short. It needs to be eight characters or more."|