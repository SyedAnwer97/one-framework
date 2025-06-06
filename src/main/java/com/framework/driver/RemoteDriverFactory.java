package com.framework.driver;

import com.framework.config.ConfigFactory;
import com.framework.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver() {
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();
        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {

        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {

        } else {

        }
        return null;
    }
}
