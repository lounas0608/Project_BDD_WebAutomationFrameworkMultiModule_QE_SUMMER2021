


Feature: Delta air line booking functionality

  Background:
  Given user on Delta Air Line home page

  Scenario: Delta air line home page Booking one way flight to JFK to Boston functionality
#    Given user on Delta Air Line home page
    And user click on Destination
    And user enter destination airPort name
    And user click on round trip link
    And user choose on one way trip from the dropDown
    And user click on Depart link
    And user choose date from calender
    When user click on red arrow sign on the right side
    Then user see One Way flight JFK to BOS is display
#======================================================================================================================
  Scenario: Delta air line home page Booking Round way flight to JFK to DTW functionality
#    Given user on Delta Air Line home page
    And user click on Destination
    And user enter destination AirPort
    And user click on round trip
    And user click on Depart link
    And user choose Travel date from calender
    And user choose arriving date from calender
    When user click on red arrow sign on the right side
    Then user see One Way flight JFK to DTW is display
#====================================================================================================================
  Scenario: Delta air line home page Booking Multi city way flight functionality
#    Given user on Delta Air Line home page
    And user click on Destination
    And user enter destination AirPort
    And user click on round trip
    And user click on multi city
    And user enter first flight Destination
     |firstFlight|
    |JFK    |
    And user enter second flight Destination
    |secondFlight|
    |BOS         |
    | DTW           |
    And user click on calender and choose first flight date
    And user click on red arrow
#   Then user see multi city fight is display ( can not verify result changes ever time )
#
#===================================================================================================
  Scenario: Delta air line home page check In Link with credit card
#    Given user on Delta Air Line home page
    And user click on Check In link
    And user choose credit card number
    And user enter credit card number in the text field
      |Credit|
      |1231429482354364|
    And user enter last name in the text field
    And user enter on From AirPort
#===================================================================================================
  Scenario: Delta air line home page check In Link with Ticket number
#    Given user on Delta Air Line home page
    And user click on Check In link
    And user choose Ticket number
    And user enter Ticket number in the text field
     |Ticket|
     | 0062112549881 |
    And user click on From AirPort
    And user enter AirPort Name in the text field
    |AirPortName|
    |DTW         |


#     #Data Table
##  @RegressionTest @mahmud
#  Scenario: Amazon login signIn functionality checking using valid credential
#    And user enter valid email address or phone number in username field
#      | email            |
#      | lounas@gmail.com |
#    And user click on continue button
#    And user enter valid password in password Field
#      | test123 |
#    When user click on Sign-In button
#    And user should be able to see the valid "<userName>" user name
#      | Hello,Lounas |
#

#//=============================================================================================================
  Scenario: Delta air line home page check In Link with SkyMiles number
    Given user on Delta Air Line home page
    And user click on Check In link
    And user choose SkyMiles number
    And user enter SkyMiles number in the text field
    And user click on From AirPort
    And user enter AirPort Name in the text field
    And user click on red arrow button
#=================================================================================================



