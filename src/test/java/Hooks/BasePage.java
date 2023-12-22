package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ElementUtil;


public class BasePage {


  public static WebDriver driver;
 // public ElementUtil elementUtil;

// public static ChromeOptions options;
public BrowserDriver BDriver;


  @Before
public void setup(){

     // System.setProperty("webdriver.firefox.driver","C:\\Users\\Nelly\\IdeaProjects\\SeleniumAutomation2023\\src\\test\\resources\\driver/geckodriver.exe");
  //WebDriver driver = new FirefoxDriver();

//      driver = new FirefoxDriver();
//      driver.manage().window().maximize();
//      //driver.get("https://mentorskid.com");
//      elementUtil = new ElementUtil(driver);
   BDriver = new BrowserDriver();
   BDriver.BrowserSetup("FirefoxDriver");
}

@After
    public void TearDown(){
   driver.close();
}
}
