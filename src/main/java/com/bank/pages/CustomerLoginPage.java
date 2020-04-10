package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class CustomerLoginPage extends Utility {
    By getLogoutButton = By.xpath("//button[@class='btn logout']");
    By clickLogoutButton = By.xpath("//button[@class='btn logout']");


    public String getLogoutFeature() {
        return getTextFromElement(getLogoutButton);
    }

    public void clickLogoutFeature() {
        clickOnElement(clickLogoutButton);
    }
}
