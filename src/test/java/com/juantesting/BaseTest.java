package com.juantesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.juantesting.constants.ChromeDriverSettings.CHROME_BINARIES_PATH;
import static com.juantesting.constants.ChromeDriverSettings.CHROME_DRIVER_PATH;

public class BaseTest {

    private WebDriver driver;

    public static void main(String args[]) {
        BaseTest test = new BaseTest();
        test.setUp();
    }

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions co = new ChromeOptions();
        co.setBinary(CHROME_BINARIES_PATH);
        driver = new ChromeDriver(co);
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }

}
