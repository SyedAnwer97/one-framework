package com.framework.driver.impl.mobile;

import com.framework.driver.interfaces.IMobileDriver;
import com.framework.driver.entity.MobileDriverData;
import com.framework.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
    }
}
