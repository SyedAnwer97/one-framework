package com.framework.driver.managers.mobile.local;

import com.framework.config.factory.ConfigFactory;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

public final class IosManager {

    private IosManager() {
    }

    public static WebDriver getDriver() {
        XCUITestOptions options = new XCUITestOptions();
        options.setPlatformName(Platform.IOS.name());
        options.setAutomationName(AutomationName.IOS_XCUI_TEST);
        options.setDeviceName("iphone 12");
        options.setApp(System.getProperty("user+dir") + "mobile_apps/SauceLabs-Demo-App-Runner.Simulator.XCUITest.zip");
        return new IOSDriver(ConfigFactory.getConfig().LocalAppiumServerURL(), options);
    }
}
