

 Feature: check the Cigna search box functionality


   Scenario: Cigna search for dentist in the search box
     Given user on Cigna Home page
     And user enter dentist in the search box
     And user click on the search button
     Then user see dentist information is display
     And user click on what preventive dentistry link




   Scenario: Cigna search for pediatrician in the search box
     Given user on Cigna Home page
     And user enter pediatrician in the search box
     And user click on the search button
     Then user see pediatrician information is display
     And user click on medical library
    And user click on individuals families link



   Scenario: Cigna search with invalid information in the search box
     Given user on Cigna Home page
     And user enter Jewelry in the search box
     And user click on the search button
     Then user see error message display


   Scenario: Cigna home search in the search box with special characters
     Given user on Cigna Home page
     And user enter special characters in the search box
     And user click on the search button
     Then user see error message Your search did not match any pages or documents

   Scenario: Cigna home search in the search box with mix of Letter, number and special characters
     Given user on Cigna Home page
     And user enter letter and number and special characters in the search box
     And user click on the search button
     Then user see Your search did not match any pages or documents error message


       #////////////////////////////////////////////////////////////////////////////////////////
   Scenario: Cigna search for vision plan in the search box
     Given user on Cigna Home page
     And user enter vision plan in the search box
     And user click on the search button
     Then user see vision plan information is display
     And user click on group vision insurance plans for employee
     And user click on connect with us link




















