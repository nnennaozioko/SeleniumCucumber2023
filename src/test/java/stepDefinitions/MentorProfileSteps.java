package stepDefinitions;

import Hooks.BasePage;
import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MentorProfilePage;
import pageObjects.MentorRegistrationPage;

public class MentorProfileSteps  {

MentorProfilePage mentorProfilePage= new MentorProfilePage(BrowserDriver.getDriver());

    @When("I select gender male")
    public void iSelectGenderMale() {
        mentorProfilePage.selectGender();
    }

    @And("I enter hourly free {string}")
    public void iEnterHourlyFree(String hourrate) {
        mentorProfilePage.EnterHourlyrate(String.valueOf(hourrate));
    }

    @And("I enter your tagline {string}")
    public void iEnterYourTagline(String tag) {
        mentorProfilePage.AddTagline("DGHJKL");
    }

    @And("I select country United Kingdom")
    public void iSelectCountryUnitedKingdom() {
        mentorProfilePage.selectCountry();
    }

    @And("I enter address {string}")
    public void iEnterAddress(String address) {
        mentorProfilePage.EnterAddress("bENTLEY TOWER");
    }

    @And("I enter postcode {string}")
    public void iEnterPostcode(String PC) {
        mentorProfilePage.EnterPostcode("TW56kl");

    }

    @And("I select language {string}")
    public void iSelectLanguage(String lang) {
        mentorProfilePage.SelectLanguage("English");

    }

    @And("I click online teaching location")
    public void iClickOnlineTeachingLocation() {
        mentorProfilePage.SelectOnlineCheckbox();
    }

    @And("I enter a  brief introduction {string}")
    public void iEnterABriefIntroduction(String intro) {
        mentorProfilePage.WriteBriefIntro("Thank you!");
    }

    @And("I upload photo")
    public void iUploadPhoto() {


    }

 @And("I click save and update")
    public void iClickSaveAndUpdate() {
       mentorProfilePage.clickSaveandUpdate();
   }
    @Then("a  successful message displayed")
    public void aSuccessfulMessageDisplayed() {
    }
}
