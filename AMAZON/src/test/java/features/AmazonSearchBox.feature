Feature: Amazon search box functionality

@Re-Enter
Scenario: Amazon search box filed should get cleared to re-enter product name again
Given  user on Amazon home page
And user enter product name in the search
And user clear search field
When enter product name in the search field
Then use go back to the amazon home page



@AutoSuggest
Scenario:Amazon search box auto suggest keyword when typing in the search box field
Given  user on Amazon home page
And user enter product name in the search Box field
And user choose the auto suggest product name from the dropdown
#    When use click on search button
Then user should see auto suggest product is displayed





























