package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ElementUtil;

public class MentorProfilePage {
    public WebDriver driver;
    public ElementUtil eleUtil;
    public MentorProfilePage(WebDriver driver) {

        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }
   // By Gender = By.xpath("//select[@name='gender']");
    By Gender= By.name("gender");
    By Hourlyrate =By.name("hourly_rate");
    By tagline = By.name("tagline");
    By country = By.id("tu_country");
    By address = By.xpath("//input[@name='address']");
    By Postcode=By.xpath("//input[@name='zipcode']");
    By Languages= By.xpath("//select[@name='languages']");
    By onlineCheckbox= By.xpath("//div[@class='tu-check tu-checksm']");
    // By briefIntro= By.xpath("//iframe[@id='profile_introduction_ifr']");
    By briefIntro=By.xpath("//div[@id='mceu_31']//iframe[@id='profile_introduction_ifr']");
    By UploadPhoto= By.xpath("//div[@class='tu-uploadinfo']//a[@id='profile-avatar']");
    //By savebutton= By.xpath("//div[@class='tu-btnarea-two']//a");
  //  By saveUpdateButton= By.className("tu-primbtn-lg tu-save-settings");

    public void selectGender() {
      //  driver.findElement(By.xpath("//span[@id='select2-gender-gc-container']")).click();
        eleUtil.doSelectDropDownByVisibleText(Gender,"Male");

        // eleUtil.doSelectDropDownByVisibleText(Gender, "Male");



    }

    public void EnterHourlyrate(String x) {
        eleUtil.doSendKeys(Hourlyrate, x);
     //   driver.findElement(Hourlyrate).sendKeys(x);
    }

    public void AddTagline(String x) {
        eleUtil.doSendKeys(tagline, x);
    }

    public void selectCountry() {

        eleUtil.doSelectDropDownByVisibleText(country, "United Kingdom (UK)");
    }

    public void EnterAddress(String x) {
        eleUtil.doSendKeys(address, x);
    }

    public void EnterPostcode(String x) {
        eleUtil.doSendKeys(Postcode,x);
    }
    public void SelectLanguage(String x)
    {
        eleUtil.doSelectDropDownByVisibleText(Languages,x);
    }
    public void SelectOnlineCheckbox()
    {
        Actions action= new Actions(driver);
        action.click(driver.findElement(onlineCheckbox)).build().perform();
    }
    public void WriteBriefIntro(String x)
    {
        WebElement element= driver.findElement(briefIntro);
        driver.switchTo().frame(element);
        driver.findElement(By.id("tinymce")).sendKeys(x);
//       driver.switchTo().parentFrame();
       driver.switchTo().defaultContent();
    }
    public void UploadPhoto(String x)
    { String csspath="div.tu-uploadinfo a";
        ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);

        //  driver.findElement(UploadPhoto).click();
    }
    public void clickSaveandUpdate()
    {  String csspath= "div.tu-btnarea-two a";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
       // eleUtil.doActionsCick(savebutton);
        ((JavascriptExecutor)driver).executeScript("document.querySelector(arguments[0],':before').click();",csspath);


    }

}

