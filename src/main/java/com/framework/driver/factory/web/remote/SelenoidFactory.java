package com.framework.driver.factory.web.remote;

import com.framework.driver.managers.web.remote.selenoid.SelenoidChromeManager;
import com.framework.driver.managers.web.remote.selenoid.SelenoidFirefoxManager;
import com.framework.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {

    private SelenoidFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, SelenoidChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, SelenoidFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}
