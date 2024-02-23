package com.juantesting;

import com.juantesting.pages.HomePage;
import com.juantesting.pages.LoginPage;
import com.juantesting.pages.SecureAreaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static com.juantesting.constants.ChromeDriverSettings.CHROME_BINARIES_PATH;
import static com.juantesting.constants.ChromeDriverSettings.CHROME_DRIVER_PATH;

public class BaseTest {

    private WebDriver driver;
    private String urlOfCourse = "https://the-internet.herokuapp.com/";

    public static void main(String args[]) {
        BaseTest test = new BaseTest();
        test.setUp();
        // test.courseClassMethod();
        // test.exerciseMethod();
        test.loginExercise();
    }

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions co = new ChromeOptions();
        co.setBinary(CHROME_BINARIES_PATH);
        driver = new ChromeDriver(co);
    }

    public void courseClassMethod() {
        driver.get(urlOfCourse);
        // Get all Elements with Tag
        String strTag = "a";
        List<WebElement> listLinks = driver.findElements(By.tagName(strTag));
        System.out.println("You have " + listLinks.size() + " elements with tag name: " + strTag);
        // Select Web element with Click
        WebElement inputsLink = driver.findElement(By.linkText("Inputs!"));
        inputsLink.click();
    }

    public void exerciseMethod() {
        String strTagName = "Qes";
        driver.get(urlOfCourse);
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> listLiInPage = driver.findElements(By.tagName(strTagName));
        System.out.println("You have (" + listLiInPage.size() + ") elements with tag name: " + strTagName);
    }

    public void loginExercise(){
        HomePage homePage = new HomePage(driver);
        homePage.open();
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        System.out.println(secureAreaPage.getAlertText());
    }

}
