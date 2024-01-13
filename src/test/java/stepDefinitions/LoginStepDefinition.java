package stepDefinitions;

import Hooks.BasePage;
import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginStepDefinition extends BrowserDriver{

    LoginPage loginPage= new LoginPage(driver);
    @When("I click on Login button")
    public void iClickOnLoginButton() {

loginPage.clickLoginlink();
    }


    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
loginPage.clickSubmitButton();
    }

    @And("I enter the Username {string}")
    public void iEnterTheUsername(String username) {
loginPage.enterUsername(username);
    }

    @Then("Successful message PopUp displayed")
    public void successfulMessagePopUpDisplayed() {
        Assert.assertTrue(loginPage.verifyMessagedisplayed());
    }

    @Then("Invalid text message displayed")
    public void invalidTextMessageDisplayed() {
        Assert.assertTrue(loginPage.InvalidText());
    }

    @And("I enter UserPassword {string}")
    public void iEnterUserPassword(String pwd) {
loginPage.Userpassword(pwd);
    }
}
