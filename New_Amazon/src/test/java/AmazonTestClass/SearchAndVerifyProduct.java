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
		
		driver.get("https://www.amazon.in/s?i=apparel&bbn=29945467031&rh=n%3A1571271031%2Cn%3A1953602031%2Cn%3A11400137031%2Cn%3A29945467031%2Cp_n_specials_match%3A21618256031%2Cp_85%3A10440599031%2Cp_n_feature_nineteen_browse-bin%3A11301357031&s=apparel&dc&ds=v1%3A%2BhVZPdaILyY6IoUQroogq80u3hsE0%2FFUKKfM3PNzT2c&_encoding=UTF8&content-id=amzn1.sym.74f25a9d-e850-443b-a26a-da459bed7e95&pd_rd_r=cda3fd18-1e34-4aca-be97-c1933cf7b862&pd_rd_w=P0mWS&pd_rd_wg=tC3KL&pf_rd_p=74f25a9d-e850-443b-a26a-da459bed7e95&pf_rd_r=72ANE7BVEQR4QHFXSGYE&qid=1668003576&rnid=11301356031&ref=pd_hp_d_atf_unk");
		
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		
//		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
//		
//		amazonHomePage.searchProduct();
		
		System.out.println("Product Searched!" + driver.getCurrentUrl());
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
