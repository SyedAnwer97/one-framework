package com.framework.driver;

import com.framework.config.factory.ConfigFactory;
import com.framework.driver.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver() {
    }

    private static WebDriver driver = null;

    public static void initDriver() {
        driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
