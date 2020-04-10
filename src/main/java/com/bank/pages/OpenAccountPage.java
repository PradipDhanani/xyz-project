package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class OpenAccountPage extends Utility {
    By openAccountLink = By.xpath("//button[contains(text(),'Open Account')]");
    By customerLink = By.xpath("//select[@id='userSelect']");
    By selectCustomerName = By.xpath("//option[contains(text(),'Hermoine Granger')]");
    By currencyLink = By.id("currency");
    By currencyPound = By.xpath("//option[contains(text(),'Pound')]");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");



    public void clickOnOpenAccountButton() {
        clickOnElement(openAccountLink);
    }

    public void clickOnCustomerName() {
        clickOnElement(customerLink);
    }

    public void selectCustomerFirstName() {
        clickOnElement(selectCustomerName);
    }

    public void clickOnCurrencyButton() {
        clickOnElement(currencyLink);
    }

    public void selectCurrencyPound() {
        clickOnElement(currencyPound);
    }

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcess);
    }


}
