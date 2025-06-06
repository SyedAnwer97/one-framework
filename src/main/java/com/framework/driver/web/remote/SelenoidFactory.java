package com.framework.driver.web.remote;

import com.framework.driver.managers.web.remote.selenoid.SelenoidChromeManager;
import com.framework.driver.managers.web.remote.selenoid.SelenoidFirefoxManager;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ?
                SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();
    }
}
