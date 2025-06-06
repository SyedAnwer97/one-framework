package com.framework.driver.managers.web.remote.browserstack;

import com.framework.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackFirefoxManager {

    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), firefoxOptions);
    }
}
