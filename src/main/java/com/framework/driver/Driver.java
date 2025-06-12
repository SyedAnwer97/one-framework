package com.framework.driver;

import com.framework.driver.entity.MobileDriverData;
import com.framework.driver.entity.WebDriverData;
import com.framework.driver.factory.DriverFactory;
import com.framework.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import static com.framework.config.factory.ConfigFactory.getConfig;

public final class Driver {

    private Driver() {
    }


    public static void initDriverForWeb() {
        WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
        WebDriver driver = DriverFactory.getDriverForWeb(getConfig().browserRunMode()).getDriver(driverData);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get("https://www.google.co.in/");
        DriverManager.getDriver().manage().window().maximize();
    }

    public static void initDriverForMobile() {
        MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID, getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory.getDriverForAndroid(getConfig().runModeMobile()).getDriver(driverData);
        DriverManager.setDriver(driver);
    }

    public static void quitDriver() {
        DriverManager.getDriver().quit();
    }
}
