package com.juantesting.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {

    public static void clickOn(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public static void sendKeys(WebDriver driver, By locator, String srtText) {
        driver.findElement(locator).sendKeys(srtText);
    }

    public static String getTextFrom(WebDriver driver, By locator) {
        return driver.findElement(locator).getText();
    }

    public static void goTo(WebDriver driver, String strUrl){
        driver.get(strUrl);
    }

}
