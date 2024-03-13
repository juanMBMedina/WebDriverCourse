package com.juantesting.pages.theinternet.forgot;

import com.juantesting.pages.BasePage;
import com.juantesting.pages.theinternet.error.ErrorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPage extends BasePage {

    private final By emailField = By.id("email");
    private final By submitButton = By.id("form_submit");

    public ForgotPassPage(WebDriver driver) {
        super(driver);
    }

    public ErrorPage sendEmail(String mail) {
        sendKeys(emailField, mail);
        clickOn(submitButton);
        return new ErrorPage(getDriver());
    }
}
