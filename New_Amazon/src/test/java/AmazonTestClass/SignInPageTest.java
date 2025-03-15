package AmazonTestClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.AmazonHomePage;
import pomClasses.SignInPage;
import utility.BrowserInitialization;

public class SignInPageTest {
	
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({ "browser", "version", "platform" })
	public void browser_setup(String br, String vr, String pf) throws MalformedURLException {
		BrowserInitialization setup = new BrowserInitialization();
		 driver = setup.browserInitialize(br, vr, pf);
	}

	@Test
	public void signIn() {
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);

		amazonHomePage.clickAccountAndList();
//		amazonHomePage.Screenshot();

		SignInPage signInPage = new SignInPage(driver);

		signInPage.signIn();
//		signInPage.createAccount();

	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
