package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement emailOrMobileNumber;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	private WebElement createAccountButton;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	
	
	
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void signIn() {
		emailOrMobileNumber.sendKeys("9168729713");
		continueButton.click();
		password.sendKeys("Pramod@123");
		signInButton.click();
	}
	
	public void createAccount() {
		createAccountButton.click();
	}
	
	
	
	
	
	
	

}
