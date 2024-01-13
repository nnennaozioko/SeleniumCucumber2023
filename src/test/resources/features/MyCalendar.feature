Feature: MyCalendar details

  Background:
    Given I navigate to the website
    When  I click on Login button
  @Smoke
  Scenario Outline: MyCalendarDetails Page

    And I enter the Username "sranthi@gmail.com "
    And I enter UserPassword " Jank123@"
    And   I click on Submit button
    Then  my profile page displayed
    And  I click on MyCalendar link
    Then Verify the text Booking details displayed
    And click on AddEdit booking links
    And I click on Addnewtimeslots
    Then Verify AddEditappointment details
   # And Select "<Day1>" and "<Day2>" from the list
    And Select "<Day1>" from the list
    And Enter slot title "<Text>"
    And Select "<StartTime>" and "<EndTime>"
    And Select "<BreakTime>"
     And Select "<SessionDuration>" time
    And Select radio button for "<NoofAppointmentspaces>"
    And Click on Generatetimeslot button
    And   I click saveandupdate button
    Examples:
    |Day1  |Day2     |Text       |StartTime|EndTime|BreakTime|SessionDuration|NoofAppointmentspaces|
    |Monday|Wednesday|Maths class|11:00 am   |12:00 pm  |5 minutes|45 minutes  |2                    |