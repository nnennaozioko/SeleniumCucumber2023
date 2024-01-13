package Hooks;


import com.qa.Opencart.Utils.OptionsManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserDriver {

    public static WebDriver driver;
    public Properties prop;
    public OptionsManager op;
    public static String highlight;

    public WebDriver BrowserSetup(Properties prop) {

        highlight= prop.getProperty("highlight");
        String Browser= prop.getProperty("browser");
        op= new OptionsManager(prop);
        if (Browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (Browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(op.getChromeOptions());
            driver.manage().window().maximize();

        }
return driver;

    }
    public Properties initProperties()
    {  prop= new Properties();
        FileInputStream ip;

        try {
             ip= new FileInputStream("C:\\Users\\eddan\\IdeaProjects\\SeleniumCucumber2023Selenium\\src\\test\\resources\\ConfigFile");
             prop.load(ip);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}







