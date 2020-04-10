package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class CustomerPage extends Utility {
    By yourNameLink = By.id("userSelect");
    By selectNameFromList = By.xpath("//option[contains(text(),'Hermoine Granger')]");
    By loginButton = By.xpath("//button[@class='btn btn-default']");
    By getYourNameText = By.xpath("//label[contains(text(),'Your Name :')]");


    public void clickOnYourName() {
        clickOnElement(yourNameLink);
    }

    public void clickOnSelectName() {
        clickOnElement(selectNameFromList);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getYourNameMessage() {
        return getTextFromElement(getYourNameText);

    }
}
