Feature: Delta Air Line Travel info functionality

  Scenario: Delta air line home page Travel info in stay safe link
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on safe travel link
    Then user see delta commitment to cleanliness air plan information
#=========================================================================================
  Scenario: Delta air line home page Travel info Know before you go link

    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Travel planing center link
    And user click on know before you go link
    When user click on Testing Resources link
    Then user see testing resource is display
#====================================================================================
  Scenario: Delta air line home page Travel info for U.S. Entry Requirements
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Travel planing center link
    And user click on know before you go link
    When user click on U.S. Entry Requirements
    Then user see U.S. Entry Requirements resource is display
#======================================================================================

  Scenario: Delta air line home page Travel info for Explore Top Destinations

    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Travel planing center link
    And user click on find your destination link
    And user click on Explore Top Destinations
    And user choose one way radio button
    And user select origin from the dropDown
    And user select Destination from the dropDown
    And user select nationality form the dropDown

    And user select residency form the dropDown
    And user select Vaccination status from the dropDown
    When user click on search button
#    Then user see Explore Top Destinations is display

#=========================================================================================

  Scenario: Delta air line home page Travel info for CHANGE OR CANCEL YOUR TRIP
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Travel planing center link
    And user click on CHANGE OR CANCEL YOUR TRIP link
    And user click on How To Cancel or Change Your Flight link
    When user click on Change or Cancel link
    Then user see Change or Cancel information is display
#==================================================================================================

  Scenario: Delta air line home page Travel info for Rent a car functionality
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on rent a car link
    And user enter pick up location in the location field
    And user choose pick up date from calender
    And user choose drop off date from calender
    And user click on Book A Click
#  ===============================================================================
  Scenario: Delta air line home page Travel info for flight deals
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Flight Deals link
    And user click on FLIGHT DEALS FROM WITHIN THE U.S. link
    When user Choose from dropDown Destination link
    Then user see the Flight Deals From Within The U.S.

#==========================================================================================================
  Scenario: Delta air line home page Travel info for Baggage link

    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on Baggage link
    And user input origin in the text field
    And user enter destination in the text field
    And user choose Main cabin from dropDown
    And user click on select date link
    And user choose a date from calender
    And user select travel date
    And user choose Traveling date
    And user click on calculate estimate button
    Then user see calculate baggage estimate cost is display
#================================================================================================================
  Scenario: Delta air line home page Travel info for shop hotels link
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on shop hotels link
    And user enter Destinations where to go in the text field
    And user enter checkIn Date
    And user enter checkOut Date
    When user click on search button for shop hotel
    Then user see New Mexico United States of America search result display

#===========================================================================================================

  Scenario: Delta air line home page Travel info for airCraft Link
    Given user on Delta Air Line home page
    And user click on Travel info link
    And user click on airCraft link
    And user click on Airbus link
    When user click on Aircraft Specification
    Then user see Aircraft Specifications information is display












