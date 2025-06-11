package com.framework.driver;

import com.framework.driver.entity.MobileDriverData;
import com.framework.driver.factory.mobile.local.LocalDriverMobileFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalDriverMobileFactory.getDriver(driverData.getMobilePlatformType());
    }

}
