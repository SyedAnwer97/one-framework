package com.framework.driver;

import com.framework.driver.entity.MobileDriverData;
import com.framework.driver.entity.WebDriverData;
import com.framework.driver.factory.DriverFactory;
import com.framework.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.framework.config.factory.ConfigFactory.getConfig;

public final class Driver {

    private Driver() {
    }


    public static void initDriverForWeb() {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
            DriverManager.setDriver(driver);
        }
        loadURL();
    }

    private static void loadURL() {
        DriverManager.getDriver().get(getConfig().webUrl());
        DriverManager.getDriver().manage().window().maximize();
    }

    public static void initDriverForMobile() {
        if (Objects.isNull(DriverManager.getDriver())) {
            MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID, getConfig().mobileRemoteMode());
            WebDriver driver = DriverFactory.getDriverForAndroid(getConfig().runModeMobile()).getDriver(driverData);
            DriverManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }
}
