package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage extends BasePage {
    private final By boxLocator = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void clickRightClickInBox(){
        rightClickOn(boxLocator);
    }


}
