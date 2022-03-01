
Feature: Amazon fire Tv functionality

   Background: user on Amazon home page
  @amazonFireTvSupport
  Scenario: check the Amazon fire TV Support functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click on Fire Tv Support link
    Then user see Fire Tv Support information is displayed
    And user enter Text in the find more solutions


  @LearnFireTV
  Scenario: check the Amazon  learn fire TV functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click on Learn Fire Tv link
    Then user see LearnFire Tv information is displayed

  @AppAndGames
  Scenario: check the Amazon App and Games functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click on App and Games
#    And checkbox Fire Games controller in the controller type field
#    Then user see the filter result is displayed
#
  @PrimeVideo
  Scenario: check the Amazon prime Video functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click prime video link
    And user click on categories
    When user click on Kids button
    Then user see the prime video is displayed
#
  @AmazonPhotos
  Scenario:  check the Amazon Photos functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click Amazon Photos link
    And user click on Storage
    And user enter "jack2020@gmail.com" email in the text field
    And user enter "bdhddgt1234" password in password field
    When user click on Sign-in button


  @RegressionTest
  Scenario Outline: check the Storage account functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click Amazon Photos link
    And user click on Storage
    And user enter "<email>" email in the text field
    And user enter "<password>" password in password field
    When user click on Sign-in button
    Examples:
      | email | password |
      |jasmain@gmail.com| test12345|
      |tahmina          |bddhdaud1234|



  Scenario: check the Amazon fire Tv Stick functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on fire Tv link
    And user click shop all fire TV devices
    And user click on Fire Tv stick Lite
    And user choose the quantity from the drop down
#    Then user see Fire TV stick Lite displayed


  @FireTablet
  Scenario: check the Fire 7 tablets functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on Fire Tablets link
    And user click Fire 7 link
    When user choose a color from the box
    Then user see there color is picked


  Scenario: check the Fire Hd-10 kids tablets functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on Fire Tablets link
    And user click Fire HD 10 Kids link
    When user click on with head set
    Then user see  head set is selected

  @accessories
  Scenario: check the accessories functionality
#    Given user on Amazon home page
    And user click on bold All link on the left side of the application
    And user click on Fire Tablets link
    And user click accessories link
    And user click all new keyboard
    And user select quantity
    Then user see all new keyboard item is display

  @pending
  Scenario: Amazon Search Box functionality using a product
#    Given user on Amazon home page
    And user enter product name in the search field
    Then user click on the search button
    And user should see search product is displayed

  @ProductFilter
  Scenario:  Amazon Search box functionality using a product and filter the product
#    Given  user on Amazon home page
    And user enter product name in the search Box
    And user click on the search button
    And user checkbox WECARE brand
    Then user should see WECARE brand product is displayed

  @Books
  Scenario: Amazon best seller functionality check using Books
#    Given user on Amazon home page
    And user click on Best Seller link
    And user click on  Books link
    When user click on  Children’s Books
    Then user should see Children’s Books is displayed


























