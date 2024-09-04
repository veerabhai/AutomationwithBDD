Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given User is on Google Home Page
    When User enters "Cucumber BDD" in the search box and clicks search
    Then Search results page is displayed
    And The title contains "Cucumber BDD"
