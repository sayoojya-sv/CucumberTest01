

Feature: Login functionality of Sauce demo

Scenario: Login using correct username and password
  Given The website is loaded
  When user types username and password
  And clicks on login button
  Then Page redirects to homepage

