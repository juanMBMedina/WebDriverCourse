package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorPage extends BasePage {

    public final By headerLoc = By.tagName("h1");

    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText(){
        return getTextFrom(headerLoc);
    }

}
