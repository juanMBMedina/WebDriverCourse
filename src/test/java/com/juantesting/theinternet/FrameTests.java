package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.HomePage;
import com.juantesting.pages.theinternet.WysiwygEditorPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg(){
        HomePage hp = new HomePage(getDriver());
        WysiwygEditorPage editorPage = hp.clickOnFrameMenu();
        String text1 = "Hello ";
        String text2 = "World ";

        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.decreaseIdention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(),text1+text2,"Incorrect text");

    }

}
