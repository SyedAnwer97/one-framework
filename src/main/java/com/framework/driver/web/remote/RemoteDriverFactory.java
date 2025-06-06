package com.framework.driver.web.remote;

import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK) {
            return BrowserStackFactory.getDriver(browserType);
        }
        return null;
    }
}
