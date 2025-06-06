package com.framework.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {
    }

    private static WebDriver driver = null;

    public static void initDriver() {
        driver = LocalDriverFactory.getDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
