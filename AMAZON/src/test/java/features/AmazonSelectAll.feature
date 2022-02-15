
Feature: Amazon select from All dropDown list

  Scenario: Amazon select product from All from the header
    Given  user on Amazon home page
    And user select from dropDown
    And user click on the search button Link
    And user click on art supplies
    And user checkBox on eligible for free shipping

#
  Scenario: Amazon select baby from All dropDown list
    Given  user on Amazon home page
    And user select Baby from dropDown
    And user click on the search button Link
    And user click on baby care link
    Then user see baby product is display
    And user checkBox munchkin brand
    And click on munchkin baby wipes

  Scenario: Amazon select computer from All dropDown list
    Given  user on Amazon home page
    And user select computer from dropDown
    And user click on the search button Link
    And user click on laptop link
    When user click on Home laptops
    Then User see Home laptops is display
    And user click on see all details button
#
  Scenario:Amazon select cellPhone and accessories from All dropDown list
    Given  user on Amazon home page
    And user select cellPhone and accessories from dropDown
    And user click on the search button Link
    And user click on cellPhone link
    And user checkBox Unlocked in the carries section
    When user checkBox Apple in the featured brand
    Then user see cell phone is displayed
    And click on New condition






















