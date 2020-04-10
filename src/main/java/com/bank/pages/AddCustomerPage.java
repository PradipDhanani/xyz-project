package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class AddCustomerPage extends Utility {
    By firstNameLink = By.xpath("//input[@placeholder='First Name']");
    By lastNameLink = By.xpath("//input[@placeholder='Last Name']");
    By postCodeLink = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@class='btn btn-default']");


    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameLink, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameLink, lastName);
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeLink, postcode);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

}
