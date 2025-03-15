package utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserInitialization {
    
    public static final String USERNAME = "oauth-pramodrathod436-38c38";
    public static final String ACCESS_KEY = "5ee95fbb-64dd-48c2-adae-b4370aad2b8a";
    public static final String SAUCE_URL = "https://" + USERNAME + ":" + ACCESS_KEY
            + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    public WebDriver browserInitialize(String br, String vr, String pf) throws MalformedURLException {
        WebDriver driver; // ✅ Define driver locally

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", br);  
        cap.setCapability("browserVersion", vr);
        cap.setCapability("platformName", pf);

        driver = new RemoteWebDriver(new URL(SAUCE_URL), cap); // ✅ Correct initialization

        return driver;  // ✅ Return driver instance
    }
}
