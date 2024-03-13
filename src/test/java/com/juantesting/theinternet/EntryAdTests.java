package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.entry.EntryAdPage;
import com.juantesting.pages.theinternet.home.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EntryAdTests extends BaseTest {

    @Test
    public void titleAdSuccessfulTest() {
        HomePage homePage = new HomePage(getDriver());
        EntryAdPage entryPage = homePage.clickOnEntryAd();
        assertEquals(entryPage.getTextAdd(), "THIS IS A MODAL WINDOW");

    }
}
