package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.alerts.AlertPage;
import com.juantesting.pages.theinternet.home.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertsTest extends BaseTest {

    @Test
    public void acceptAlert() {
        HomePage homePage = new HomePage(getDriver());
        AlertPage alertsPage = homePage.clickOnAlertsJS();
        alertsPage.triggerAlert();
        alertsPage.alertClickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "This words " +
                "are incorrect");
    }

    @Test
    public void getTextFromAlertTest() {
        HomePage homePage = new HomePage(getDriver());
        AlertPage alertsPage = homePage.clickOnAlertsJS();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.getAlertText(), "I am a JS Confirm", "This words " +
                "are incorrect");
        alertsPage.alertClickToDismiss();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "This words " +
                "are incorrect");
    }

    @Test
    public void sendTextToPromptConfirmAlertTest() {
        String strTextToSend = "Juan Miguel";
        HomePage homePage = new HomePage(getDriver());
        AlertPage alertsPage = homePage.clickOnAlertsJS();
        alertsPage.triggerPrompt();
        alertsPage.sendKeysToAlert(strTextToSend);
        alertsPage.alertClickToAccept();
        assertTrue(alertsPage.getResult().contains(strTextToSend), "Incorrect message");
    }

    @Test
    public void sendTextToPromptDismissAlertTest() {
        String strTextToSend = "Juan Miguel";
        HomePage homePage = new HomePage(getDriver());
        AlertPage alertsPage = homePage.clickOnAlertsJS();
        alertsPage.triggerPrompt();
        alertsPage.sendKeysToAlert(strTextToSend);
        alertsPage.alertClickToDismiss();
        assertEquals(alertsPage.getResult(), "You entered: null", "Expected null in the message");
    }

}
