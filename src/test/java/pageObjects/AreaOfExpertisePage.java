package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;

public class AreaOfExpertisePage {
    public WebDriver driver;
    public ElementUtil eleUtil;
    public AreaOfExpertisePage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }
    By AreaofExpertise= By.xpath("//span[text()='Area of Expertise']");
    By icanteachtext= By.cssSelector("div h4");
    By addeditsubjectText= By.xpath("//div//h5[text()='Add/edit subjects']");
    By addNewlink= By.linkText("Add new");
    By Selectwhatyoucanteach= By.name("category");
    By SelectSubCategory= By.name("sub_categories");
    By SaveandUpdateChangesButton= By.xpath("//a[@id='tu-submit-subjects']");
    By crossButton=By.className("tu-close");
    public void clickLinkOnAreaOfExpertise()
    {
        eleUtil.doClick(AreaofExpertise);
    }
    public String verifyIcanTeachText()
    {
      String text=  eleUtil.getElement(icanteachtext).getText();
      return text;
    }
    public boolean verifyADDorEditText()
    {
      WebElement ele=  eleUtil.waitForElementVisible(addeditsubjectText,50);
      return ele.isDisplayed();
    }
    public void clickAddNewLink()
    {
        eleUtil.doClick(addNewlink);
    }
    public void selectOptionWhatYouCanTeach(String x)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Selectwhatyoucanteach));
        eleUtil.doSelectDropDownByVisibleText(Selectwhatyoucanteach,x);

    }
    public void selectSubCategory(String x)
    {   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SelectSubCategory));
        eleUtil.doSelectDropDownByVisibleText(SelectSubCategory, x);

    }
    public void clickSaveAndUpdateChanges()
    {
        eleUtil.doClick(SaveandUpdateChangesButton);
       // driver.findElement(crossButton).click();
    }


}
