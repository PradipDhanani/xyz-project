package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class HomePage extends Utility {
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");


    public void clickOnBankManagerLoginButton() {
        clickOnElement(bankManagerLoginLink);
    }

    public void clickOnCustomerLoginButton() {
        clickOnElement(customerLogin);
    }


}
