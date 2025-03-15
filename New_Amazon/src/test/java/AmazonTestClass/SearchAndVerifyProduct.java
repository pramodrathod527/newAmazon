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
import utility.BrowserInitialization;

public class SearchAndVerifyProduct {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({ "browser", "version", "platform" })
	public void browser_setup(String br, String vr, String pf) throws MalformedURLException {
		BrowserInitialization setup = new BrowserInitialization();
		 driver = setup.browserInitialize(br, vr, pf);
	}

	@Test
	public void search_and_verify_product() {
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		amazonHomePage.searchProduct();
		
		System.out.println("Product Searched!");
//		Thread.sleep(2000);
//		amazonHomePage.Screenshot();

	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
