package pageObjects;

import Hooks.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ElementUtil;

import java.time.Duration;

public class LoginPage  {
    public WebDriver driver;
    public ElementUtil eleUtil;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }
By loginlink= By.linkText("Login");
    By Username= By.name("login[email]");
    By PopupMessage= By.id("tuturn-modal-popup");
    By password = By.id("tu-passwordinput");
   By Invalidmessage= By.xpath("//span[text()='Oops!']");
   By UserPassword= By.name("login[password]");

    public void clickLoginlink()
    {
        eleUtil.doClick(loginlink);
    }
    public void clickSubmitButton()
    {
     String csspath="div .form-group a";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);
    }
    public void enterUsername(String username)
    {
        eleUtil.doSendKeys(Username, username);
    }
    public boolean verifyMessagedisplayed()
    {
       return driver.findElement(PopupMessage).isDisplayed();
    }
    public  ContactDetailsPage doLogin(String un, String pwd)
    {
        System.out.println("login with :"+un+"and"+pwd);
        eleUtil.doSendKeys(Username,un);
        eleUtil.doSendKeys(password,pwd);
        String csspath="div .form-group a";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);
        return new ContactDetailsPage(driver);

    }
    public boolean InvalidText()
    {
 WebDriverWait wait=  new WebDriverWait(driver, Duration.ofSeconds(40));
 wait.until(ExpectedConditions.visibilityOfElementLocated(Invalidmessage));
String text=driver.findElement(Invalidmessage).getText();
if(text.equalsIgnoreCase("Oops!"))
{
    return true;
}
else {
    return false;
}
    }
    public void Userpassword(String txt)
    {
        eleUtil.doSendKeys(UserPassword, txt);
    }
}
