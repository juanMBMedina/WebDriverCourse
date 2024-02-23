package com.juantesting.pages;

import static com.juantesting.utils.Utils.getTextFrom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends PageObject {

    private final By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        return getTextFrom(getDriver(), statusAlert);
    }

}
