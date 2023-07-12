Feature: library 

Scenario: verify and validate navigation of courses under my library section

Given I am at the audiodigest home page to login as prerequsite

And validate courses under my library section

And click on play icon of any course

And click on hi and click on logout
 
 
 
Scenario: verify and validate sort by credits option in my library page

Given I am at the audiodigest home page to login as prerequsite

And click on my library

And I select credits option

And verify sort by option as credits and select speciality from specialty dropdown

Then I logout user
