package com.framework.driver.factory.mobile.remote;

import com.framework.enums.web.MobilePlatformType;
import com.framework.enums.web.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory() {
    }

    private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobileRemoteModeType.class);

    static {
        MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
        // Need To impl sauce lab
    }

    public static WebDriver getDriver(MobileRemoteModeType mobileRemoteModeType, MobilePlatformType mobilePlatformType) {
        return MAP.get(mobileRemoteModeType).apply(mobilePlatformType);
    }
}
