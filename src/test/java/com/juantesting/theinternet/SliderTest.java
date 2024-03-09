package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.HomePage;
import com.juantesting.pages.theinternet.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTest extends BaseTest {
    @Test
    public void testSlider() {
        HomePage homePage = new HomePage(getDriver());
        HorizontalSliderPage horizontalSliderPage = homePage.clickOnHorizontalSlider();
        horizontalSliderPage.moveSliderRight(5);
        assertEquals("This number is wrong","2.5",horizontalSliderPage.getNumberText());
        horizontalSliderPage.moveSliderLeft(3);
        assertEquals("This number is wrong","1",horizontalSliderPage.getNumberText());
    }

}
