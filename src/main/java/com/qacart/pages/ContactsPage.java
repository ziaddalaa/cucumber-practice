package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends Base {

    public ContactsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "cs_email")
    WebElement emailTextField;

    @FindBy(css = "[value=\"New Contact\"]")
    WebElement newContactButton;

    @FindBy(id = "first_name")
    WebElement firstNameField;

    @FindBy(id = "surname")
    WebElement lastNameField;

    @FindBy(css = "[value=\"Save\"]")
    WebElement saveButton;

    @FindBy(css = "[value=\"Previous\"]")
    WebElement previousButton;

    public void isEmailFieldVisible(){
        Assert.assertTrue(emailTextField.isDisplayed());
    }

    public void clickOnNewContactButton(){
        newContactButton.click();
    }

    public void enterData(String firstname, String lastname){
        firstNameField.sendKeys(firstname);
        lastNameField.sendKeys(lastname);
    }

    public void clickOnSave(){
        saveButton.click();
    }

    public void isContactAdded(){
        Assert.assertTrue(previousButton.isDisplayed());
    }

}
