package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.juantesting.constants.Constants.TIME_OUT_MILLISECONDS;

public class EntryAdPage extends BasePage {

    private final By titleMssg = By.cssSelector("div.modal-title h3");

    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    public String getTextAdd(){
        getWait(5).until(d -> findElement(titleMssg).isDisplayed());
        return getTextFrom(titleMssg);
    }

}
