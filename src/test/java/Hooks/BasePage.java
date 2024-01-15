package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.LoginPage;
import pageObjects.MentorRegistrationPage;
import utilities.ElementUtil;

import java.util.Properties;


public class BasePage {


  public static WebDriver driver;
  public Properties prop;
 // public ElementUtil elementUtil;

// public static ChromeOptions options;
public BrowserDriver BDriver;



@Before
public void setup(){

   BDriver = new BrowserDriver();// it will create object for BrowserDriver
 prop=  BDriver.initProperties();
  driver= BDriver.BrowserSetup(prop);


}

@After
    public void TearDown(){

      //driver.close();
}
}
