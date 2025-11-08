package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagerAccount extends BasePage
{

	public ManagerAccount(WebDriver driver) 
	{
		super(driver);
	}
	
	//Add a Customer 
	@FindBy(xpath="//button[normalize-space()='Add Customer']")
	WebElement btnAddCust;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement txtPostCode;
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnAddCustomer;
	
	
	
	@FindBy(xpath="//button[normalize-space()='Open Account']")
	WebElement btnOpenAcc;
	
	@FindBy(xpath="//button[normalize-space()='Customers']")
	WebElement btnCustomer;
	
	 public void ClickAddCust()
	   	{
		 btnAddCust.click();
		 txtFirstname.sendKeys("Sample");
		 txtLastname.sendKeys("Customer");
		 txtPostCode.sendKeys("1414");
		 btnAddCustomer.click();
		 
	    // Handle alert and extract customer ID
	    String alertText = driver.switchTo().alert().getText(); // Get full alert message
	    System.out.println("Full Alert Message: " + alertText);

	    // Extract customer ID from message
	    String customerId = alertText.replaceAll("[^0-9]", ""); // Removes all non-numeric characters
	    System.out.println("Extracted Customer ID: " + customerId);

	    driver.switchTo().alert().accept(); // Close the alert		 
	   	}
	 
	 public void ClickOpenAcc()
	   	{
		 btnOpenAcc.click();
		 
	   	}
	 
	 public void ClickCustomer()
	   	{
		 btnCustomer.click();
	   	}

}
