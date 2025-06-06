package com.framework.driver;

import com.framework.config.ConfigFactory;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver;
        if (isBrowserChrome()) {
            driver = ChromeManager.getDriver();
        } else {
            driver = FireFoxManager.getDriver();
        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
