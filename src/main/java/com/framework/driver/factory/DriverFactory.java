package com.framework.driver.factory;

import com.framework.driver.LocalMobileDriverImpl;
import com.framework.driver.LocalWebDriverImpl;
import com.framework.driver.RemoteMobileDriverImpl;
import com.framework.driver.RemoteWebDriverImpl;
import com.framework.driver.entity.MobileDriverData;
import com.framework.driver.entity.WebDriverData;
import com.framework.enums.RunModeType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriverForWeb(WebDriverData webDriverData) {
        return webDriverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalWebDriverImpl().getDriver(webDriverData)
                : new RemoteWebDriverImpl().getDriver(webDriverData);
    }

    public static WebDriver getDriverForAndroid(MobileDriverData mobileDriverData) {
        return mobileDriverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);

    }
}