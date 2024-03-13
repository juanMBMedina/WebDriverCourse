package com.juantesting.pages.theinternet.dynamic;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingExample1Page extends BasePage {
    private static final By startButton = By.cssSelector("div#start button");
    private static final By loadingIndicator = By.cssSelector("div#loading");
    private static final By finishText = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        clickOn(startButton);
        WebElement tempElement = findElement(loadingIndicator);
        getWait(10).until(ExpectedConditions.invisibilityOf(tempElement));
        /*
        FluentWait wait = new FluentWait(getDriver()).withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(1))
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(tempElement));
        */

    }

    public String getFinishText() {
        return getTextFrom(finishText);
    }

}
