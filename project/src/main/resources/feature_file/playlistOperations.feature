Feature: playlist_operations

Scenario: Add playlist name

Given I am at the audiodigest home page to login as prerequsite

And I click on playlist tab and validate

And I click on create playlist

Then I validate the playlistpop is displayed

And I enter playlist name 

And I click on create button

And I navigate to library tab and add course to playlist

And I navigate to dasboard page and validate playlist

Then I logout user

    


