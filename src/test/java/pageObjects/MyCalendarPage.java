package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;
import java.util.List;

public class MyCalendarPage {
    public WebDriver driver;
    public ElementUtil eleUtil;

    public MyCalendarPage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }

    By Calendarlink = By.xpath("//span[text()='My calendar']");
    By BookingDetailsText = By.xpath("//div//h4[text()='Booking details']");
    By AddorEditbookings = By.xpath("//a[text()='Add/Edit bookings']");
    By addnewTimeslot = By.xpath("//a[@class='tu-newslots tu-add-appointment-timeslot']");
    By AddeditappointmentText = By.xpath("//div//h5[text()='Add/edit appointment details']");
    By availabledays = By.id("tu-weekdays");
    By slottitle = By.name("tu_slot_title");
    By starttime = By.name("tu_appointment_starttime");
    By endtime = By.id("end-time");
    By breaktime = By.id("inter-duration");
    By sessionduration = By.name("tu_appointment_duration");
    By Noofappointmentspaces = By.xpath("//div[@class='tu-apspaces']//div");
    By selectdropdown= By.xpath("//input[@class='select2-search__field']");
    By saveandupdatebutton= By.xpath("//a[@id='tu-save-timeslots-btn']");


    public void doClickonMyCalendar() {
        eleUtil.doClick(Calendarlink);
    }

    public boolean verifyBookingdetailsText() {
        return eleUtil.doElementIsDisplayed(BookingDetailsText);
    }

    public void clickOnaddEditbooking() {
       eleUtil.doClick(Calendarlink);
        eleUtil.doClick(AddorEditbookings);
    }

    public void clickAddTimeSlot() {
        eleUtil.doClick(addnewTimeslot);
    }

    public void verifyAddeditappointmentDetailsText() {
        eleUtil.doElementIsDisplayed(AddeditappointmentText);
    }

    public void Selectavailabledays(String text1) {

//eleUtil.doSelectDropDownByVisibleText(availabledays,text1);

//driver.findElement(By.xpath("//select//option[text()='"+text1+"']")).click();
       // eleUtil.doClick(selectdropdown);
eleUtil.doSendKeys(selectdropdown,text1);
driver.findElement(selectdropdown).sendKeys(Keys.ENTER);


    }

    public void enterSlotTitle(String text) {
        eleUtil.doSendKeys(slottitle, text);
    }

    public void selectStarttimeandEndtime(String stime, String etime) {
        eleUtil.doSelectDropDownByVisibleText(starttime, stime);
        eleUtil.doSelectDropDownByVisibleText(endtime, etime);
    }

    public void selectBreakTime(String btime) {
        eleUtil.doSelectDropDownByVisibleText(breaktime, btime);
    }

    public void selectSessionDuration(String time) {
        eleUtil.doSelectDropDownByVisibleText(sessionduration, time);
    }

    public void selectNoofAppointmentSpaces(String spaces) {
        //  By Noofappointmentspaces=By.xpath("//div[@class='tu-apspaces']//div//input[@value='"+spaces+"']");
        List<WebElement> ele= driver.findElements(Noofappointmentspaces);
        for (WebElement e : ele) {
       String text=     e.getText();
   System.out.println(text);
       if(text.contains(spaces))
       {
           e.click();
           break;
       }
        }
    }
    public void clickGenerateTimeslot()
    {

        String csspath="div a#tu-generate-timeslots";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);
    }
    public void clickSaveAndUpdateButton()
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveandupdatebutton));
        eleUtil.doClick(saveandupdatebutton);


    }
}