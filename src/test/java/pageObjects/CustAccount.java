package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustAccount extends BasePage
{

	public CustAccount(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath ="//button[normalize-space()='Transactions']")
	WebElement Cus_Trans;
	

	//Deposit flow
	@FindBy(xpath = "//button[normalize-space()='Deposit']")
	WebElement Cus_Deposit;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement depoAmount;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement depoButton;
	
	//Withdrow Flow
	@FindBy(xpath = "//button[normalize-space()='Withdrawl']")
	WebElement Cus_Withdraw;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement withDrwaAmount;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement withDrawButton;

	public void clickCustTrans() {
		Cus_Trans.click();
		
	}
	
	public void clickCustDeposit() {
		Cus_Deposit.click();
		depoAmount.sendKeys("100");
		depoButton.click();
	}
	
	public void clickCustWithdraw() {
		Cus_Withdraw.click();
		withDrwaAmount.sendKeys("10");
		withDrawButton.click();
	}
	
}
