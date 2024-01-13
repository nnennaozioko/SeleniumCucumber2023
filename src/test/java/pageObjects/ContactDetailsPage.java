package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementUtil;

public class ContactDetailsPage {
    public WebDriver driver;
    public ElementUtil eleUtil;
    public ContactDetailsPage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }
    By contactdetailslink= By.xpath("//span[text()='Contact details']");
    By phonenumber= By.xpath("//div[@class='tu-placeholderholder']//input[@name='contact_info[phone]']");
   // By phonenumber= By.className("tu-placeholderholder");
public void doClickContactDetailsLink()
{
    eleUtil.doClick(contactdetailslink);
}
public void enterPhoneNumber(String phno)
{ //eleUtil.doClick(phonenumber);
    eleUtil.doSendKeys(phonenumber, phno);
}

}
