Feature: MentorProfile

  Background:

    Given I navigate to the website
    When I click sign up button
    Then welcome page displayed


  Scenario Outline: valid mentor registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentor checkbox
    And I click terms and condition
    And I click join now
    Then my profile page displayed
    When I select gender male
    And I enter hourly free "<HourRate>"
    And I enter your tagline "DO12345"
    And I select country United Kingdom
    And I enter address "25 Little Bentley"
    And I enter postcode "SS13 2EJ"
    And I select language "English"
    And I click online teaching location
    And I enter a  brief introduction "Thank you!"
    And I upload photo
    And I click save and update
    Then a  successful message displayed
    Examples:
      |firstName|lastName      |emailAddress              |password        | HourRate|
      |  Ja     |  Johnkh      |  Elanmas@gmail.com          |    Mark123@    |500      |
