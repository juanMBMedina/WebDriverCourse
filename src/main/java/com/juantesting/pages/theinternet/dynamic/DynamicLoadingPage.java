package com.juantesting.pages.theinternet.dynamic;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {
    private static final String linkXpath_Format = "//a[contains(text(), '%s')]";
    private static final By linkExample1 = By.xpath(String.format(linkXpath_Format,"Example 1"));
    private static final By linkExample2 = By.xpath(String.format(linkXpath_Format,"Example 2"));
    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingExample1Page clickExample1(){
        clickOn(linkExample1);
        return new DynamicLoadingExample1Page(getDriver());
    }

    public DynamicLoadingExample2Page clickExample2(){
        clickOn(linkExample2);
        return new DynamicLoadingExample2Page(getDriver());
    }
}
