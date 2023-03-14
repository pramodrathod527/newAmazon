package AmazonTestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonHomePage;

public class SearchAndVerifyProduct {

	public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		amazonHomePage.searchProduct();
//		Thread.sleep(2000);
//		amazonHomePage.Screenshot();

	}

}
