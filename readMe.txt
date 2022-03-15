Selenium Test

Added all the required dependencies in pom.xml

Created a base class for initializing driver.
Created a package for pageObjects and a class inside it named as MainPage.
Created all the elements/locators of MainPage there.

Added chromedriver.exe under resources package for testing the framework on chrome.
Created a TestRunner file under src/test/java/chromeOptions package.
Created 3 feature files under src/test/java/features.

For the login feature added scenario outline.
Tested following scenarios:-

Blank username and pswd
Empty Password
Invalid username and password
Invalid password, password less than 8 characters
Invalid pswd, Pswd not having any letters

Created a stepDefinition and mapped all the scenarios with the methods defined in stepDefinition.