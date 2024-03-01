package com.juantesting.formy;

import com.juantesting.BaseTest;
import com.juantesting.pages.formy.FormPage;
import com.juantesting.pages.formy.HomePage;
import com.juantesting.pages.formy.ThanksPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FormTest extends BaseTest {

    @Test
    public void formSuccessfulyTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openPage();
        FormPage formPage = homePage.clickInForm();
        formPage.sendFirstName("Juan");
        formPage.sendLastName("Blanco");
        formPage.sendJobTitle("Automatizador");
        formPage.selectHighSchool();
        formPage.selectMaleOption();
        formPage.selectExperience();
        formPage.sendDate("23/02/2024");
        ThanksPage finalPage = formPage.clickOnSubmit();
        assertEquals(finalPage.getSuccessfulText(),"The form was successfully submitted!","Error please" +
                " check");


    }

}
