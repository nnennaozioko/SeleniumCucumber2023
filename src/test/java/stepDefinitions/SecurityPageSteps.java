package stepDefinitions;

import Hooks.BasePage;
import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.SecurityPage;

public class SecurityPageSteps  {
    SecurityPage securityPage= new SecurityPage(BrowserDriver.getDriver());
    @When("I click on Security link")
    public void iClickOnSecurityLink() {
securityPage.doClickSecuritylink();
    }

    @Then("I verify Delete account text")
    public void iVerifyDeleteAccountText() {
        Assert.assertEquals( securityPage.verifyDeleteaccounttext(), "Delete account");
    }

    @When("I select reason from the dropdown {string}")
    public void iSelectReasonFromTheDropdown(String arg0) {
        securityPage.selectReasonFromDropdown(arg0);
    }

    @And("I write comments {string}")
    public void iWriteComments(String arg0) {
securityPage.enterTextInComments(arg0);
    }

    @And("I click on Delete account button")
    public void iClickOnDeleteAccountButton() {
        securityPage.clickDeleteButton();
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        securityPage.enterPassword(arg0);
    }
}
