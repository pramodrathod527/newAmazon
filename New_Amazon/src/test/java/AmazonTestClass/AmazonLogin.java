package AmazonTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonHomePage;

public class AmazonLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		amazonHomePage.clickAccountAndList();
		
		

	}

}
