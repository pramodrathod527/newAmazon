package AmazonTestClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sauce_Labs {

	WebDriver driver;
	 
	public static final String USERNAME = "oauth-pramodrathod528-81216";
	public static final String ACCESS_KEY = "cf557b69-5549-44f2-9171-cdb8fb924f85";
	public static final String SAUCE_URL = "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	

	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({ "browser", "version", "platform" })
	public void setUp(String br, String vr, String pf) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browser_name", br);
		cap.setCapability("version", vr);
		cap.setCapability("platform", pf);
		
		
		driver = new RemoteWebDriver(new URL(SAUCE_URL),cap);
	}
	
	 @Test
	    public void sampleTest() {
	        driver.get("https://www.google.com");
	        System.out.println("Page title: " + driver.getTitle());
	        driver.quit();
	    }

}
