package com.framework.driver.web.remote;

import com.framework.driver.managers.web.remote.browserstack.BrowserStackChromeManager;
import com.framework.driver.managers.web.remote.browserstack.BrowserStackFirefoxManager;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? BrowserStackChromeManager.getDriver()
                : BrowserStackFirefoxManager.getDriver();
    }
}
