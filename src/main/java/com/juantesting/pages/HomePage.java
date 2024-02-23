package com.juantesting.pages;

import static com.juantesting.utils.Utils.clickOn;

import com.juantesting.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final String PRINCIPAL_URL = "https://the-internet.herokuapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        Utils.goTo(getDriver(), PRINCIPAL_URL);
    }

    public LoginPage clickFormAuthentication() {
        clickOn(getDriver(), formAuthenticationLink);
        return new LoginPage(getDriver());
    }

}
