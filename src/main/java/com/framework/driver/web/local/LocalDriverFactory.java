package com.framework.driver.web.local;

import com.framework.driver.managers.web.local.ChromeManager;
import com.framework.driver.managers.web.local.FireFoxManager;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return isBrowserChrome(browserType)
                ? ChromeManager.getDriver()
                : FireFoxManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }
}
