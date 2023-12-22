Feature: MentorProfile

Background:
  Given I navigate to the website
  Given I navigate to the website
  When I click sign up button
  Then welcome page displayed
  When I enter first name "Jarkrddh"
  And I enter last name "Johnkh"
  And I enter the email "Kirahg@gmail.com"
  And I enter Password "Kira123@"
  And I click mentor checkbox
  And I click terms and condition
  And I click join now
  Then my profile page displayed


  @tag1
  Scenario: Validate mentor profile
    When I select gender male
    And I enter hourly free "£500"
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

