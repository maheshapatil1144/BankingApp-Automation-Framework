package testCases;

import org.testng.annotations.Test;

import pageObjects.CustAccount;
import pageObjects.CustLoginPage;
import pageObjects.HomePage;
import pageObjects.TransactionPage;
import testBase.BaseClass;

public class TC001_CustomerTransactionTest extends BaseClass {

	@Test(priority = 1)
	public void customer_login() {
		HomePage hp = new HomePage(getDriver());
		hp.clickCustomerLogin();

	}

	@Test(priority = 2)
	public void customer_deposit() throws InterruptedException {
		CustLoginPage clp = new CustLoginPage(getDriver());
//		clp.selectCusName("Test September");
		clp.selectCusName("Harry Potter");
		clp.clickCustLogin();

		CustAccount cusAcc = new CustAccount(getDriver());
		cusAcc.clickCustDeposit(); // Deposit 100 rupees
		Thread.sleep(2500);
		cusAcc.clickCustTrans();

		TransactionPage cusAccVeriTran = new TransactionPage(getDriver());
		if (cusAccVeriTran.verifyLatestTransaction("100", "Credit")) // if true then test cases
		{
			System.out.println("Your Deposit Transaction is verifyed succefully");
		}
//		cusAccVeriTran.ClickresetFromTrans();
		cusAccVeriTran.ClickbackFromTrans();
//		cusAccVeriTran.Clicklogout();
	}

	@Test(priority = 3)
	public void customer_withdrow() throws InterruptedException {
//		CustLoginPage clp= new CustLoginPage(driver);
////		clp.selectCusName("Test September");
//		clp.selectCusName("Harry Potter");
//		clp.clickCustLogin();

		CustAccount cusAcc = new CustAccount(getDriver());
		cusAcc.clickCustWithdraw();
		Thread.sleep(2500);
		cusAcc.clickCustTrans();
//		Thread.sleep(2500);
		TransactionPage cusAccVeriTran = new TransactionPage(getDriver());
		if (cusAccVeriTran.verifyLatestTransaction("10", "Debit")) // if true then test cases
		{
			System.out.println("Your Withdraw Transaction is verifyed succefully");
		}
		cusAccVeriTran.ClickbackFromTrans();
		cusAccVeriTran.Clicklogout();
		HomePage hp = new HomePage(getDriver());
		hp.clickHome();
	}
}
