package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerSearchPage extends BasePage{

	public CustomerSearchPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	WebElement btnCustName;
	
	
	@FindBy(xpath = "//button[normalize-space()='Delete']")
	WebElement deleteCust;
	
	
	public void searchAddedCus()
	{
		btnCustName.sendKeys("Sample");
	}
	
	public void deleteAddedCus()
	{
		deleteCust.click();
	}
	
	

}
