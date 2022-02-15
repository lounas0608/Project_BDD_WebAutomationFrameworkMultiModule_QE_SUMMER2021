Feature: About Cigna home page functionality


  Scenario: Cigna home page check Suppliers link
    Given user on Cigna Home page
    And user click on Suppliers link
    And user click on Information for Current Suppliers
    And user click on Policy Guidelines
    And user click on Supplier Diversity Program
    Then user see Supplier Diversity Program
#===================================================================================
  Scenario: Cigna home page See Prescription Drug List search link
    Given user on Cigna Home page
    And user click on See Prescription Drug List link
    And user select on Advantage Tier from the dropDown
    When user enter Prescription Drug Name in the search field
    Then user see the search prescription drug name display
#===================================================================================

  Scenario: Cigna home page check Investors link
    Given user on Cigna Home page
    And user click on investors
    And user click on Second Quarter Earnings Release
    And user select hour from dropDown
    And user enter email in the input text field
    And user click on save button
#    ===========================================================================================

  Scenario: Cigna home page Newsroom link functionality
    Given user on Cigna Home page
    And user click on Newsroom link
    And user click on Press Releases link
    And user select partnerShip from the dropDown
    And user click on Go button
















#  ====================================================================================
  Scenario: Cinna home page check international link functionality
    Given user on Cigna Home page
    And user click on international
    And user click on start individual quote link
#    And user enter first name in the input text field










#      And user click on Governance
#      And user click on Cigna Corporate Responsibility link
#      Then user see Corporate Responsibility for investor is display




