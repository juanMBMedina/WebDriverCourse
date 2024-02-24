package com.juantesting.pages.formy;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksPage extends BasePage {

    private final By successfulText = By.cssSelector("div[role='alert']");

    public ThanksPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessfulText(){
        return getTextFrom(successfulText);
    }
}
