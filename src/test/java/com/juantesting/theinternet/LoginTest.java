package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.home.HomePage;
import com.juantesting.pages.theinternet.login.LoginPage;
import com.juantesting.pages.theinternet.secure.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    protected HomePage homePage;

    @Test
    public void testSuccessfulLogin() {
        homePage = new HomePage(getDriver());
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");

    }
}
