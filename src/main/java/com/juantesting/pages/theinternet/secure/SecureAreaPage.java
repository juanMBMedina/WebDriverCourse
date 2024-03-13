package com.juantesting.pages.theinternet.secure;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private final By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        return getTextFrom(statusAlert);
    }

}
