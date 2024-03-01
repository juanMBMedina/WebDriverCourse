package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.ErrorPage;
import com.juantesting.pages.theinternet.ForgotPassPage;
import com.juantesting.pages.theinternet.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPasswordError() {
        String mssgError = "Internal Server";
        String email = "email@example.com";
        HomePage homePage = new HomePage(getDriver());
        ForgotPassPage forgotPassPage = homePage.clickForgotPass();
        ErrorPage errorPage = forgotPassPage.sendEmail(email);
        assertEquals(errorPage.getHeaderText(), mssgError, "Your page is running Ok");
    }

}
