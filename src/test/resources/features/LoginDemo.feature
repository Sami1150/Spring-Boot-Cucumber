# new feature
# Tags: optional

#Feature: Function to test login functionality
#
#  Scenario: Check login is successful with valid credentials
#    Given browser is open for use
#    And user is on login page
#    When user enters username and password
#    And user hits login button
#    Then user is succssfully logged in

Feature: Function to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open for use
    And user is on login page
    When user enters <username> and <password>
    And user hits login button
    Then user is succssfully logged in
    Examples:
      | username | password    |
      | student  | Password123 |
      | student2 | Password123 |