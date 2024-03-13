package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.home.HomePage;
import com.juantesting.pages.theinternet.frames.NestedFramesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTest {

    @Test
    public void validateTextInLeftFrame() {
        HomePage hp = new HomePage(getDriver());
        NestedFramesPage nestFramesPg = hp.clickOnFramesNested();
        assertEquals(nestFramesPg.getTextFrameLeft(), "LEFT", "This text is wrong");
    }

    @Test
    public void validateTextInBottomFrame() {
        HomePage hp = new HomePage(getDriver());
        NestedFramesPage nestFramesPg = hp.clickOnFramesNested();
        assertEquals(nestFramesPg.getTextFrameBottom(), "BOTTOM", "This text is wrong");
    }

}
