package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

  public  WebDriver driver;

    //public WebDriver driver;

 // public BasePage(WebDriver driver)
  //{
      //this.driver=driver;
  //}
@Before
public WebDriver BrowserSetup(){
   // WebDriverManager.chromedriver().setup();
   // driver= new ChromeDriver();
    WebDriverManager.firefoxdriver().setup();
    driver= new FirefoxDriver();
    driver.manage().window().maximize();
    //driver.navigate().to("https://mentorskid.com");
    return driver;
}
//
 // public void goToUrl()
//   {
//       String url = "https://mentorskid.com";
       //String url = "https://prepmajor.com";
     //driver.get(url);
 //}

@After
    public void TearDown(){
    driver.close();
}
}
