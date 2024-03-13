package com.juantesting.pages.theinternet.login;

import com.juantesting.pages.BasePage;
import com.juantesting.pages.theinternet.secure.SecureAreaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By submitButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String strUserName){
        sendKeys(userNameField, strUserName);
    }

    public void setPassword(String strPassword){
        sendKeys(passwordField, strPassword);
    }

    public SecureAreaPage clickLoginButton (){
        clickOn(submitButton);
        return new SecureAreaPage(getDriver());
    }
}
