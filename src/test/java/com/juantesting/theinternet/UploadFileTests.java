package com.juantesting.theinternet;

import com.juantesting.BaseTest;
import com.juantesting.pages.theinternet.HomePage;
import com.juantesting.pages.theinternet.UploadFilePage;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.AssertJUnit.assertEquals;

public class UploadFileTests extends BaseTest {

    @Test
    public void uploadFileSuccessfulTest() {
        File testFile = new File("./src/test/resources/files/uploadFile.txt");
        HomePage homePage = new HomePage(getDriver());
        UploadFilePage uploadFilePage = homePage.clickOnFileUpload();
        uploadFilePage.uploadFile(testFile.getAbsolutePath());
        assertEquals("This name file is wrong", testFile.getName(),
                uploadFilePage.getUploadFileText());

    }

}
