package com.juantesting.pages.theinternet.dorpdown;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage extends BasePage {

    private By dropDownMenu = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> listSelectedElements = findDropDownElement().getAllSelectedOptions();
        return listSelectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(findElement(dropDownMenu));
    }
}
