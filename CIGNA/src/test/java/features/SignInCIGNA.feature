Feature: CiGna user should logIn in to there account


#  Scenario Outline: logIn to Cigna using valid user credential
#    Given user on Cigna Home page
#    And user click on logIn to MyCigna
#    And user enter valid "<UserName>" in the userName field
#    And user enter valid"<passWord>" in the passWord field
#    And user click on signIn button
#    Examples:
#      | UserName | passWord |
#      |Jack      | test12345|
#      |bob       |Test253636|

   Scenario: logIn to Cigna using valid user credential
     Given user on Cigna Home page
     And user click on logIn to MyCigna
     And user enter valid UserName in the userName field
#     And user enter valid passWord in the passWord field
#     And user click on signIn button
#
   Scenario: Cigna member resource Registration using invalid information
     Given user on Cigna Home page
     And user click on member resource
     And user click on activate your account
     And user enter first name in the first input box
     And user enter last name in the second input box
     And user click next button
#     And user select month from the drop the down
#     And user enter day of birthday in the day input field
#     And user enter year of birthday in the year input filed
#     And user click next button
#     And user enter zip code in the input field
#     And user click next
#
#     And user choose radioButton Im a Cigna customer
#     And user enter medicare card number in the input field
#     And user click on next
#     And user user check in the information and click next
#     Then user see error message is display
