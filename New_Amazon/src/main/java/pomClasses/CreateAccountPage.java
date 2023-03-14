package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	private WebElement firstNameAndLastName; 
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	private WebElement mobileNumber; 
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password; 
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	
	WebDriver driver;
	
	
	public CreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void SendCredentialToCreateAccountPage() {
		firstNameAndLastName.sendKeys("Pramod Rathod");
		mobileNumber.sendKeys("9322094148");
		email.sendKeys("pramodrathod525@gmail.com");
		password.sendKeys("rowdy@9168");
		continueButton.click();
	}

}
