package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class BankManagerLoginPage extends Utility {
    By addCustomerLink = By.xpath("//button[contains(text(),'Add Customer')]");

    public void clickOnAddCustomerFeature() {
        clickOnElement(addCustomerLink);
    }
}
