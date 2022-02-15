Feature: CIGNA Medicare functionality



#    Background: user on CIGNA home page

  Scenario: shop for medicare plan
    Given user on CIGNA home page
    And user click on medicare
    And user click on shop medicare advantage plans
    When user enter zip code in the text field
    Then user see available plan display
#======================pass===================================

  Scenario: shop for prescription Drug plan
    Given user on CIGNA home page
    And user click on medicare
    And user click on Shop Part D Prescription Drug Plans
    And user enter zip code in the text filed
    And user click on select plan button
    Then user see the drug plan display
#==============================pass==============================================
  Scenario: shop for supplement Insurance
    Given user on CIGNA home page
    And user click on medicare
    And user click on supplement insurance
    And user click on get a online quote button
    Then user see the supplement insurance information display
    And user enter zip code in text field
#========================pass===================================
  Scenario: Cigna home page glossary link check the category tab
    Given user on CIGNA home page
    And user click on glossary link
    And user click on category tab
    And user checkBox claims and payments
    When click on Adjudicate Adjudication link
    Then user see glossary information is display

#***********************************************************
  Scenario: Cigna home page glossary link check the letter tab
    Given user on CIGNA home page
    And user click on glossary link
    And user click on Letter tab
    And user click on letter H
    And click on Health Care Facility link
    Then user see Health Care Facility information is display

#=============================================================================
  Scenario: Cigna home page resource link check Health and Wellness

    Given user on CIGNA home page
    And user click on Health and Wellness link
    And click on Autism link
    And click on Learn more about the All In with Autism program
    Then user see Autism related information is display
#=======================================================================================
  Scenario: Cigna home page resource link check eating well
    Given user on CIGNA home page
    And user click on Health and Wellness link
    When user click on eating well
    Then user see Eat well is display
    And user click on eating disorder
#====================================================================================================

  Scenario: Cigna Third Party Administrators site check Your ACA Roadmap link
    Given user on CIGNA home page
    And user click on Third Party Administrators under About Cigna
    And user click on Your ACA Roadmap link
    And user select self funded from the dropDown Your funding type
    And user select April from the dropDown Renewal month
    And user select Group size from the dropdown
    And user select Open Enrollment start from the dropDown
    When user click on Generate Timeline button
    Then user see enrollment start date is display

#====================================Pass==============================================================

  Scenario: Cigna Employee plan and service on home delivery
    Given user on CIGNA home page
    And user click on employee link
    And user click on pharmacy link
    And click on home delivery link
    Then user see home delivery service information is display
    And user click on switch to home delivery today

#==========================================================================================================



  Scenario: Cigna Third Party Administrators site
    Given user on CIGNA home page
    And user click on Third Party Administrators under About Cigna
    And user click on Get tools and flyers to share with your clients link
    And user enter first name


#========================================================================
  Scenario: Cinga home page Health care providers link check behavior credentialing functionality
    Given user on CIGNA home page
    And click on Health care providers link
    And user click on Behavioral Credentialing link
    And user click on Re credentialing link
    And user click on first time credentialing
    Then user see Cigna Behavioral Health Network Credentialing


#==========================================================================================






      #   Scenario: check CIGNA search box using valid search
##     Given user on CIGNA home page
#     And user enter vision plan in the search field
#     And user click on search box
##     Then user see the vision plan related information is display
#











