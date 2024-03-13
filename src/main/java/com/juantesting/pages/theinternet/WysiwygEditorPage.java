package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends BasePage {

    private static final String editorIframeId = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By buttonInDecrease = By.cssSelector("button[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    public void clearTextArea(){
        switchEditArea();
        findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchEditArea();
        findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIdention(){
        clickOn(buttonInDecrease);
    }

    public String getTextFromEditor(){
        switchEditArea();
        String text = findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchEditArea(){
        getDriver().switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        getDriver().switchTo().parentFrame();
    }

}
