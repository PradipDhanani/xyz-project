package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Pradip
 */
public class BankTest extends TestBase {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage = new AccountPage();

    /*
    1.bankManagerShouldAddCustomerSuccessfully.
        click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.
     */
    @Test
    public void verifyBankManagerShouldAddCustomerSuccessfully() {

        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerFeature();
        addCustomerPage.enterFirstName("Hermoine");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostCode("E859AC");
        addCustomerPage.clickOnAddCustomerButton();

        Alert alert = driver.switchTo().alert();
        String expectedResult = "Customer added successfully";
        String actualResult = alert.getText();
        Assert.assertTrue(actualResult.contains("Customer added successfully"), expectedResult);
        alert.accept();

    }/*
    2. bankManagerShouldOpenAccountSuccessfully.
	click On "Bank Manager Login" Tab
	click On "Open Account" Tab
	Search customer that created in first test
	Select currency "Pound"
	click on "process" button
	popup displayed
	verify message "Account created successfully"
	click on "ok" button on popup.
    */

    @Test
    public void verifyBankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginButton();
        openAccountPage.clickOnOpenAccountButton();
        openAccountPage.clickOnCustomerName();
        openAccountPage.selectCustomerFirstName();
        openAccountPage.clickOnCurrencyButton();
        openAccountPage.selectCurrencyPound();
        openAccountPage.clickOnProcessButton();
        Alert alert = driver.switchTo().alert();
        String expectedResult = "Account created successfully";
        String actualResult = alert.getText();
        Assert.assertTrue(actualResult.contains("Account created successfully"), expectedResult);
        alert.accept();
    }

    /*
    3. customerShouldLoginAndLogoutSuceessfully.
        click on "Customer Login" Tab
          search customer that you created.
        click on "Login" Button
        verify "Logout" Tab displayed.
        click on "Logout"
        verify "Your Name" text displayed.
     */
    @Test
    public void verifyCustomerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        String expectedResult = "Logout";
        String actualResult = customerLoginPage.getLogoutFeature();
        Assert.assertEquals(expectedResult, actualResult);
        customerLoginPage.clickLogoutFeature();
        String expectedResult1 = "Your Name";
        String actualResult1 = customerPage.getYourNameMessage();
        Assert.assertTrue(actualResult1.contains("Your Name"), expectedResult1);


    }

    /*
    4. customerShouldDepositMoneySuccessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Deposit" Tab
	Enter amount 100
	click on "Deposit" Button
	verify message "Deposit Successful"
     */
    @Test
    public void verifyCustomerShouldDepositMoneySuccessfully() {

        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmountToDeposit();
        accountPage.clickDepositFeature();
        String expectedResult = "Deposit Successful";
        String actualResult = accountPage.getTextDepositSuccessfulMessage();
        Assert.assertTrue(actualResult.contains("Deposit Successful"), expectedResult);
    }
/*
5. customerShouldWithdrawMoneySuccessfully
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Withdrawl" Tab
	Enter amount 50
	click on "Deposit" Button
	verify message "Transaction Successful"

 */

    @Test
    public void verifyCustomerShouldWithdrawMoneySuccessfully() {

        homePage.clickOnCustomerLoginButton();
        customerPage.clickOnYourName();
        customerPage.clickOnSelectName();
        customerPage.clickOnLoginButton();
        accountPage.clickOnWithdrawal();
        accountPage.clickOnAmountWithdrawalButton();
        accountPage.clickOnWithdrawFeature();
        String expectedResult = "Transaction successful";
        String actualResult = accountPage.getTextTransaction();
        Assert.assertEquals(expectedResult,actualResult);

    }
}