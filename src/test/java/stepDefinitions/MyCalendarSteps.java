package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.MyCalendarPage;

public class MyCalendarSteps extends BrowserDriver {
    MyCalendarPage myCalendarPage= new MyCalendarPage(driver);
    @And("I click on MyCalendar link")
    public void i_click_on_my_calendar_link() {
myCalendarPage.doClickonMyCalendar();
    }
    @Then("Verify the text Booking details displayed")
    public void verify_the_text_booking_details_displayed() {
        Assert.assertTrue(myCalendarPage.verifyBookingdetailsText());
    }
    @And("click on AddEdit booking links")
    public void click_on_add_edit_booking_links() {
myCalendarPage.clickOnaddEditbooking();
    }
    @And("I click on Addnewtimeslots")
    public void i_click_on_addnewtimeslots() {
        myCalendarPage.clickAddTimeSlot();
    }

    @Then("Verify AddEditappointment details")
    public void verify_add_editappointment_details() {
       myCalendarPage.verifyAddeditappointmentDetailsText();
    }
//    @Then("Select {string} and {string} from the list")
//    public void select_and_from_the_list(String day1, String day2) {
//        myCalendarPage.Selectavailabledays(day1);
//        myCalendarPage.Selectavailabledays(day2);
//    }


    @And("Enter slot title {string}")
    public void enterSlotTitle(String text) {
        myCalendarPage.enterSlotTitle(text);
    }

    @And("Select {string} and {string}")
    public void selectAnd(String startTime, String endTime) {
myCalendarPage.selectStarttimeandEndtime(startTime,endTime);
    }

    @And("Select {string}")
    public void select(String BTime) {
        myCalendarPage.selectBreakTime(BTime);

    }

    @And("Select {string} time")
    public void selectTime(String time) {
        myCalendarPage.selectSessionDuration(time);
    }

    @And("Select radio button for {string}")
    public void selectRadioButtonFor(String text) {
        myCalendarPage.selectNoofAppointmentSpaces(text);
    }

    @And("Click on Generatetimeslot button")
    public void clickOnGeneratetimeslotButton() {
        myCalendarPage.clickGenerateTimeslot();
    }

    @And("Select {string} from the list")
    public void selectFromTheList(String arg0) {
        myCalendarPage.Selectavailabledays(arg0);
    }

    @And("I click saveandupdate button")
    public void iClickSaveandupdateButton() {
        myCalendarPage.clickSaveAndUpdateButton();
    }
}
