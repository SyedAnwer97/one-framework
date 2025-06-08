package com.framework.driver.managers.mobile.remote;

import com.framework.config.factory.BrowserStackConfigFactory;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {

    private BrowserStackAndroidManager() {
    }

    public static WebDriver getDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(Platform.ANDROID.name());
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("framework_android_test");
        options.setApp(System.getProperty("user.dir") + "/mobile_apps/mda-2.2.0-25.apk");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), options);
    }
}
