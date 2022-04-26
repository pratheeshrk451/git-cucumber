Feature: Check the fb new account open functions
Scenario: user open the new fb account with fake credindialS

Given user launch the browser and get url
And user click the createNewAccount button
When User enters the first name & sure name
And User enter the email and password
And user giver DOB and gender
And user Click the signUp button
Then EntersecurityCode page is launched

