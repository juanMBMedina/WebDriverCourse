package com.juantesting.pages.theinternet.alerts;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage {

    private final By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private final By textAfterAlert = By.id("result");

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void triggerAlert() {
        clickOn(triggerAlertButton);
    }

    public void triggerConfirm() {
        clickOn(triggerConfirmButton);
    }

    public void triggerPrompt() {
        clickOn(triggerPromptButton);
    }

    public void alertClickToAccept() {
        confirmAlert();
    }

    public void alertClickToDismiss() {
        dismissAlert();
    }

    public void sendKeysToAlert(String strText) {
        writeInAlert(strText);
    }

    public String getAlertText() {
        return getTextOfAlert();
    }

    public String getResult() {
        if (isDisplayed(textAfterAlert)) {
            return getTextFrom(textAfterAlert);
        }
        return null;
    }

}
