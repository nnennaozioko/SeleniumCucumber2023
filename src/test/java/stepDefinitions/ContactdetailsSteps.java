package stepDefinitions;

import Hooks.BasePage;
import Hooks.BrowserDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ContactDetailsPage;
import pageObjects.LoginPage;

import java.util.List;
import java.util.Map;

public class ContactdetailsSteps  {

    public ContactDetailsPage contactDetailsPage;
            //= new ContactDetailsPage(BrowserDriver.getDriver());
    public LoginPage loginPage= new LoginPage(BrowserDriver.getDriver());
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

    @Given("User is already logged into application")
    public void userIsAlreadyLoggedIntoApplication(DataTable credTable) {
        List<Map<String,String>> credlist= credTable.asMaps();
       String username=  credlist.get(0).get("Username");
       String password=credlist.get(0).get("Password");
        contactDetailsPage= loginPage.doLogin(username,password);

    }
}
