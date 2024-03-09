package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends BasePage {

    private final By slider = By.cssSelector("div.sliderContainer input[type='range']");
    private final By sliderSpan = By.cssSelector("div.sliderContainer span#range");


    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public String getNumberText(){
        return getTextFrom(sliderSpan);
    }

    public void moveSliderRight(Integer steps) {
        for (int i = 1; i <= steps; i++) {
            sendKeys(slider, String.valueOf(Keys.RIGHT));
        }
    }

    public void moveSliderLeft(Integer steps) {
        for (int i = 1; i <= steps; i++) {
            sendKeys(slider, String.valueOf(Keys.LEFT));
        }
    }

}
