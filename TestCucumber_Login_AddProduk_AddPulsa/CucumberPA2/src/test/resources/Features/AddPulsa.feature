Feature: feature to test AddPulsa functionality

  Scenario: AddPulsa is succesful with valid credentials
    Given browser is open
    And user is on login page
    When user enters email and password
    And user click button login
   	Then user confirm notification
   	When user click menu pulsa
   	And user click button add pulsa
   	When user provider
   	And user nominal dan harga
   	And user click button save changes
   
   
#Scenario: AddProduk is succesful with valid credentials
    #Given browser is open
    #And user is on login page
    #When user enters email and password
    #And user click button login
   #	Then user confirm notification
   #	When user click menu produk
   #	And user click button add produk
   #	And user nama produk kemudian SKU lalu deskripsi lalu harga dan kuantitas
   #	And user click button save changes
   
   
#Scenario: AddPulsa is succesful with valid credentials
    #Given browser is open
    #And user is on login page
#		When I enter valid username and valid password
    #Then I can login successfully
   	