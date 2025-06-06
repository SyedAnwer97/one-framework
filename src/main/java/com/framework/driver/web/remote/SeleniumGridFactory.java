package com.framework.driver.web.remote;

import com.framework.driver.managers.web.remote.selenium.SeleniumGridChromeManager;
import com.framework.driver.managers.web.remote.selenium.SeleniumGridFirefoxManager;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();

    }
}
