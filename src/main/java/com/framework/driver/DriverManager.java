package com.framework.driver;

import com.framework.enums.Platform;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public final class DriverManager {

    private DriverManager() {
    }

    private static final ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
    private static final ThreadLocal<WebDriver> MOBILE_DRIVER_THREAT_LOCAL = new ThreadLocal<>();

    private static final ThreadLocal<Platform> CONTEXT = ThreadLocal.withInitial(() -> Platform.WEB);
    private static final Map<Platform, ThreadLocal<WebDriver>> DRIVER_MAP = new EnumMap<>(Platform.class);


    public static void setDriver(WebDriver driver) {
        if (isMobileDriver(driver)) {
            MOBILE_DRIVER_THREAT_LOCAL.set(driver);
            CONTEXT.set(Platform.WEB);
            DRIVER_MAP.put(Platform.MOBILE, MOBILE_DRIVER_THREAT_LOCAL);
        } else {
            WEB_DRIVER_THREAD_LOCAL.set(driver);
            DRIVER_MAP.put(Platform.WEB, WEB_DRIVER_THREAD_LOCAL);
            CONTEXT.set(Platform.WEB);
        }
    }

    public static WebDriver getDriver() {
        return CONTEXT.get() == Platform.WEB
                ? WEB_DRIVER_THREAD_LOCAL.get()
                : MOBILE_DRIVER_THREAT_LOCAL.get();
    }

    public static void unloadDriver() {
        WEB_DRIVER_THREAD_LOCAL.remove();
        MOBILE_DRIVER_THREAT_LOCAL.remove();
        CONTEXT.remove();
    }

    private static boolean isMobileDriver(WebDriver driver) {
        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
    }
}
