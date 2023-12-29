package Hooks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {

    public static WebDriver driver;
    //public ElementUtil elementUtil;

    //public ChromeOptions options;

 public void BrowserSetup(String Browser){
    if(Browser.equalsIgnoreCase("Firefox")){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    else if(Browser.equalsIgnoreCase("chrome")){
       WebDriverManager.chromedriver().setup();
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\eddan\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
 }

 public  void close(){
        driver.close();

 }

}
