package com.juantesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.juantesting.constants.ChromeDriverSettings.CHROME_BINARIES_PATH;
import static com.juantesting.constants.ChromeDriverSettings.CHROME_DRIVER_PATH;

public class BaseTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions co = new ChromeOptions();
        co.setBinary(CHROME_BINARIES_PATH);
        driver = new ChromeDriver(co);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    public WebDriver getDriver() {
        return driver;
    }
}
