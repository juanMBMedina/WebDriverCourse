package com.juantesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.juantesting.constants.Constants.TIME_WAIT_SECONDS;

public abstract class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickOn(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator, String srtText) {
        driver.findElement(locator).sendKeys(srtText);
    }

    public Wait<WebDriver> getWait(Integer timeInSeconds){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(timeInSeconds));
    }

    public String getTextFrom(By locator) {
        return driver.findElement(locator).getText();
    }

    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void goTo(String strUrl) {
        driver.get(strUrl);
    }

    public Boolean isDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    public void confirmAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public void writeInAlert(String strText) {
        getDriver().switchTo().alert().sendKeys(strText);
    }

    public String getTextOfAlert() {
        return getDriver().switchTo().alert().getText();
    }

}
