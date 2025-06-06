package com.framework.driver.managers.web.remote.browserstack;

import com.framework.config.factory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackChromeManager {

    private BrowserStackChromeManager(){}

    public static WebDriver getDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), chromeOptions);
    }
}
