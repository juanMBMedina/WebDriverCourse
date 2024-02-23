package com.juantesting.pages;

import static com.juantesting.utils.Utils.sendKeys;
import static com.juantesting.utils.Utils.clickOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageObject {

    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By submitButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String strUserName){
        sendKeys(getDriver(), userNameField, strUserName);
    }

    public void setPassword(String strPassword){
        sendKeys(getDriver(), passwordField, strPassword);
    }

    public SecureAreaPage clickLoginButton (){
        clickOn(getDriver(), submitButton);
        return new SecureAreaPage(getDriver());
    }
}
