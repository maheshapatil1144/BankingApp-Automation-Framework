package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[normalize-space()='Customer Login']")
	WebElement lnkCustLog;

	@FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
	WebElement lnkBankManLog;
	
	@FindBy(xpath = "//button[normalize-space()='Home']")
	WebElement lnkHome;
	
	

	public void clickCustomerLogin() {
		lnkCustLog.click();

	}

	public void clickBankManagerLogin() {
		lnkBankManLog.click();
	}
	
	public void clickHome() {
		lnkHome.click();
	}

}
