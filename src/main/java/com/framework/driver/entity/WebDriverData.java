package com.framework.driver.entity;

import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
