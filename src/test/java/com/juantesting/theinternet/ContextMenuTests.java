package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.ContextMenuPage;
import com.juantesting.pages.theinternet.HomePage;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {


    @Test
    public void confirmAlertInContextMenu(){
        HomePage hp = new HomePage(getDriver());
        ContextMenuPage cmp = hp.clickOnContextMenu();
        cmp.clickRightClickInBox();
        cmp.confirmAlert();

    }


}
