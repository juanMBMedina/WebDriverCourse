package com.juantesting.pages.theinternet;

import com.juantesting.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends BasePage {

    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @param index starts at 1
     * @return FigureCaption object
     */
    public FigureCaption hoverOverFigure(int index){
        WebElement figure = getDriver().findElements(figureBox).get(index - 1);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public Boolean isCaptionDisplayed(){
               return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }



    }



}
