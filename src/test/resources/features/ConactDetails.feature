Feature: ContactDetailsPage

  Background:
    Given I navigate to the website
    When  I click on Login button
    Given User is already logged into application
    |Username|Password|
    |ramithi@gmail.com   |Jank123@|

  Scenario Outline: Contact details Page

    #When  I enter the Username "sranthi@gmail.com  "
    #And I enter UserPassword "Jank123@ "
    #And   I click on Submit button
    Then  my profile page displayed
    And   I click on Contact details link
    And   I enter "<Phonenumber>"
    And   I click save and update
Examples:
|Phonenumber|
|07545678345|

@Smoke
    Scenario Outline: Verify Contact details with Invalid Phone number
      When  I enter the Username "Ekanmask@gmail.com"
      And I enter UserPassword "Mark123@ "
      And   I click on Submit button
      Then  my profile page displayed
      And   I click on Contact details link
      And   I enter "<InvalidPhonenumber>"
      Then  Error Message should be displayed
      Examples:
        |InvalidPhonenumber|
         |075567834|
