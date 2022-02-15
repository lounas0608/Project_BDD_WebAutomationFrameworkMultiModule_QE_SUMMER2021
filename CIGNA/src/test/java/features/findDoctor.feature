
Feature: find a doctor functionality
#=============================pass===========================================
  Scenario: find a doctor need you
    Given user on CIGNA home page
    And user click on find a doctor and dentist or facility
    And user click on employer or school
    And user enter zip code to find doctor near
    And user click on doctor by type
   And user enter type of doctor in text field
#=========================pass===========================
  Scenario: find a doctor by name
    Given user on CIGNA home page
    And user click on find a doctor and dentist or facility
    And user click on employer or school
    And user enter zip code to find doctor near
      And user click on doctor by name link
    And user enter doctor name in the input field







