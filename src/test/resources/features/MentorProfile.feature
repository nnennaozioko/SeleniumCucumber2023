Feature: MentorProfile



  @tag1
  Scenario Outline: Validate mentor profile
    Given I navigate to the website "https://mentorskid.com"
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter gender "<gender>"
    And I enter hourly free "<hourlyFree>"
    And I enter your tagline "<yourTagline>"
    And I enter country "<country>"
    And I enter address "<address>"
    And I enter postcode "<postcode>"
    And I enter languages "<languages>"
    And I click online teaching location
    And I enter a brief introduction


    Examples: