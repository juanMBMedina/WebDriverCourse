package com.juantesting.pages.formy;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.juantesting.constants.Constants.TIME_OUT_MILLISECONDS;

public class FormPage extends BasePage {

    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By jobTitleField = By.id("job-title");
    private final By highSchoolRadioButton = By.cssSelector("input[value='radio-button-1']");
    private final By maleCheckBox = By.id("checkbox-1");
    private final By selectOption = By.id("select-menu");
    private final By groupOptions = By.cssSelector("option[value]");
    private final By dateField = By.id("datepicker");
    private final By submitButton = By.xpath("//a[text()='Submit']");

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void sendFirstName(String firstName) {
        sendKeys(firstNameField, firstName);
    }

    public void sendLastName(String lastName) {
        sendKeys(lastNameField, lastName);
    }

    public void sendJobTitle(String jobTitle) {
        sendKeys(jobTitleField, jobTitle);
    }

    public void selectHighSchool(){
        clickOn(highSchoolRadioButton);
    }
    public void selectMaleOption(){
        clickOn(maleCheckBox);
    }

    public void selectExperience(){
        clickOn(selectOption);
        getDriver().findElements(groupOptions).get(1).click();
    }

    public void sendDate(String strDate){
        // Date format: mm/dd/yyyy
        sendKeys(dateField, strDate);
    }

    public ThanksPage clickOnSubmit(){
        clickOn(submitButton);
        getDriver().manage().timeouts().implicitlyWait(TIME_OUT_MILLISECONDS, TimeUnit.MILLISECONDS);
        return new ThanksPage(getDriver());
    }
}
