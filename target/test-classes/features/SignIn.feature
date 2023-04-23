Feature: Sign In Feature

Scenario: Verify user can sign in into Retail Application
Given User is on retail website
When User click on Sign in option
And User enter email 'olesia.mazitova@tekschool.us' and password 'Dream!2022'
And User click on login button
Then User should be logged in into Account

Scenario: Verify user can create an account into Retail Website
Given User is on retail website
When User click on Sign in option
And User click on Create New Account button
And User fill the signUp information with below data
| name | email | password | confirmPassword |
| olesia | olesia.mazitova@tekschool.us | Dream!2022 | Dream!2022 |
And User click on SignUp button
Then User should be logged into account page