package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "[value=\"Login\"]")
    WebElement loginButton;

    public HomePage performLogin(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
        return new HomePage();
    }

    public void errorMessage(){
        Assert.assertTrue(username.isDisplayed());
    }



}
