# new feature
# Tags: optional

Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a test in the search box
    And hits enter
    Then user is navigated to results page