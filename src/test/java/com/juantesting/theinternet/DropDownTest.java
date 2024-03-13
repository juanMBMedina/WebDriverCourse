package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.dorpdown.DropDownPage;
import com.juantesting.pages.theinternet.home.HomePage;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectOption() {
        String option = "Option 2";
        HomePage homePage = new HomePage(getDriver());
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }

}
