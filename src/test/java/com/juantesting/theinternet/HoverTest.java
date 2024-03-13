package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.home.HomePage;
import com.juantesting.pages.theinternet.hovers.HoversPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1() {
        HomePage homePage = new HomePage(getDriver());
        HoversPage hoverPage = homePage.clickOnHovers();
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigure(1);
        assertTrue("Caption not displayed", caption.isCaptionDisplayed());
        assertEquals("Caption title is incorrect", "name: user1", caption.getTitle());
        assertEquals("Caption Link text is incorrect", caption.getLinkText(), "View profile");
        assertTrue("Link Incorrect", caption.getLink().endsWith("/users/1"));
    }

}
