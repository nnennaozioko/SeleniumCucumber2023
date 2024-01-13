package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ContactDetailsPage;
import pageObjects.LoginPage;

import java.util.List;
import java.util.Map;

public class ContactdetailsSteps extends BrowserDriver {

    public ContactDetailsPage contactDetailsPage= new ContactDetailsPage(driver);
//    @Given("User has already logged into application")
//    public void userHasAlreadyLoggedIntoApplication(DataTable credTable) {
//        List<Map<String, String>> credList = credTable.asMaps();
//        String userName = credList.get(0).get("username");
//        String password = credList.get(0).get("password");
//        contactDetailsPage=loginPage.doLogin(userName,password);
//    }

    @And("I click on Contact details link")
    public void iClickOnContactDetailsLink() {
        contactDetailsPage.doClickContactDetailsLink();
    }


    @And("I enter {string}")
    public void iEnter(String phno) {
        contactDetailsPage.enterPhoneNumber(phno);
    }


    @Then("Error Message should be displayed")
    public void errorMessageShouldBeDisplayed() {

    }
}
