package com.framework.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {
    }

    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        THREAD_LOCAL.set(driver);
    }

    public static WebDriver getDriver() {
        return THREAD_LOCAL.get();
    }

    public static void unloadDriver() {
        THREAD_LOCAL.remove();
    }
}
