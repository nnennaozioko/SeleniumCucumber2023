Feature: MySecurity page

  Background:
    Given I navigate to the website
    When  I click on Login button
  @Smoke
  Scenario Outline: MySecurity Page

    And I enter the Username "izanthi@gmail.com  "
    And I enter UserPassword " Jank123@"
    And I click on Submit button
    Then my profile page displayed
    When I click on Security link
    Then I verify Delete account text
    When I select reason from the dropdown "<Reason>"
    And  I enter password "<Password>"
    And I write comments "<Comments>"
    And I click on Delete account button

    Examples:
    |Reason|Password|Comments|
    |I don't want to use any more|Jank123@|Deleting account|
