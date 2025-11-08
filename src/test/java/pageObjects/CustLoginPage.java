package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustLoginPage extends BasePage {

	public CustLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="//select[@id='userSelect']")
	WebElement Cus_dropdown;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnCustLogin;

	public void selectCusName(String customername) {
		Select sc = new Select(Cus_dropdown);
		sc.selectByContainsVisibleText(customername);
	}

	public void clickCustLogin() {
		btnCustLogin.click();
	}

}
