Feature: login functionality 

Scenario: verify validate user is able to view personal information

Given I am at the audiodigest home page to login as prerequsite

And I click the Hi button on the top right side of the screen

And I click the workprofile in the drop down

And verify the fields displayed

Then I logout user



Scenario: verify validate retail user is able to update the personal information

Given I am at the audiodigest home page to login as prerequsite

And I click the drop down button on the top right side of the screen

And I click the workprofile in the drop down

And I change all the workprofile information details

And I click on save button and validate all information

Then I logout user