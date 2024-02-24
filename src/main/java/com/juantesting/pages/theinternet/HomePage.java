package com.juantesting.pages.theinternet;


import com.juantesting.pages.BaseHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseHomePage {

    private final By formAuthenticationLink = By.linkText("Form Authentication");
    protected final String PRINCIPAL_URL = "https://the-internet.herokuapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        setStrUrl(PRINCIPAL_URL);
    }

    public LoginPage clickFormAuthentication() {
        clickOn(formAuthenticationLink);
        return new LoginPage(getDriver());
    }

}
