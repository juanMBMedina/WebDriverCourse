package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.contextmenu.ContextMenuPage;
import com.juantesting.pages.theinternet.home.HomePage;
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
