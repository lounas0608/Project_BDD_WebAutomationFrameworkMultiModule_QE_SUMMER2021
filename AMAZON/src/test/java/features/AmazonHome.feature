
Feature: amazon home link functionality 

@HomeDecor
Scenario: Check Amazon "Amazon Home" functionality
Given user on Amazon home page
And user click on Amazon Home
And user click on decor
And user click on Wall Art
When user check on the checkBox Original
#      Then user should see Original wall art results is displayed


  Scenario: Amazon shop by room link functionality
    Given  user on Amazon home page
    And user click on Amazon Home link
    And user click on shop by room
    And user click on BedRoom link
    When user click on Bed Frame
    Then user see Bed Frame is display
    And user input minimum value
    And user input maximum value



  Scenario: Amazon kitchen and Dining functionality
    Given  user on Amazon home page
    And user click on Amazon Home link
    And user click on kitchen and dining
    And user click on CookWare link
    And user click on All Pans
    And user click on Lodge Featured Brand
    When user click on Cast Iron Material
    Then user see the cookWare is display

  Scenario: Amazon Appliance functionality
    Given  user on Amazon home page
    And user click on Amazon Home link
    And user click on kitchen and dining
    When user click on Appliance link
    Then user see small Appliance is display
    And user click on blender link
    And user checkBox Metal Blending Container Material



  Scenario: Amazon Storage & Organization functionality
    Given  user on Amazon home page
    And user click on Amazon Home
    And user click on kitchen and dining
    And user click on Storage and Organization link
    And user checkBox Climate Pledge Friendly
    Then user see the filter product is display
    And user choose select black color

    Scenario:Amazon BakeWare functionality
      Given  user on Amazon home page
      And user click on Amazon Home link
      And user click on kitchen and dining
      And user click on BakeWare link
      And user click on cake pans
      Then user see cake pans is displayed
      And user click on USA PAN Featured Brands

    Scenario: Amazon Utensils & Gadgets functionality
      Given  user on Amazon home page
      And user click on Amazon Home link
      And user click on kitchen and dining
      And user click on Utensils and Gadgets link
      And user click on Cooking Utensils link
      And user check Box Rachael Ray Featured brand
      Then user see Cooking Utensils is displayed

  Scenario: Amazon Dining and Entertaining functionality
    Given  user on Amazon home page
    And user click on Amazon Home link
    And user click on kitchen and dining
    And user click on Dining and Entertaining link
    And user check box ceramic material
    When user click on Price
    Then user see dining and Entertaining is display


  Scenario: Amazon Kitchen & Table Linens functionality
    Given  user on Amazon home page
    And user click on Amazon Home link
    And user click on kitchen and dining
    And user click on Kitchen and Table Linens link
    And user check box cotton Material
    And user click on number of Set
    When user click on red color
    Then user see kitchen and table product is display

  Scenario:  Amazon Registry functionality  using Registrant name
    Given  user on Amazon home page
    And user click on registry
    And user type a name in the Registrant name field
    And use  select Birthday Gift List from the drop down
    When use click on search button
#    Then user should see list of Registrant name displayed














