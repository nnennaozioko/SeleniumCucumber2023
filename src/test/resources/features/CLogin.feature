Feature: LoginPage

  Background:

    Given I navigate to the website
    When I click on Login button
@Smoke
  Scenario: Verify User is able to login

    And I enter the Username " izanthi@gmail.com  "
    And I enter UserPassword "Jank123@ "
    And I click on Submit button
    Then my profile page displayed

# Invalid login---task
@Smoke
  Scenario: Invalid login credentials

    And I enter the Username "Ekanmaskgmail.com"
    And I enter Password "Mark123@"
    And I click on Submit button
    Then Invalid text message displayed


