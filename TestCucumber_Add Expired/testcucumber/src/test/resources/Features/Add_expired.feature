Feature: feature to test add Lapangan functionality

  Scenario: Check Lapangan is succesful with valid credentials
    Given browser is open
    And user is on login page
    When user enters email and password
    And user click button login
   	Then user confirm notification
   	When user click menu product
   	And user click Action
   	When user click Expired
   	And user enter the data 
   	And user click button Add product Expired