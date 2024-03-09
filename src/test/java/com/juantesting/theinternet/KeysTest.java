package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.HomePage;
import com.juantesting.pages.theinternet.KeyPressPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace() {
        HomePage homePage = new HomePage(getDriver());
        KeyPressPage keyPage = homePage.clickOnKeyPress();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE","This is not entry text");
    }

    @Test
    public void testBetha() {
        HomePage homePage = new HomePage(getDriver());
        KeyPressPage keyPage = homePage.clickOnKeyPress();
        keyPage.enterBetha();
        assertEquals(keyPage.getResult(), "You entered: ß","This is not entry text");
    }

}
