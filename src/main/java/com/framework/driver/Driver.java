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

    private static WebDriver driver = null;

    public static void initDriverForWeb() {
        WebDriverData driverData = WebDriverData.builder().
                browserType(getConfig().browser())
                .browserRemoteModeType(getConfig().browserRemoteMode())
                .runModeType(getConfig().browserRunMode())
                .build();
        driver = DriverFactory.getDriverForWeb(driverData);
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    public static void initDriverForMobile() {
        MobileDriverData driverData = MobileDriverData.builder()
                .mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteModeType(getConfig().mobileRemoteMode())
                .runModeType(getConfig().runModeMobile())
                .build();
        driver = DriverFactory.getDriverForAndroid(driverData);
    }

    public static void quitDriver() {
        driver.quit();
    }
}
