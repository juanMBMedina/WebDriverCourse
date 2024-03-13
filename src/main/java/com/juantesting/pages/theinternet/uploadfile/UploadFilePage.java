package com.juantesting.pages.theinternet.uploadfile;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFilePage extends BasePage {

    private final By inputField = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By responseField = By.id("uploaded-files");

    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton() {
        clickOn(uploadButton);
    }

    public void uploadFile(String pathOfFile) {
        sendKeys(inputField, pathOfFile);
        clickUploadButton();
    }

    public String getUploadFileText(){
        return getTextFrom(responseField);
    }

}
