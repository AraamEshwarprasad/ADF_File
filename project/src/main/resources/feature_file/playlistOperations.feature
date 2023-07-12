Feature: playlist_operations

Scenario: verify validate display of user created playlist displayed on dashboard

Given I am at the audiodigest home page to login as prerequsite

And I click on playlist tab and validate

And I click on create playlist

Then I validate the playlistpop is displayed

And I enter playlist name 

And I click on create button

And I navigate to library tab and add course to playlist

And I navigate to dasboard page and validate playlist

Then I logout user


   
   
    
Scenario: verify validate playall functionality when palylist lecture is archived

Given I am at the audiodigest home page to login as prerequsite
 
And I click on playlist tab and validate

And I click on create playlist

And I enter the name of the playlist and click on create

And I click on library tab and add two lecture to the newly created playlist

And navigate back to playlist tab

And I click on play all icon of newly created playlist and validate




