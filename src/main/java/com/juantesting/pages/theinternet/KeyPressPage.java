package com.juantesting.pages.theinternet;


import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {

    private final By inputField = By.id("target");
    private final By resultText = By.id("result");

    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String strText) {
        sendKeys(inputField, strText);
    }

    public String getResult(){
        return getTextFrom(resultText);
    }

    public void enterBetha(){
        enterText(Keys.chord(Keys.ALT, "225"));
    }

}
