package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class TransactionPage extends BasePage {

    public TransactionPage(WebDriver driver) {
		super(driver);
	}

	// Locate all rows in the transaction table
    @FindBy(xpath = "//table[@class='table table-bordered table-striped']/tbody/tr")
    List<WebElement> transactionRows;

    
  //Transaction back button
  	@FindBy(xpath="//button[normalize-space()='Back']")
  	WebElement btn_Trans_back;
  	
  //Transaction Reset button
  	@FindBy(xpath="//button[normalize-space()='Reset']")
  	WebElement btn_Trans_reset;
  	  	
  	//Logout button
  	@FindBy(xpath="//button[normalize-space()='Logout']")
  	WebElement btn_Logout;
  	
    
    // Method to verify latest transaction
    public boolean verifyLatestTransaction(String expectedAmount, String expectedType) {
        if (transactionRows.size() == 0) {
            System.out.println("No transactions found.");
            return false;
        }

        // Get the first row (latest transaction)
        WebElement latestRow = transactionRows.get(transactionRows.size()-1);

        // Get all columns in the row
        List<WebElement> columns = latestRow.findElements(By.tagName("td"));
        
        String actualAmount = columns.get(1).getText().trim(); // Amount column
        String actualType = columns.get(2).getText().trim();   // Transaction Type column

        System.out.println("Latest Transaction - Amount: " + actualAmount + ", Type: " + actualType);

        // Compare with expected values
        return actualAmount.equals(expectedAmount) && actualType.equalsIgnoreCase(expectedType);
    }
    public void ClickbackFromTrans()
	{
		btn_Trans_back.click();
	}
    
    public void ClickresetFromTrans()
   	{
    	btn_Trans_reset.click();
   	}
       
    
    public void Clicklogout()
   	{
    	btn_Logout.click();
   	}
    
    
}
