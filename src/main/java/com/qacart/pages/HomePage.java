package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".logo_text")
    WebElement homeLogo;

    @FindBy(css = "[title=\"Contacts\"]")
    WebElement menuContact;

    public void isLogoDisplayed(){
        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(homeLogo.isDisplayed());
    }

    public ContactsPage clickcontactButton(){
        driver.switchTo().frame("mainpanel");
        menuContact.click();
        return new ContactsPage();
    }

}
