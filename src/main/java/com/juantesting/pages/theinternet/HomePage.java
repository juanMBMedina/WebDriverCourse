package com.juantesting.pages.theinternet;


import com.juantesting.pages.BaseHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.juantesting.constants.Constants.TIME_OUT_MILLISECONDS;

public class HomePage extends BaseHomePage {

    protected final String PRINCIPAL_URL = "https://the-internet.herokuapp.com/";
    private final By formAuthenticationLink = By.linkText("Form Authentication");
    private final By dropDownLink = By.linkText("Dropdown");
    private final By forgotPasswordLink = By.linkText("Forgot Password");
    private final By hoversLink = By.linkText("Hovers");
    private final By keyPressesLink = By.linkText("Key Presses");
    private final By horizontalSliderLink = By.linkText("Horizontal Slider");
    private final By alertsLink = By.linkText("JavaScript Alerts");
    private final By fileUploadLink = By.linkText("File Upload");
    private final By entryAdLink = By.linkText("Entry Ad");

    public HomePage(WebDriver driver) {
        super(driver);
        setStrUrl(PRINCIPAL_URL);
        openPage();
    }

    public LoginPage clickFormAuthentication() {
        clickOn(formAuthenticationLink);
        return new LoginPage(getDriver());
    }

    public DropDownPage clickDropDown() {
        clickOn(dropDownLink);
        return new DropDownPage(getDriver());
    }

    public ForgotPassPage clickForgotPass() {
        clickOn(forgotPasswordLink);
        return new ForgotPassPage(getDriver());
    }

    public HoversPage clickOnHovers() {
        clickOn(hoversLink);
        return new HoversPage(getDriver());
    }

    public KeyPressPage clickOnKeyPress() {
        clickOn(keyPressesLink);
        return new KeyPressPage(getDriver());
    }

    public HorizontalSliderPage clickOnHorizontalSlider() {
        clickOn(horizontalSliderLink);
        return new HorizontalSliderPage(getDriver());
    }

    public AlertPage clickOnAlertsJS() {
        clickOn(alertsLink);
        return new AlertPage(getDriver());
    }

    public UploadFilePage clickOnFileUpload() {
        clickOn(fileUploadLink);
        return new UploadFilePage(getDriver());
    }

    public EntryAdPage clickOnEntryAd(){
        clickOn(entryAdLink);
        return new EntryAdPage(getDriver());
    }
}
