package testCases;

import org.testng.annotations.Test;

import pageObjects.CustomerSearchPage;
import pageObjects.HomePage;
import pageObjects.ManagerAccount;
import pageObjects.OpenAccountForAddedCus;
import testBase.BaseClass;

public class TC002_BankManagerOperationsTest extends BaseClass {
	@Test(priority = 1)
	public void customer_Add() {
		HomePage hp = new HomePage(getDriver());
		hp.clickBankManagerLogin();

		ManagerAccount ManAcc = new ManagerAccount(getDriver());
		ManAcc.ClickAddCust();
	}

	@Test(priority = 2)
	public void customer_OpenAccount() {
		ManagerAccount ManAcc = new ManagerAccount(getDriver());
		ManAcc.ClickOpenAcc();

		OpenAccountForAddedCus openacc = new OpenAccountForAddedCus(getDriver());
		openacc.selectCusName("Sample Customer");
		openacc.selectCurrency("Dollar");
		openacc.ClickProcess();

	}

	@Test(priority = 3)
	public void cust_search_delete() throws InterruptedException {
		ManagerAccount ManAcc = new ManagerAccount(getDriver());
		ManAcc.ClickCustomer();

		Thread.sleep(2500);
		CustomerSearchPage csp = new CustomerSearchPage(getDriver());
		csp.searchAddedCus();
		Thread.sleep(2000);
		csp.deleteAddedCus();
		HomePage hp = new HomePage(getDriver());
		hp.clickHome();
	}

}
