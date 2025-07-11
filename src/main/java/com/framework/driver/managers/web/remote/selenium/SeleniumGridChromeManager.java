package com.framework.driver.managers.web.remote.selenium;

import com.framework.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), chromeOptions);
    }
}
