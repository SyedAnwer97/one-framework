package com.framework.driver.managers.web.remote.selenoid;

import com.framework.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidFirefoxManager {

    public static WebDriver getDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(), firefoxOptions);
    }
}
