package AmazonTestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonHomePage;
import pomClasses.SignInPage;

public class SignInPageTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		amazonHomePage.clickAccountAndList();
//		amazonHomePage.Screenshot();
		
		
		
		SignInPage signInPage = new SignInPage(driver);
		
//		signInPage.signIn();
//		signInPage.createAccount();
		

	}

}
