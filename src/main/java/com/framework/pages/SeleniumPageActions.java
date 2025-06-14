package com.framework.pages;

import com.framework.driver.managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumPageActions {

    private static WebDriver driver;

    public SeleniumPageActions() {
        this.driver = DriverManager.getDriver();
    }

    public static void waitAndClick(By by) {
        driver.findElement(by).click();
    }

    public static void waitAndSendKey(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }
}
