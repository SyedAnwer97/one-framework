package com.framework.driver;

import com.framework.driver.entity.WebDriverData;
import com.framework.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(),
                driverData.getBrowserType());
    }

}
