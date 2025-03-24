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

		driver.get("https://www.amazon.in/FUNKY-MONKEY-Womens-Sweatshirt-WM_ZPR_Black_M/dp/B0B6T4G1K6/ref=sr_1_5?_encoding=UTF8&content-id=amzn1.sym.74f25a9d-e850-443b-a26a-da459bed7e95&dib=eyJ2IjoiMSJ9.QOaKHFN4zi23-9g7N4HYNsE6b1l0ryuDlk8Kz2gs1NlEcgOAR3BVAkiW6iZDDGerUDVJftyjGHxoCG9c47F3FIYtstYfpEKdHK4VwN-YYnno2Gc7GKw4ofsgsK7iZ_pvXIg4MymhFI9ZvOwgR_7REJzixKi102153uwUBPTD3ylW_toiZC2UAtvvUZY72WWyvnbIsbINZ-0u4bcooH2J43YPBgGkEle-6VZPENgGRpcFyZxKaRKC9ffgrDuaUHgOHMiotNb3Ctws-6PNXs84eolD64OBxWGQWAw53g0flMqHq_P9J1YPF2F8V4_ETahNV9mEE8kp7wpvnayhGHVNxpzfxNAlSR_JDS0WPCot38mh3HyYZZsc5p_RTY7ZMAGma9qdjRBE_cIkmlPFWI7gbXn-XOvQvoAUaPG0IUgaV6fuLnx9jfnWxKKmE6DIsBi9.9Xtd-bsaQTiGWddrr1jUSDERGlQ3l9lfYOC2OgjdBoI&dib_tag=se&pd_rd_r=cda3fd18-1e34-4aca-be97-c1933cf7b862&pd_rd_w=P0mWS&pd_rd_wg=tC3KL&qid=1742809209&refinements=p_n_specials_match%3A21618256031%2Cp_85%3A10440599031%2Cp_n_feature_nineteen_browse-bin%3A11301357031&rnid=11301356031&rps=1&s=apparel&sr=1-5&th=1&psc=1");
		
		System.out.println("Sign in : "+ driver.getCurrentUrl());
//		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
//
//		amazonHomePage.clickAccountAndList();
////		amazonHomePage.Screenshot();
//
//		SignInPage signInPage = new SignInPage(driver);
//
//		signInPage.signIn();
//		signInPage.createAccount();

	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
