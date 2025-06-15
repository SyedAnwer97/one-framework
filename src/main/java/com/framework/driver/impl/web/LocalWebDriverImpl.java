package com.framework.driver.impl.web;

import com.framework.driver.interfaces.IWebDriver;
import com.framework.driver.entity.WebDriverData;
import com.framework.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
