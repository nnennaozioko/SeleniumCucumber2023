package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;

public class SecurityPage {

    public WebDriver driver;
    public ElementUtil eleUtil;
    public SecurityPage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }
    By securitylink= By.xpath("//span[text()='Security']");
    By deleteaccount= By.cssSelector("div h4");
    By reason= By.id("tu-reason");
    By password= By.xpath("//input[@name='password']");
    By comments= By.name("comments");
    By deletebutton= By.xpath("//a[@class='tu-primbtn-lg delete-my-account']");

    public void doClickSecuritylink()
    {
        eleUtil.doClick(securitylink);
    }
    public String verifyDeleteaccounttext()
    {
  return   eleUtil.doElementGetText(deleteaccount);

    }
    public void selectReasonFromDropdown(String txt)
    {
        eleUtil.doSelectDropDownByVisibleText(reason,txt);
    }
    public void enterPassword(String txt)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        eleUtil.doSendKeys(password,txt);
    }
    public void enterTextInComments(String txt)
    {
        eleUtil.doSendKeys(comments,txt);
    }
    public void clickDeleteButton()
    {
        eleUtil.doClick(deletebutton);
    }
}
