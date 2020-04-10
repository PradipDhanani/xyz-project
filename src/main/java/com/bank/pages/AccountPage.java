package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class AccountPage extends Utility {
    By depositLink = By.xpath("//button[contains(text(),'Deposit')]");
    By amountToBeDepositedLink = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@class='btn btn-default']");
    By getTextDepositSuccessful = By.xpath("//span[@class='error ng-binding']");
    By amountToBeWithdrawn = By.xpath("//input[@placeholder='amount']");
    By withdraw = By.xpath("//button[@class='btn btn-default']");
    By getTransactionText = By.xpath("//span[@class='error ng-binding']");
    By withdrawalLink = By.xpath("//button[contains(text(),'Withdrawl')]");



    public void clickOnDepositButton() {
        clickOnElement(depositLink);
    }

    public void enterAmountToDeposit() {
        sendTextToElement(amountToBeDepositedLink, "100");
    }

    public void clickDepositFeature() {
        clickOnElement(depositButton);
    }

    public String getTextDepositSuccessfulMessage() {
        return getTextFromElement(getTextDepositSuccessful);
    }

    public void clickOnWithdrawal() {
        clickOnElement(withdrawalLink);
    }

    public void clickOnAmountWithdrawalButton() {
        sendTextToElement(amountToBeWithdrawn, "50");
    }

    public void clickOnWithdrawFeature() {
        clickOnElement(withdraw);
    }

    public String getTextTransaction() {
        return getTextFromElement(getTransactionText);
    }

}
