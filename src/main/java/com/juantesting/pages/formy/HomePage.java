package com.juantesting.pages.formy;

import static com.juantesting.constants.Constants.TIME_OUT_MILLISECONDS;
import com.juantesting.pages.BaseHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseHomePage {
    protected final String PRINCIPAL_URL = "https://formy-project.herokuapp.com/";
    private final By formLocator = By.cssSelector(":link[class='btn btn-lg'][href='/form']");

    public HomePage(WebDriver driver) {
        super(driver);
        setStrUrl(PRINCIPAL_URL);
        openPage();
    }

    public FormPage clickInForm() {
        clickOn(formLocator);
        getDriver().manage().timeouts().implicitlyWait(TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS);
        return new FormPage(getDriver());
    }
}
