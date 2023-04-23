Feature: Retail Application Account Feature

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'olesia.mazitova@tekschool.us' and password 'Dream!2022'
And User click on login button
Then User should be logged in into Account

Scenario: Verify User can update Profile Information 
When User click on Account option 
And User update Name ‘John’ and Phone ‘8034156000’
And User click on Update button 
Then user profile information should be updated 

