package pomClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement accountAndList;
	
	@FindBy(xpath="//span[text()='Sign in'][1]")
	private WebElement signInButton;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchProduct;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchLogo;
	
	
	
	
	
	
	
	
	
	private Actions action;

	private WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action = new Actions(driver);	
	}
	
	public void clickAccountAndList() {
		action.moveToElement(accountAndList).click(signInButton).build().perform();
	}
	
	public void searchProduct() {
		searchProduct.sendKeys("laptop");
		searchLogo.click();
	}
	
	
	public void Screenshot() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver; 
		
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formate = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		
		Date date = new Date();
		
		String currentDate = formate.format(date);
		
		File dest = new File("F:\\ScreenshotBySelenium\\image"+currentDate+".jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
		
	}
	

}
