package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.dynamic.DynamicLoadingExample1Page;
import com.juantesting.pages.theinternet.dynamic.DynamicLoadingExample2Page;
import com.juantesting.pages.theinternet.dynamic.DynamicLoadingPage;
import com.juantesting.pages.theinternet.home.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void runExample1Successful() {
        HomePage hp = new HomePage(getDriver());
        DynamicLoadingPage dynamicMenu = hp.clickOnDynamicLoad();
        DynamicLoadingExample1Page dynamicExample1 = dynamicMenu.clickExample1();
        dynamicExample1.clickStartButton();
        assertEquals(dynamicExample1.getFinishText(), "Hello World!", "This text is wrong !");
    }

    @Test
    public void runExample2Successful() {
        HomePage hp = new HomePage(getDriver());
        DynamicLoadingPage dynamicMenu = hp.clickOnDynamicLoad();
        DynamicLoadingExample2Page dynamicExample2 = dynamicMenu.clickExample2();
        dynamicExample2.clickStartButton();
        assertEquals(dynamicExample2.getFinishText(), "Hello World!", "This text is wrong !");
    }

}
