package com.juantesting.pages.theinternet;


import com.juantesting.pages.BaseHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseHomePage {

    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By dropDownLink = By.linkText("Dropdown");
    private final By forgotPasswordLink = By.linkText("Forgot Password");
    private final By hoversLink = By.linkText("Hovers");

    protected final String PRINCIPAL_URL = "https://the-internet.herokuapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        setStrUrl(PRINCIPAL_URL);
        openPage();
    }

    public LoginPage clickFormAuthentication() {
        clickOn(formAuthenticationLink);
        return new LoginPage(getDriver());
    }

    public DropDownPage clickDropDown(){
        clickOn(dropDownLink);
        return new DropDownPage(getDriver());
    }

    public ForgotPassPage clickForgotPass(){
        clickOn(forgotPasswordLink);
        return new ForgotPassPage(getDriver());
    }

    public HoversPage clickOnHovers(){
        clickOn(hoversLink);
        return new HoversPage(getDriver());
    }
}
