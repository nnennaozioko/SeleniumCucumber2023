package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.MentorRegistrationPage;
import utilities.ElementUtil;


public class BasePage {


  public static WebDriver driver;
 // public ElementUtil elementUtil;

// public static ChromeOptions options;
public BrowserDriver BDriver;


@Before
public void setup(){

   BDriver = new BrowserDriver();
   BDriver.BrowserSetup("chrome");

}

@After
    public void TearDown(){

      //driver.close();
}
}
