package com.juantesting.pages.theinternet.frames;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePage {
    private static final String topFrameName = "frame-top";
    private static final String bottomFrameName = "frame-bottom";

    private static final String leftFrameName = "frame-left";
    private static final By nestedFrameBody = By.tagName("body");
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public void switchTopFrame(){
        getDriver().switchTo().frame(topFrameName);
    }

    public void switchLeftFrame(){
        getDriver().switchTo().frame(leftFrameName);
    }

    public void switchBottomFrame(){
        getDriver().switchTo().frame(bottomFrameName);
    }

    public String getTextFrameLeft(){
        switchTopFrame();
        switchLeftFrame();
        return getTextFrom(nestedFrameBody);
    }

    public String getTextFrameBottom(){
        switchBottomFrame();
        return getTextFrom(nestedFrameBody);
    }

}
