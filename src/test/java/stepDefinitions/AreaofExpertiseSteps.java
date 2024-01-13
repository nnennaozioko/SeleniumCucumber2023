package stepDefinitions;

import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.AreaOfExpertisePage;

public class AreaofExpertiseSteps extends BrowserDriver {
    AreaOfExpertisePage areaOfExpertisePage= new AreaOfExpertisePage(driver);
    @And("I click on AreaofExpertise link")
    public void iClickOnAreaofExpertiseLink() {
        areaOfExpertisePage.clickLinkOnAreaOfExpertise();

    }


    @And("I click on Addnew link")
    public void iClickOnAddnewLink() {
        areaOfExpertisePage.clickAddNewLink();
    }


    @And("Select the {string} from dropdown")
    public void selectTheFromDropdown(String option) {
        areaOfExpertisePage.selectOptionWhatYouCanTeach(option);
    }
    @And("Select {string}from the list")
    public void selectFromTheList(String subcategory) {
        areaOfExpertisePage.selectSubCategory(subcategory);
    }

    @And("I click saveandupdatechanges")
    public void iClickSaveandupdatechanges() {
        areaOfExpertisePage.clickSaveAndUpdateChanges();

    }

    @Then("verify the text")
    public void verifyTheText() {
    Assert.assertTrue(   areaOfExpertisePage.verifyADDorEditText());
    }
}
