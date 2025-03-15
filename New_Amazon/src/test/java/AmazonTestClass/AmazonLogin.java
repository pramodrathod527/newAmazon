package AmazonTestClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pomClasses.AmazonHomePage;
import utility.BrowserInitialization;

public class AmazonLogin {

    WebDriver driver;

    @BeforeMethod
    @Parameters({ "browser", "version", "platform" })
    public void browser_setup(String br, String vr, String pf) throws MalformedURLException {
        BrowserInitialization setup = new BrowserInitialization();
        driver = setup.browserInitialize(br, vr, pf);  // ✅ Correctly assign driver
    }

    @Test
    public void amazon_login() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");

        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.clickAccountAndList();

        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
