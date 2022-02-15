
Feature: individuals and families functionality








Scenario: individuals and families dental plan link
  Given user on CIGNA home page
  And user click on individuals and families link
  And user click on dental insurance link
  And user click on get a quote
    And user enter home zip code text field
#  And user select start effective date
# And user enter first name in text field

#//====================================================================================
Scenario: Health insurance for individuals and families
  Given user on CIGNA home page
  And user click on individuals and families link
  And user click on health insurance for individuals families link
  And user click on browser health insurance plan
  And user enter zip code in the input filed
#  And user enter name in the input field
#  And user click on see my plan link




  Scenario: medicare supplement for individuals and families
    Given user on CIGNA home page
    And user click on individuals and families link
    And user click on medicare supplement link
#    And user click on get quote medicare supplement
#     And user enter zip code where you live
