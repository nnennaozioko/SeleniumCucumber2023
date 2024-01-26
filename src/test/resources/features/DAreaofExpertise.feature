Feature: AreaofExpertise details

  Background:
    Given I navigate to the website
    When  I click on Login button
@Smoke
  Scenario Outline: AreaofExpertisedetails Page

   And I enter the Username "izanthi@gmail.com  "
    And I enter UserPassword "Jank123@ "
    And   I click on Submit button
    Then  my profile page displayed
    And   I click on AreaofExpertise link
    And   I click on Addnew link
    Then  verify the text
    And   Select the "<option>" from dropdown
    And   Select "<SubCategory>"from the list
    And   I click saveandupdatechanges
  #  And   I click save and update
    Examples:
       |option|SubCategory|
       |Business Analysis|Azure DevOps|