package utilities;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Properties;

public class OptionManager {
    public Properties prop;
    public ChromeOptions co;
    public OptionManager(Properties prop)
    {
        this.prop= prop;
    }
    public ChromeOptions getChromeOptions()
    {
        co= new ChromeOptions();
        co.addArguments("remote-allow-origins=*");
        if(Boolean.parseBoolean(prop.getProperty("headless")))//true
        {
            co.addArguments("--headless");
            co.addArguments("--disable-gpu");
            co.addArguments("--window-size=1280,800");
            co.addArguments("--allow-insecure-localhost");

        }
        if(Boolean.parseBoolean(prop.getProperty("incognito")))

        {
            co.addArguments("--incognito");
        }
        return co;
    }
}
