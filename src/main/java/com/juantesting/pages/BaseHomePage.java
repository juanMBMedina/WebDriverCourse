package com.juantesting.pages;

import org.openqa.selenium.WebDriver;

public abstract class BaseHomePage extends BasePage {
    private String strUrl;

    public BaseHomePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        goTo(getStrUrl());
    }

    public String getStrUrl() {
        return strUrl;
    }

    protected void setStrUrl(String strUrl) {
        this.strUrl = strUrl;
    }
}
