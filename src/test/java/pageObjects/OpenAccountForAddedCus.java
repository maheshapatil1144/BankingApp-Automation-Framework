package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountForAddedCus extends BasePage{

	public OpenAccountForAddedCus(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement btnCustName;
	
	@FindBy(xpath = "//select[@id='currency']")
	WebElement btnCurr;
	
	@FindBy(xpath = "//button[normalize-space()='Process']")
	WebElement btnProcess;
	

	public void selectCusName(String customername) 
	{
		Select sc = new Select(btnCustName);
		sc.selectByContainsVisibleText(customername);
	}
	public void selectCurrency(String currency) 
	{
		Select sc = new Select(btnCurr);
		sc.selectByContainsVisibleText(currency);
	}
	
	public void ClickProcess()
	{
		btnProcess.click();
		 // Handle alert and extract customer ID
	    String alertText = driver.switchTo().alert().getText(); // Get full alert message
	    System.out.println("Full Alert Message: " + alertText);

	    // Extract customer ID from message
	    String customerAccNu = alertText.replaceAll("[^0-9]", ""); // Removes all non-numeric characters
	    System.out.println("Extracted Account Number: " + customerAccNu);

	    driver.switchTo().alert().accept(); // Close the alert
	}

}
