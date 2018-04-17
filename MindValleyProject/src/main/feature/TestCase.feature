#Author: sumit.bera@live.in


Feature: To Test the car selection and capture app crash
 
Scenario: Scenario to verify my name after car selection
Given the user is on the home screen
And user taps on Chrome icon
When user enters their own name
And selects their favourite car
And tap on send me your name
Then your name and car is displayed


Scenario: Scenario to verify expections and logs
Given the user is on the home screen
When the user enters name in text field
And click display text view
And it should display visual message 
When click on throw unhandled exception
Then verify the app crashes

