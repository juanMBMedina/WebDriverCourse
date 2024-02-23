package com.juantesting.pages;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {

    private WebDriver driver;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

}