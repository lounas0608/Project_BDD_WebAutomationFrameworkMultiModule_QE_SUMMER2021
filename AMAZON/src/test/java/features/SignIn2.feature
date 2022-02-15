Feature: Amazon user should signIn/ Login on application or Amazon Login functionality check

  Narration:
  User can signIn when they are visiting amazon page for shopping purpose and
  they can sigIn during checkout time as well

  Background:
    Given user on amazon Sign-In page

  #@RegressionTest @SmokeTest
   @mahmud5
  Scenario: Amazon login signIn functionality checking using valid credential
    And user enter valid "mh.shahib@gmail.com" email address or phone number in username field
    And user click on continue button
    And user enter valid password in password Field
    When user click on Sign-In button
    And user should be able to see the valid "Hello,Mahmudul" user name
#    Then user should be able to log in their account
#    And user should be able to see welcome message on top of Account & list

  @RegressionTest @mahmud
  Scenario: Amazon login signIn functionality checking using valid credential
    And user enter valid "lounas@gmail.com" email address or phone number in username field
    And user click on continue button
    And user enter valid "test123" password in password Field
    When user click on Sign-In button
    And user should be able to see the valid "Hello,Lounas" user name

#Scenario outlines are used when the same test is performed multiple times with a different combination of values
  @RegressionTest @mahmud
  Scenario Outline: Amazon login signIn functionality checking using valid credential
    And user enter valid "<email>" email address or phone number in username field
    And user click on continue button
    And user enter valid "<password>" password in password Field
    When user click on Sign-In button
    And user should be able to see the valid "<userName>" user name

    Examples:
      | email               | password | userName        |
      | lounas@gmail.com    | test123  | Hello,Lounas    |
      | mh.shahib@gmail.com | test124  | Hello,mh shahib |
      | rupy@gmail.com      | test125  | Hello,Rupy      |
      | tahmina@gmail.com   | test126  | Hello,Tahmina   |


    #Data Table
  @RegressionTest @mahmud
  Scenario: Amazon login signIn functionality checking using valid credential
    And user enter valid email address or phone number in username field
      | email            |
      | lounas@gmail.com |
    And user click on continue button
    And user enter valid password in password Field
      | test123 |
    When user click on Sign-In button
    And user should be able to see the valid "<userName>" user name
      | Hello,Lounas |



  @RegressionTest @mahmud
  Scenario Outline: Sign up functionality check using multiple valid data1
    And I enter valid user "<userName>" and email "<email>" address and password "<password>" and reEnterPassword "<Re-EnterPassword>"
    When I click on create your amazon account
    #Then I should see hello valid user
    Examples:
      | userName | email            | password | Re-EnterPassword |
      | mahmudul | mahmud@gmail.com | test123  | test123          |
      | junaid   | junaid@gmail.com | test124  | test124          |
      | akbar    | akbar@gmail.com  | test125  | test125          |


  @RegressionTest @mahmud
  Scenario: Sign up functionality check using valid data from data table1
    And I enter valid information
      | userName | EmailAddress     | password | RePassword |
      | mahmud   | mahmud@gmail.com | test123  | test123    |
    When I click on create your amazon account

