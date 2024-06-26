Feature: I want to register to become a mentor.


  Background:

    Given I navigate to the website
   When I click sign up button
   Then welcome page displayed

@Smoke
  Scenario Outline: valid mentor registration
    When I enter first name "<firstName>"
  And I enter last name "<lastName>"
 #   And I enter the email "<emailAddress>"
  #  And I enter Password "<password>"
    And I click mentor checkbox
    And I click terms and condition
    And I click join now
    Then my profile page displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Bharadwaj|  Eddanapudi     |  rnmithi@gmail.com          |Jank123@    |
    #|  Eusy       |   James     |    eusy@yahoo.com        |   Eusy123$     |

@Smoke
  Scenario Outline: invalid password mentor registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentor checkbox
    And I click terms and condition
    And I click join now
    Then  the text Password must be  characters is displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Mark       |  John      |  markish@gmail.com    |    k123@   |
      #|  Eusy       |   James    |   eusy@yahoo.com   |   Eusy1    |


  Scenario Outline: Invalid  email address mentor registration
    When I enter first name "<firstName>"
    And I enter last name "<lastName>"
    And I enter the email "<emailAddress>"
    And I enter Password "<password>"
    And I click mentor checkbox
    And I click terms and condition
    And I click join now
    Then the text "Please add a valid email address" is displayed

    Examples:
      |firstName|lastName|emailAddress|password|
      |  Mark       |  John      |  markgmail.com  |    Mark123@    |
      #|  Eusy       |   James    |    eusy@yahoo.  |   Eusy123$     |
