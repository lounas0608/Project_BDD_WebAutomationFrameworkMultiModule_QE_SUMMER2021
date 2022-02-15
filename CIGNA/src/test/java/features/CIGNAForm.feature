Feature: Cigna find a form functionality


#  ============================pass=======================================
  Scenario: Cigna find a dental form information
    Given user on CIGNA home page
    And user click on find a form link
    And user click on dental forms
    Then user see dental information is display
    And user click on dentist directory request
#=======================pass=================================================

  Scenario: Cigna vision form information
    Given user on CIGNA home page
    And user click on find a form link
    And user click on vision form
    Then user see vision form information is display

#=============================pass==================================================

  Scenario: Cigna medica form information
    Given user on CIGNA home page
    And user click on find a form link
    And user click on medical form link
    And user click on request a medical ID card
#    And enter CIGNA healthCare ID number










