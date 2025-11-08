package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	
	//We need to creat only one time and call in all page object classes
	// Parent of all page object classes (reusable componenet of all page object class)
	//This will be invoked by every Page Object class construtor 
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
